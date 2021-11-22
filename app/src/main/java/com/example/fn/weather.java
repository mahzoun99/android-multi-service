package com.example.fn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class weather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        WebView myWebView = (WebView) findViewById(R.id.weather);
        myWebView.loadUrl("https://www.accuweather.com/en/ir/tehran/210841/hourly-weather-forecast/210841");
    }
}
