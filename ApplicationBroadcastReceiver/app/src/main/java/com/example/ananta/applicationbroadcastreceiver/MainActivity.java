package com.example.ananta.applicationbroadcastreceiver;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnExplicitBroadcast;
    ConnectionReceiver cr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExplicitBroadcast=findViewById(R.id.btnExplicitBroadcast);
        btnExplicitBroadcast.setOnClickListener(this);
        cr=new ConnectionReceiver();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        IntentFilter filter=new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(cr, filter);
    }

    public void broadcastIntent() {
        Intent intent=new Intent();
        intent.setAction("IntentA");
        intent.setComponent(new ComponentName(getPackageName(),
                "com.example.ananta.applicationbroadcastreceiver.ConnectionReceiver"));
        getApplicationContext().sendBroadcast(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(cr);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnExplicitBroadcast:
                broadcastIntent();
                break;
        }
    }
}
