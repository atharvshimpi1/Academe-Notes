package com.example.collabrativenotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Home_page extends AppCompatActivity {


    Button b1, b2, b3, b4;
    // Variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        // Initialize views
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationview);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

        bottomNavigationView.setOnItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.bottom_home) {
                return true;
            } else if (menuItem.getItemId() == R.id.bottom_add) {
                startActivity(new Intent(getApplicationContext(), Raise_query.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (menuItem.getItemId() == R.id.bottom_person) {
                startActivity(new Intent(getApplicationContext(), profileuser.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });
        // Set onClickListeners for buttons
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_page.this, Sub_pages1.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_page.this, Sub_pages2.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_page.this, Sub_page3.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_page.this, Sub_page4.class);
                startActivity(intent);
            }
        });

        View headerView = navigationView.getHeaderView(0);
        ImageView userImage = headerView.findViewById(R.id.userImage);
        TextView textUsername  = headerView.findViewById(R.id.textUsername);

        userImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_page.this, ""+ textUsername.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        // Set navigation item selected listener
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.nav_home) {
                    Toast.makeText(Home_page.this, "Going To Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawers();
                    return true;

                }
                if (itemId == R.id.nav_setting) {
                    Intent intent = new Intent(Home_page.this, setting.class);
                    startActivity(intent);
                    Toast.makeText(Home_page.this, "Opening Setting", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawers();
                    return true;
                }
                if (itemId == R.id.nav_aboutus) {
                    Intent intent = new Intent(Home_page.this,aboutus.class);
                    startActivity(intent);
                    Toast.makeText(Home_page.this, "About Us", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawers();
                    return true;
                }
                if (itemId == R.id.nav_logout) {
                    // Clear login state in SharedPreferences
                    SharedPreferences sharedPreferences = getSharedPreferences("MyAppPrefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("isLoggedIn", false);
                    editor.apply();

                    // Redirect to Login screen and clear activity stack
                    Intent intent = new Intent(Home_page.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);

                    // Show logout success message
                    Toast.makeText(Home_page.this, "Logout Successfully", Toast.LENGTH_SHORT).show();

                    // Close the navigation drawer
                    drawerLayout.closeDrawers();

                    return true;
                }
                return false;

            }
        });
    }
}
