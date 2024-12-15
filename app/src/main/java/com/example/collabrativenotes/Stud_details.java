package com.example.collabrativenotes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;
import java.util.Map;

public class Stud_details extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;
    private EditText e1, e2, e3, e4;

    private ImageView profileImageView;
    private Uri mImageUri;
    private StorageReference mStorageRef;
    private UploadTask uploadTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_details);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
        mStorageRef = FirebaseStorage.getInstance().getReference("profile_pictures");

        e1 = findViewById(R.id.editTextname);
        e2 = findViewById(R.id.editTextsap);
        e3 = findViewById(R.id.editTextyear);
        e4 = findViewById(R.id.editTextbranch);
        profileImageView = findViewById(R.id.profile_image);
        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFileChooser();
            }
        });

        // Save Button OnClickListener
        findViewById(R.id.buttonsubmit).setOnClickListener(view -> {
            saveDetails();
        });
    }

    private void openFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null) {
            mImageUri = data.getData();
            profileImageView.setImageURI(mImageUri);
        }
    }

    private void uploadImage(String userEmail) {
        if (mImageUri != null) {
            StorageReference fileReference = mStorageRef.child(System.currentTimeMillis()
                    + "." + getFileExtension(mImageUri));
            uploadTask = (UploadTask) fileReference.putFile(mImageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            fileReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri downloadUri) {
                                    saveDetails(userEmail, downloadUri.toString());
                                }
                            });
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Stud_details.this, "Upload failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        } else {
            saveDetails(userEmail, null);
        }
    }


    // Method to save student details to Firestore
    private void saveDetails() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            String userEmail = currentUser.getEmail();
            uploadImage(userEmail);
        } else {
            Toast.makeText(this, "User not logged in", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveDetails(String userEmail, String imageUrl) {
        String name = e1.getText().toString().trim();
        String sapId = e2.getText().toString().trim();
        String year = e3.getText().toString().trim();
        String branch = e4.getText().toString().trim();

        // Check if any field is empty
        if (name.isEmpty() || sapId.isEmpty() || year.isEmpty() || branch.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Create a document reference in the 'students' collection with the user's email as the document ID
        DocumentReference studentRef = db.collection("students").document(userEmail);

        // Create a map to store student data
        Map<String, Object> studentData = new HashMap<>();
        studentData.put("name", name);
        studentData.put("sapId", sapId);
        studentData.put("year", year);
        studentData.put("branch", branch);
        if (imageUrl != null) {
            studentData.put("profilePictureUrl", imageUrl);
        }

        // Save the data to Firestore
        studentRef.set(studentData)
                .addOnSuccessListener(aVoid -> {
                    // Data successfully saved
                    Toast.makeText(Stud_details.this, "Student details saved successfully", Toast.LENGTH_SHORT).show();
                    Intent home = new Intent(Stud_details.this, Home_page.class);
                    startActivity(home);
                    // You can perform further actions here if needed
                })
                .addOnFailureListener(e -> {
                    // Handle the error
                    Toast.makeText(Stud_details.this, "Failed to save student details: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }

    private String getFileExtension(Uri uri) {
        return "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(getContentResolver().getType(uri));
    }
}
