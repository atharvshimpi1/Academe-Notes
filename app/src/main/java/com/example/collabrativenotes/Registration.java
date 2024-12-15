package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;
import android.os.Bundle;

public class Registration extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    private EditText emailEditText;
    private EditText nameEditText;
    private EditText passwordEditText;
    private Button registerButton;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        mAuth = FirebaseAuth.getInstance();

        emailEditText = findViewById(R.id.editTextEmail);
        passwordEditText = findViewById(R.id.editTextPassword);
        nameEditText=findViewById(R.id.editTextName);
        registerButton = findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                registerUser();
            }
        });
    }

    private void registerUser() {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Registration.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Registration.this, Stud_details.class);
                            startActivity(intent);
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                        } else {
                            try {
                                throw task.getException();
                            } catch (FirebaseAuthException e) {
                                if (e.getErrorCode().equals("weak-password")) {
                                    Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(Registration.this, "The password provided is too weak.", Toast.LENGTH_SHORT).show();
                                } else if (e.getErrorCode().equals("email-already-in-use")) {
                                    Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(Registration.this, "The email address is already in use by another account.", Toast.LENGTH_SHORT).show();
                                } else {
                                    Log.e(TAG, "createUserWithEmail:failure", task.getException());
                                    Log.e(TAG, e.getErrorCode());
                                    Toast.makeText(Registration.this, "Registration failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            } catch (Exception e) {
                                Log.e(TAG, "createUserWithEmail:failure", task.getException());
                                Log.e(TAG, e.getMessage());
                                Toast.makeText(Registration.this, "Registration failed: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });
    }
}