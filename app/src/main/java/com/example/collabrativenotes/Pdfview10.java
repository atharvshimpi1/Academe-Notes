package com.example.collabrativenotes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Pdfview10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdfview);

        WebView webView = findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load the PDF URL into the WebView
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/drive/folders/1z4l71V981upaFna_T5_iDYU0NmRPjeid?usp=sharing");
    }
}
