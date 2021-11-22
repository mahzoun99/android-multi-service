package com.example.fn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;




import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class takhfif extends AppCompatActivity {

        //a list to store all the products
        List<kala> productList;
        int finalprice =0 ;
        //the recyclerview
        TextView fullPricetextview;

        RecyclerView recyclerView;
//    View.OnClickListener onClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            RecyclerView.ViewHolder viewHolder = ((RecyclerView.ViewHolder) v.getTag());
//            if(viewHolder.getItemId()==R.id.addCMButton){
//                Intent intent = new Intent(this, Nazarat.class);
//                startActivity(intent);
//            }
//            else {
//                int a = viewHolder.getAdapterPosition();
//                finalprice += productList.get(a).getPrice();
//                fullPricetextview.setText(String.valueOf(finalprice));
//            }
//        }
//    };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_takhfif);
            fullPricetextview = findViewById(R.id.allprices);
            finalprice =0;
            //getting the recyclerview from xml
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            //initializing the productlist
            productList = new ArrayList<>();

            productList.add(
                    new kala(
                            1,
                            "ناهار برج آزادی",
                            "23خرداد",
                            19,
                            55000,
                            R.drawable.azadi));

            productList.add(
                    new kala(
                            2,
                            "صبحانه هتل استقلال",
                            "تا 26 خرداد",
                            3.8,
                            120000,
                            R.drawable.esteghlal));

            productList.add(
                    new kala(
                            3,
                            "بوفه ناهار برج میلاد",
                            "تا25خرداد",
                            4.4,
                            90000,
                            R.drawable.milad));

            //creating recyclerview adapter
            ProductAdapter adapter = new ProductAdapter(this, productList);
            adapter.setOnClickListener((v,i) -> {
                RecyclerView.ViewHolder viewHolder = ((RecyclerView.ViewHolder) v.getTag());
                if(i==1){
                    //Intent intent = new Intent(this, Nazarat.class);
                    //startActivity(intent);
                }
                else {
                    int a = viewHolder.getAdapterPosition();
                    finalprice += productList.get(a).getPrice();
                    fullPricetextview.setText(String.valueOf(finalprice));
                }
            });
            //setting adapter to recyclerview
            recyclerView.setAdapter(adapter);
            fullPricetextview.setText(String.valueOf(finalprice));


            //gotoMAP

            //final Intent GTNAZARAT = new Intent(this,Nazarat.class);
            final Button DONEofTakhfif =  findViewById(R.id.gotoMap);
            final Intent takhfifToKharid = new Intent(this , SafhePardakht.class);
            //final Button gotoNazaratButton = findViewById(R.id.nazarat);
        DONEofTakhfif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                takhfifToKharid.putExtra("price",String.valueOf(finalprice));
                startActivity(takhfifToKharid);
            }
        });
//        gotoNazaratButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View V) {
//                startActivity(GTNAZARAT);
//            }
//        });


        }

    }


