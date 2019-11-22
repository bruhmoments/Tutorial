package com.example.ananta.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by bayup on 20-Nov-19.
 */

public class ActivityOutput extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        TextView res=(TextView)findViewById(R.id.vHasil);
        //Mengambil nilai Intent dari ActivityInput
        Intent intent=getIntent();
        //Mengambil atribut Intent dari ActivityInput
        String add=(String)intent.getSerializableExtra("jumlah");
        res.setText(add);
    }
}
