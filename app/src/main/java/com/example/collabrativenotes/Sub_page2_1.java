package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sub_page2_1 extends AppCompatActivity {
    Button b1;
    ImageView i1,i2,i3,i4,i5,i6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_page2_1);
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
                Intent back=new Intent(Sub_page2_1.this,Sub_page2.class);
                startActivity(back);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Sub_page2_1.this,Pdfview.class);
                startActivity(back);
            }
        });





    }
}