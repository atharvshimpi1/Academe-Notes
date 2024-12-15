package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Sub_page1 extends AppCompatActivity {
    Button b1,b2;
    ImageView i1,i2,i3,i4,i5,i6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_page1);
        b1=findViewById(R.id.back);
        b2=findViewById(R.id.next);
        i1=findViewById(R.id.imageView);
        i2=findViewById(R.id.imageView2);
        i3=findViewById(R.id.imageView3);
        i4=findViewById(R.id.imageView4);
        i5=findViewById(R.id.imageView5);
        i6=findViewById(R.id.imageView6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_page1.this,Home_page.class);
                startActivity(back);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_page1.this,Sub_page1_1.class);
                startActivity(back);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_page1.this,Pdfview.class);
                startActivity(back);
            }
        });





    }
}