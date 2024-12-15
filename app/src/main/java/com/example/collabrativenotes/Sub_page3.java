package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sub_page3 extends AppCompatActivity {
    Button b1;
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_page3);
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
                Intent back=new Intent(Sub_page3.this,Home_page.class);
                startActivity(back);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1vcMR9q0zAkBVV99ILBD3QPxBxa3xiofa?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/19lHPa0PQbXp2sRTKSoYBVrKvDCwPmRA-?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1yYKfeOYaQ8TotQHgek5aevjFD0DxPR73?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1yYKfeOYaQ8TotQHgek5aevjFD0DxPR73?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1ua76sECu9ziWN4VT8AgH_Q-K46jIyals?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1XEXoFz8iTYQdJVzB6iHkOar6LuH2Sl91?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1HjT6vTjOhlFJZtCsEwznEQ6S1GKhQOol?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1S9wYoEhse8GgEswEEOnRtLB3BpByKlZ0?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1pRrKzQgM-U6o012G-cib4y9b6xX8JZ1b?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1qt-4d7WP1TZV3osVP0VV7yOKdjtjLhpo?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1neIKYphb-eZJXioNJbtNSRzVr_PafTi8?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1GXnTqJAAKt6LMr9DGU57DLLTxhlpWlB8?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });






    }
}