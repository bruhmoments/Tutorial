package com.example.ananta.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by bayup on 20-Nov-19.
 */

public class SecondActivity extends AppCompatActivity{
    private TextView header;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        header=(TextView)findViewById(R.id.txtHeader);
    }

    public void returnReply(View view){
        //Membuat Intent
        Intent intent=new Intent(this, MainActivity.class);
        //Menjalankan Activity dengan parameter Intent
        startActivity(intent);
    }
}
