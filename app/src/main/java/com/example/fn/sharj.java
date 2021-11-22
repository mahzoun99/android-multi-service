package com.example.fn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;


public class sharj extends AppCompatActivity {

    public int poolesharj;
    public String sharjOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharj);



        Button tobuysharj = findViewById(R.id.buysharj);
        final Intent gotobuy = new Intent(this,SafhePardakht.class);
        tobuysharj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotobuy.putExtra("price", String.valueOf(poolesharj));
                startActivity(gotobuy);
            }
        });                                          //Button Buy!



        RadioGroup rgId = findViewById(R.id.pooleSharj);
        RadioGroup opSharj = findViewById(R.id.operatorSharj);
        rgId.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.sharj1000:{
                        poolesharj = 1000;
                        break;
                    }
                    case R.id.sharj2000:{
                        poolesharj = 2000;
                        break;
                    }
                    case R.id.sharj5000:{
                        poolesharj = 5000;
                        break;
                    }
                    case R.id.sharj10000:{
                        poolesharj = 10000;
                        break;
                    }
                    case R.id.sharj20000:{
                        poolesharj = 20000;
                        break;
                    }
                }
            }
        });
        opSharj.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.sharjhamraaval: {
                        sharjOperator = "MCI";
                        break;
                    }
                    case R.id.sharjirnacell: {
                        sharjOperator = "IRANCELL";
                        break;
                    }
                    case R.id.sharjrightell: {
                        sharjOperator = "RIGHTELL";
                        break;
                    }
                }
            }
        });
    }
}
