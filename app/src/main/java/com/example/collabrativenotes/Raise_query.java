package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Raise_query extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_file_upload);

        bottomNavigationView.setOnItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.bottom_home) {
                startActivity(new Intent(getApplicationContext(), Home_page.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (menuItem.getItemId() == R.id.bottom_add) {

                return true;
            } else if (menuItem.getItemId() == R.id.bottom_person) {
                startActivity(new Intent(getApplicationContext(), profileuser.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });
        Button yourButton = findViewById(R.id.buttonSend);
        yourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Raise_query.this, "Query sended", Toast.LENGTH_SHORT).show();
            }
        });
    }
}