package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sub_pages1 extends AppCompatActivity {
    Button b1;
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_pages1);
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
                Intent back=new Intent(Sub_pages1.this,Home_page.class);
                startActivity(back);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview.class);
                startActivity(back);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview2.class);
                startActivity(back);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview3.class);
                startActivity(back);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview4.class);
                startActivity(back);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview5.class);
                startActivity(back);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview6.class);
                startActivity(back);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview7.class);
                startActivity(back);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview8.class);
                startActivity(back);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview9.class);
                startActivity(back);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview10.class);
                startActivity(back);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview11.class);
                startActivity(back);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_pages1.this,Pdfview12.class);
                startActivity(back);
            }
        });





    }
}