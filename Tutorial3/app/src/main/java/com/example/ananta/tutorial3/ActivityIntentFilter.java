package com.example.ananta.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by bayup on 20-Nov-19.
 */

public class ActivityIntentFilter extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);
        Button btnSend=(Button)findViewById(R.id.sendMail);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Membuat objek Intent
                Intent si=new Intent(Intent.ACTION_SEND);
                //Mengatur MIME Type
                si.setType("message/rfc822");
                //Mengatur value untuk Email
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"anantaptp2@gmail.com"});
                //Mengatur value untuk Subject Email
                si.putExtra(Intent.EXTRA_SUBJECT, "Ananta 3SC4");
                //Mengatur value untuk pesan Email
                si.putExtra(Intent.EXTRA_TEXT, "Tutorial 3 has come!");
                //Menjalankan Activity dengan parameter objek Intent
                startActivity(Intent.createChooser(si, "Choose a mail app..."));
            }
        });
    }
}
