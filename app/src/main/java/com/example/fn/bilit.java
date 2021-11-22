package com.example.fn;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;




import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static android.icu.text.MessagePattern.ArgType.SELECT;


public class bilit extends AppCompatActivity {

        static String MABDA = new String();
        static String MAGHSAD = new String();
        static int MABDAp=0;
        static int MAGHSADp=0;
        static int lastPrice = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bilit);

            final Button mabda1 =  findViewById(R.id.mabda1);
            final Button mabda2 =  findViewById(R.id.mabda2);
            final Button mabda3 =  findViewById(R.id.mabda3);
            final Button mabda4 =  findViewById(R.id.mabda4);
            final Button mabda5 =  findViewById(R.id.mabda5);
            final Button mabda6 =  findViewById(R.id.mabda6);
            final Button mabda7 =  findViewById(R.id.mabda7);
            final Button mabda8 =  findViewById(R.id.mabda8);
            final Button mabda9 =  findViewById(R.id.mabda9);
            final Button mabda10 =  findViewById(R.id.mabda10);
            final Button maghsad1 =  findViewById(R.id.maghsad1);
            final Button maghsad2 =  findViewById(R.id.maghsad2);
            final Button maghsad3 =  findViewById(R.id.maghsad3);
            final Button maghsad4 =  findViewById(R.id.maghsad4);
            final Button maghsad5 =  findViewById(R.id.maghsad5);
            final Button maghsad6 =  findViewById(R.id.maghsad6);
            final Button maghsad7 =  findViewById(R.id.maghsad7);
            final Button maghsad8 =  findViewById(R.id.maghsad8);
            final Button maghsad9 =  findViewById(R.id.maghsad9);
            final Button maghsad10 =  findViewById(R.id.maghsad10);
            final Button mohasebegheymat =  findViewById(R.id.mohasebegheymat);
            final Button taidesafar =  findViewById(R.id.taidesafar);


            final TextView namayeshegheymat =  findViewById(R.id.namayeshegheymat);


            mabda1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda1.getText().charAt(0)!='*') {
                        MABDA = mabda1.getText().toString();
                        MABDAp = 1;
                        mabda1.setText("*"+mabda1.getText());
                    }
                    else{
                        mabda1.setText(mabda1.getText().subSequence(1,mabda1.getText().length()));
                        MABDA = "";
                    }

                }
            });
            mabda2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda2.getText().charAt(0)!='*') {
                        MABDA = mabda2.getText().toString();
                        MABDAp = 2;
                        mabda2.setText("*"+mabda2.getText());
                    }
                    else{
                        mabda2.setText(mabda2.getText().subSequence(1,mabda2.getText().length()));
                        MABDA = "";
                    }
                }
            });
            mabda3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda3.getText().charAt(0)!='*') {
                        MABDA = mabda3.getText().toString();
                        MABDAp = 3;
                        mabda3.setText("*"+mabda3.getText());
                    }
                    else{
                        mabda3.setText(mabda3.getText().subSequence(1,mabda3.getText().length()));
                        MABDA = "";
                    }
                }
            });
            mabda4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda4.getText().charAt(0)!='*') {
                        MABDA = mabda4.getText().toString();
                        MABDAp = 4;
                        mabda4.setText("*"+mabda4.getText());
                    }
                    else{
                        mabda4.setText(mabda4.getText().subSequence(1,mabda4.getText().length()));
                        MABDA = "";
                    }
                }
            });
            mabda5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda5.getText().charAt(0)!='*') {
                        MABDA = mabda5.getText().toString();
                        MABDAp = 5;
                        mabda5.setText("*"+mabda5.getText());
                    }
                    else{
                        mabda5.setText(mabda5.getText().subSequence(1,mabda5.getText().length()));
                        MABDA = "";
                    }
                }
            });
            mabda6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda6.getText().charAt(0)!='*') {
                        MABDA = mabda6.getText().toString();
                        MABDAp = 6;
                        mabda6.setText("*"+mabda6.getText());
                    }
                    else{
                        mabda6.setText(mabda6.getText().subSequence(1,mabda6.getText().length()));
                        MABDA = "";
                    }

                }
            });
            mabda7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda7.getText().charAt(0)!='*') {
                        MABDA = mabda7.getText().toString();
                        MABDAp = 7;
                        mabda7.setText("*"+mabda7.getText());
                    }
                    else{
                        mabda7.setText(mabda7.getText().subSequence(1,mabda7.getText().length()));
                        MABDA = "";
                    }

                }
            });
            mabda8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda8.getText().charAt(0)!='*') {
                        MABDA = mabda8.getText().toString();
                        MABDAp = 8;
                        mabda8.setText("*"+mabda8.getText());
                    }
                    else{
                        mabda8.setText(mabda8.getText().subSequence(1,mabda8.getText().length()));
                        MABDA = "";
                    }

                }
            });
            mabda9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda9.getText().charAt(0)!='*') {
                        MABDA = mabda9.getText().toString();
                        MABDAp = 9;
                        mabda9.setText("*"+mabda9.getText());
                    }
                    else{
                        mabda9.setText(mabda9.getText().subSequence(1,mabda9.getText().length()));
                        MABDA = "";
                    }
                }
            });
            mabda10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mabda10.getText().charAt(0)!='*') {
                        MABDA = mabda10.getText().toString();
                        MABDAp = 10;
                        mabda10.setText("*"+mabda10.getText());
                    }
                    else{
                        mabda10.setText(mabda10.getText().subSequence(1,mabda10.getText().length()));
                        MABDA = "";
                    }

                }
            });
            maghsad1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad1.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad1.getText().toString();
                        MAGHSADp = 1;
                        maghsad1.setText("*"+maghsad1.getText());
                    }
                    else{
                        maghsad1.setText(maghsad1.getText().subSequence(1,maghsad1.getText().length()));
                        MAGHSAD = "";
                    }
                }
            });
            maghsad2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad2.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad2.getText().toString();
                        MAGHSADp = 2;
                        maghsad2.setText("*"+maghsad2.getText());
                    }
                    else{
                        maghsad2.setText(maghsad2.getText().subSequence(1,maghsad2.getText().length()));
                        MAGHSAD = "";
                    }
                }
            });
            maghsad3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad3.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad3.getText().toString();
                        MAGHSADp = 3;
                        maghsad3.setText("*"+maghsad3.getText());
                    }
                    else{
                        maghsad3.setText(maghsad3.getText().subSequence(1,maghsad3.getText().length()));
                        MAGHSAD = "";
                    }
                }
            });
            maghsad4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad4.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad4.getText().toString();
                        MAGHSADp = 4;
                        maghsad4.setText("*"+maghsad4.getText());
                    }
                    else{
                        maghsad4.setText(maghsad4.getText().subSequence(1,maghsad4.getText().length()));
                        MAGHSAD = "";
                    }

                }
            });
            maghsad5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad5.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad5.getText().toString();
                        MAGHSADp = 5;
                        maghsad5.setText("*"+maghsad5.getText());
                    }
                    else{
                        maghsad5.setText(maghsad5.getText().subSequence(1,maghsad5.getText().length()));
                        MAGHSAD = "";
                    }

                }
            });
            maghsad6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad6.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad6.getText().toString();
                        MAGHSADp = 6;
                        maghsad6.setText("*"+maghsad6.getText());
                    }
                    else{
                        maghsad6.setText(maghsad6.getText().subSequence(1,maghsad6.getText().length()));
                        MAGHSAD = "";
                    }
                }
            });
            maghsad7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad7.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad7.getText().toString();
                        MAGHSADp = 7;
                        maghsad7.setText("*"+maghsad7.getText());
                    }
                    else{
                        maghsad7.setText(maghsad7.getText().subSequence(1,maghsad7.getText().length()));
                        MAGHSAD = "";
                    }

                }
            });
            maghsad8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad8.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad8.getText().toString();
                        MAGHSADp = 8;
                        maghsad8.setText("*"+maghsad8.getText());
                    }
                    else{
                        maghsad8.setText(maghsad8.getText().subSequence(1,maghsad8.getText().length()));
                        MAGHSAD = "";
                    }
                }
            });
            maghsad9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad9.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad9.getText().toString();
                        MAGHSADp = 9;
                        maghsad9.setText("*"+maghsad9.getText());
                    }
                    else{
                        maghsad9.setText(maghsad9.getText().subSequence(1,maghsad9.getText().length()));
                        MAGHSAD = "";
                    }
                }
            });
            maghsad10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maghsad10.getText().charAt(0)!='*') {
                        MAGHSAD = maghsad10.getText().toString();
                        MAGHSADp = 10;
                        maghsad10.setText("*"+maghsad10.getText());
                    }
                    else{
                        maghsad10.setText(maghsad10.getText().subSequence(1,maghsad10.getText().length()));
                        MAGHSAD = "";
                    }

                }
            });


//            final DatabaseAccess dbAccess = new DatabaseAccess(this);
//            final Cursor C = dbAccess.getDb().rawQuery("SELECT * FROM Requests",null);
//            final ContentValues values = new ContentValues();

            mohasebegheymat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lastPrice = Math.abs(MABDAp-MAGHSADp)*1700 + 25000;
                    //Random random = new Random();
                    //lastPrice += random.nextInt(2000);
                    if( MABDAp-MAGHSADp != 0)
                        namayeshegheymat.setText(String.valueOf(lastPrice));
                    else
                        namayeshegheymat.setText("مبدا و مقصد یکسان است!");

                }
            });


            taidesafar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //String adress= " از " + MABDA + " به " + MAGHSAD;
                    Intent bilitbekharid = new Intent(bilit.this, SafhePardakht.class);
                    bilitbekharid.putExtra("price",String.valueOf(lastPrice));
                    startActivity(bilitbekharid);
//                    values.put("phone",getIntent().getStringExtra("phone") + " " + String.valueOf(lastPrice));
//                    values.put("address",adress);
//                    values.put("price",lastPrice);
//                    values.put("a",String.valueOf(lastPrice));
//                    dbAccess.getDb().insert("Requests",null,values);
                }
            });
        }
    }


