package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.net.Uri;

public class Sub_pages2 extends AppCompatActivity {
    Button b1;
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_pages2);
        b1=findViewById(R.id.back);
        i1=findViewById(R.id.imageView);
        i2=findViewById(R.id.imageView2);
        i3=findViewById(R.id.imageView3);
        i4=findViewById(R.id.imageView4);
        i5=findViewById(R.id.imageView5);
        i6=findViewById(R.id.imageView6);
        i7=findViewById(R.id.imageView7);
        i8=findViewById(R.id.imageView8);
        i9=findViewById(R.id.imageView9);
        i10=findViewById(R.id.imageView10);
        i11=findViewById(R.id.imageView11);
        i12=findViewById(R.id.imageView12);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages2.this,Home_page.class);
                startActivity(back);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/12_wFZgvvP9a6KqSN87MACBfBcnm-C0MI?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1QSmQ1XK3J9VdnnnaUpGI4KSAy-w0eMtK?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1aHgVSTFyLWXgxvL1gJcv5c1MltxPRqZf?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1u9Kas2J7_8pO5YVPtQJj9weyxXfEEF0o?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1iVBVjtyAdkLdOe0FyI82gwCrHNFKLr4v?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1TkRA5VVJcwYc0RG1V1uYdiYCUXJ1Vy4a?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1K6yNtaP5brELBbYroyLqORTUpNKm2Urh?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1n_kAYGqg06oLKcNzMxb0TudFM5jAQeeO?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1-GdfJxEpT0W2R9gHh7hyJ_jMHjOVB1tN?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1MqcgkwFGcHG7U_91g5ijcx2Ruqb108_9?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1zwXqqnOr7BxCRJjpkh5OHdCbYCHREoAc?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1sz4k5p9fwglleWhDYcMnhjeUD1JfsHMi?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });







    }
}