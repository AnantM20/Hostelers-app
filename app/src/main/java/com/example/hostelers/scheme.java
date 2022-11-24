package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class scheme extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme);

        webView = findViewById(R.id.website);
        webView.loadUrl("https://www.india.gov.in/centrally-sponsored-scheme-hostels-scheduled-caste-girls-and-boys");
        webView.setWebViewClient(new WebViewClient());



    }

}