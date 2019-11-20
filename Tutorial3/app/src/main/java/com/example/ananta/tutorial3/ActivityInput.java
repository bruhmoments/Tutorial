package com.example.ananta.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by bayup on 20-Nov-19.
 */

public class ActivityInput extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        final EditText fNum=(EditText)findViewById(R.id.angkaSatu);
        final EditText sNum=(EditText)findViewById(R.id.angkaDua);
        Button btnAdd=(Button)findViewById(R.id.btnTambah);
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Mengambil nilai dari Input
                int n1=Integer.parseInt(fNum.getText().toString());
                int n2=Integer.parseInt(sNum.getText().toString());
                //Membuat objek Intent
                Intent intent=new Intent(ActivityInput.this,ActivityOutput.class);
                //Penjumlahan angka untuk atribut Intent
                intent.putExtra("jumlah",n1+" + "+n2+" = "+(n1+n2));
                //Menjalankan Activity dengan parameter Intent
                startActivity(intent);
            }
        });
    }
}
