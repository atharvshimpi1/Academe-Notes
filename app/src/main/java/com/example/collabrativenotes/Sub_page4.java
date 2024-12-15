package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sub_page4 extends AppCompatActivity {
    Button b1;
    ImageView i1,i2,i3,i4,i5,i6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_page4);
        b1=findViewById(R.id.back);
        i1=findViewById(R.id.imageView);
        i2=findViewById(R.id.imageView2);
        i3=findViewById(R.id.imageView3);
        i4=findViewById(R.id.imageView4);
        i5=findViewById(R.id.imageView5);
        i6=findViewById(R.id.imageView6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_page4.this,Home_page.class);
                startActivity(back);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/15uDFt4GTNL4BPFZHx2JDojCCY5s04qEo?usp=drive_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1k4DkvnjVJOUPOKpVB2xiZLDO4hqDdDtL?usp=drive_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1sxl4k44Zsr7MTzYRg8ZcBvKKCmGz_gC8?usp=drive_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1L--sc58C5F37yDuKd-H6RApkvsdU63Hj?usp=drive_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1MCnfw1Rb0Js9SdbInyu8teNzIHi12Imo?usp=drive_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });





    }
}