package com.example.fn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        WebView myWebView = (WebView) findViewById(R.id.currency);
        myWebView.loadUrl("http://www.tgju.org/currency");
    }
}
