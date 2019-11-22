package com.example.ananta.applicationpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mencari TextView dari layout
        TextView nama = findViewById(R.id.tv_namaMain);
        //Mengubah teks TextView dari layout menjadi Username di Preferences
        nama.setText(Preferences.getLoggedInUser(getBaseContext()));

        //Kembali ke ActivityLogin saat tombol LogOut diklik
        findViewById(R.id.button_logoutMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Menghapus Status login dan kembali ke Login Activity
                Preferences.clearLoggedInUser(getBaseContext());
                startActivity(new Intent(getBaseContext(), ActivityLogin.class));
                finish();
            }
        });
    }
}
