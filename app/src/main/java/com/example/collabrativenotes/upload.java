package com.example.collabrativenotes;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class upload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_upload);

        // Setup BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_file_upload);

        bottomNavigationView.setOnItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.bottom_home) {
                startActivity(new Intent(getApplicationContext(), Home_page.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (menuItem.getItemId() == R.id.bottom_add) {
                startActivity(new Intent(getApplicationContext(), Raise_query.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (menuItem.getItemId() == R.id.bottom_file_upload) {
                // Handle any necessary action related to file upload
                // For example, you could refresh the current activity or perform specific tasks related to file uploading
                return true;
            } else if (menuItem.getItemId() == R.id.bottom_person) {
                startActivity(new Intent(getApplicationContext(), profileuser.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });
    }
}
