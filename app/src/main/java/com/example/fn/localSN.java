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

public class localSN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_sn);

        final Button fromchattomenu = findViewById(R.id.fromchattomenu);
        final Button sendtolocalSN = findViewById(R.id.sendtoloacalSN);
        final EditText TEXTaddToTEXTBOXlocalSN = findViewById(R.id.TEXTaddToTEXTBOXlocalSN);
        final TextView TEXTBOXlocalSN = findViewById(R.id.TEXTBOXlocalSN);

        /* اضافه کردن متن داخل دیتابیس به TextView */
        final DatabaseAccess dbAccess = new DatabaseAccess(this);
        final Cursor CR = dbAccess.getDb().rawQuery("SELECT * FROM Chat",null);
        CR.moveToFirst();
        do {
            if (!CR.isNull(0) && !CR.isNull(1)) {
                TEXTBOXlocalSN.setText(TEXTBOXlocalSN.getText().toString() +
                        CR.getString(0) + ": " +
                                CR.getString(1) + "\n\n");
            }
        }while(CR.moveToNext());
        CR.close();
        /* اضافه کردن متن داخل دیتابیس به TextView */

        final Intent fromchattomenuintent = new Intent(this,ItsMenu.class);
        fromchattomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fromchattomenuintent);
            }
        });

        sendtolocalSN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TEXTaddToTEXTBOXlocalSN.getText().length()>=1){
                    TEXTBOXlocalSN.setText(TEXTBOXlocalSN.getText() + SignIn.KEEP_USERNAME + ": " +TEXTaddToTEXTBOXlocalSN.getText() + "\n\n");

                    /* اضافه کردن EditTEXT به دیتابیس */
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("user",SignIn.KEEP_USERNAME);
                    contentValues.put("pm",TEXTaddToTEXTBOXlocalSN.getText().toString());
                    dbAccess.getDb().insert("Chat",null , contentValues);

                    TEXTaddToTEXTBOXlocalSN.setText(null);
                    TEXTaddToTEXTBOXlocalSN.setHint("Write Here!");

                }
                else
                    TEXTaddToTEXTBOXlocalSN.setHint("You didn't write anything here!");

            }
        });



    }
}
