package com.example.fn;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class cartbecart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartbecart);
        final Button Pardakht = findViewById(R.id.Ok_btn);
        final EditText cartemaghsad = findViewById(R.id.Cart_maghsad);
        final EditText mablaghEnteghal = findViewById(R.id.MablaghEnteghali);
        final TextView onvan = findViewById(R.id.cartbecartOnvan);

        Pardakht.setOnClickListener((v)->{
            String m = mablaghEnteghal.getText().toString();
            String c = cartemaghsad.getText().toString();

            final DatabaseAccess dbAccess = new DatabaseAccess(this);
            final Cursor CR = dbAccess.getDb().rawQuery("SELECT * FROM BankAcc",null);
            CR.moveToFirst();
            if(!c.equals(null) && !m.equals(null)){

                do{

                    if(CR.getString(1).equals(c)) {
                        int MojodiBankInt = Integer.valueOf(CR.getString(4));

                        if (MojodiBankInt - Integer.valueOf(m) >= 0) {
                            /*movafaghiat*/
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("user", SignIn.KEEP_USERNAME);
                            contentValues.put("shomarekart", c);
                            contentValues.put("ramzdovom", CR.getString(2));
                            contentValues.put("cvv2", CR.getString(3));
                            contentValues.put("mojodi", String.valueOf(MojodiBankInt + Integer.valueOf(m)) );
                            dbAccess.getDb().update("BankAcc", contentValues, "shomarekart = '" + c + "' ", null);
                            onvan.setText("تراکنش با موفقیت انجام شد!" + "\n" + "موجودی کارت: "
                                    + String.valueOf(MojodiBankInt + Integer.valueOf(m)));

                        }
                    }

                }while(CR.moveToNext());

                Intent intent = new Intent(cartbecart.this, SafhePardakht.class);
                intent.putExtra("price", m);
                startActivity(intent);
                finish();
            }
        });
    }
}
