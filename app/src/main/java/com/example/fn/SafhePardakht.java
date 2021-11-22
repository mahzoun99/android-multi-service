package com.example.fn;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SafhePardakht extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safhe_pardakht);

        final EditText CCV2 = findViewById(R.id.cvv2);
        final EditText ramzdovom = findViewById(R.id.ramz_dovom);
        final EditText shomarekart = findViewById(R.id.sh_cart);


        final TextView hazinekharid = findViewById(R.id.Hazine);
        final TextView kharidError = findViewById(R.id.Error);
        final Button sabtekharid = findViewById(R.id.Pardakht);

        final String meghdareHazine = getIntent().getStringExtra("price");

        hazinekharid.setText(meghdareHazine + " تومان");

        final DatabaseAccess dbAccess = new DatabaseAccess(this);
        final Cursor CR = dbAccess.getDb().rawQuery("SELECT * FROM BankAcc",null);
        CR.moveToFirst();
        //final int MeghdarHazineInt = Integer.valueOf(meghdareHazine);

        sabtekharid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checkshomare = false;
                do{

                    if(shomarekart.getText().toString().equals(CR.getString(1)) ){
                        checkshomare = true;
                        if(ramzdovom.getText().toString().equals(CR.getString(2))){
                            if(CCV2.getText().toString().equals(CR.getString(3))){
                                /*takmile inja vase taide kharid!*/
                                int MojodiBankInt = Integer.valueOf(CR.getString(4));

                                if(MojodiBankInt-Integer.valueOf(meghdareHazine)>=0){
                                    /*movafaghiat*/
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("user",SignIn.KEEP_USERNAME);
                                    contentValues.put("shomarekart",shomarekart.getText().toString());
                                    contentValues.put("ramzdovom", CR.getString(2));
                                    contentValues.put("cvv2", CR.getString(3));
                                    contentValues.put("mojodi", String.valueOf(MojodiBankInt - Integer.valueOf(meghdareHazine)) );
                                    dbAccess.getDb().update("BankAcc" , contentValues , "shomarekart = '"+shomarekart+"' ",null );
                                    kharidError.setText( "تراکنش با موفقیت انجام شد!" + "\n" + "موجودی کارت: "
                                            + String.valueOf( MojodiBankInt - Integer.valueOf(meghdareHazine) ) );
                                }
                                else
                                    kharidError.setText("موجودی کافی نیست!");

                            }
                            else{
                                kharidError.setText("Wrong CVV2!");
                            }
                            break;
                        }
                        else{
                            kharidError.setText("رمز دوم اشتباه است!");
                            break;
                        }
                    }

                }while(CR.moveToNext());
                if(checkshomare==false)
                    kharidError.setText("شماره کارت معتبر نمی باشد!");

            }
        });


        final Button fromkharidtomainpage = findViewById(R.id.fromkharidtomainpage);
        final Intent FkharidTmainpage = new Intent(this,ItsMenu.class);
        fromkharidtomainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(FkharidTmainpage);
            }
        });

    }
}
