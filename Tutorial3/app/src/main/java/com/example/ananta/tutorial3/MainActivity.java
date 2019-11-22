package com.example.ananta.tutorial3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        header=(TextView)findViewById(R.id.txtHeader);
    }

    public void launchSecondActivity(View view){
        //Membuat objek Intent
        Intent intent=new Intent(this, SecondActivity.class);
        //Menjalankan Activity dengan parameter Intent
        startActivity(intent);
    }
}
