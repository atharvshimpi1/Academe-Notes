package com.example.collabrativenotes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class profileuser extends AppCompatActivity {

    private FirebaseFirestore db;
    private TextView usernameTextView, sapTextView, yearTextView, branchTextView;
    private ImageView profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileuser);

        db = FirebaseFirestore.getInstance();

        // Initialize views
        usernameTextView = findViewById(R.id.profile_name);
        sapTextView = findViewById(R.id.sap);
        yearTextView = findViewById(R.id.year);
        branchTextView = findViewById(R.id.branch);
        profileImageView = findViewById(R.id.profile_image);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_file_upload);
        bottomNavigationView.setOnItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.bottom_home) {
                Intent intent = new Intent(profileuser.this, Home_page.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            if (menuItem.getItemId() == R.id.bottom_add) {
                Intent intent = new Intent(profileuser.this, Raise_query.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            if (menuItem.getItemId() == R.id.bottom_person) {

                return true;
            }
            return false;
        });

        // Retrieve user data from Firestore
        retrieveUserData();
    }


    private void retrieveUserData() {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser != null) {
            String userId = currentUser.getEmail();
            db.collection("students").document(userId).get()
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();
                            if (document.exists()) {
                                String username = document.getString("name");
                                String sapId = document.getString("sapId"); // Retrieve sapId instead of sap
                                String year = document.getString("year");
                                String branch = document.getString("branch");
                                String imageUrl = document.getString("profilePictureUrl");

                                // Create a Student object
                                Student student = new Student(username, sapId, Integer.parseInt(year), branch, imageUrl);

                                // Set retrieved information to TextViews and ImageView
                                usernameTextView.setText(student.getName());
                                sapTextView.setText("SAP: " + student.getSapId());
                                yearTextView.setText("Year: " + student.getYear());
                                branchTextView.setText("Branch: " + student.getBranch());
                                Picasso.get().load(student.getProfilePictureUrl()).into(profileImageView);
                            } else {
                                Toast.makeText(profileuser.this, "Document does not exist", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(profileuser.this, "Failed to retrieve user data: " + Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        } else {
            Toast.makeText(profileuser.this, "User not logged in", Toast.LENGTH_SHORT).show();
        }
    }
}
