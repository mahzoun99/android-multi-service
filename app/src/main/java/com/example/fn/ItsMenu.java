package com.example.fn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_its_menu);

        final Button GoTocalender =findViewById(R.id.calender);
        final Intent GTcalender=new Intent(this,Calender.class);
        GoTocalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTcalender);
            }
        });

        final Button GoTokharidesharj = findViewById(R.id.menu_kharidesharj);
        final Intent GTkharidesharj = new Intent(this,sharj.class);
        GoTokharidesharj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTkharidesharj);
            }
        });

        final Button GoToweather = findViewById(R.id.weather);
        final Intent GTweather = new Intent(this,weather.class);
        GoToweather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTweather);
            }
        });

        final Button GoTotakhfif = findViewById(R.id.takhfif);
        final Intent GTtakhfif = new Intent(this,takhfif.class);
        GoTotakhfif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTtakhfif);
            }
        });

        final Button GoTobilit = findViewById(R.id.bilit);
        final Intent GTbilit = new Intent(this,bilit.class);
        GoTobilit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTbilit);
            }
        });


        final Button GoToLocalSN = findViewById(R.id.menu_localSN);
        final Intent GTLocalSN = new Intent(this,localSN.class);
        GoToLocalSN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTLocalSN);
            }
        });


        final Button GoTocurrency = findViewById(R.id.menu_currency);
        final Intent GTcurrency = new Intent(this,currency.class);
        GoTocurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTcurrency);
            }
        });

        final Button GoTocartbecart = findViewById(R.id.menu_cartbecart);
        final Intent GTcartbecart = new Intent(this,cartbecart.class);
        GoTocartbecart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(GTcartbecart);
            }
        });


//        final Button GoTo/*ID without menu*/ = findViewById(R.id./*ID*/);
//        final Intent GT/*ID without menu*/ = new Intent(this,/*class name*/.class);
//        /*Button name*/.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(/*Intent name*/);
//            }
//        });


    }
}
