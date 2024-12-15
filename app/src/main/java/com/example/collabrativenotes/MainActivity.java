package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Check if the onboarding screen should be skipped
        SharedPreferences sharedPreferences = getSharedPreferences("MyAppPrefs", MODE_PRIVATE);
        boolean isFirstLaunch = sharedPreferences.getBoolean("isFirstLaunch", true);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);

        if (!isFirstLaunch) {
            // If onboarding is already shown, check login state
            if (isLoggedIn) {
                // User already logged in, redirect to Home Page
                startActivity(new Intent(MainActivity.this, Home_page.class));
            }
        }

        // Set the onboarding layout
        setContentView(R.layout.activity_main);

        // Find the button and handle onboarding completion
        Button myButton = findViewById(R.id.login);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save that onboarding has been shown
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isFirstLaunch", false);
                editor.apply();

                // Redirect to the Login screen
                Intent login = new Intent(MainActivity.this, Login.class);
                startActivity(login);
                finish();
            }
        });
    }
}
