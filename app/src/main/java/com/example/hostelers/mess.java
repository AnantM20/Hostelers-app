package com.example.hostelers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mess extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);

        webView = findViewById(R.id.messs);
        webView.loadUrl("https://www.google.com/search?rlz=1C1CHBD_enIN992IN992&tbs=lf:1,lf_ui:9&tbm=lcl&sxsrf=ALiCzsbk0Lls7JrzmvTf3YZDjR2sS2MTkA:1669212121253&q=mess+near+dy+patil+college+of+engineering+kolhapur&rflfq=1&num=10&ved=2ahUKEwiD1qrcu8T7AhX_TmwGHaFdCkUQtgN6BAgPEAY#rlfi=hd:;si:;mv:[[16.7446333,74.2613265],[16.6911632,74.2313834]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:9");
        webView.setWebViewClient(new WebViewClient());
    }
}