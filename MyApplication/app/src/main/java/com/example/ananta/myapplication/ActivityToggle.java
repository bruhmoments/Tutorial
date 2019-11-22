package com.example.ananta.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by bayup on 14-Nov-19.
 */

public class ActivityToggle extends Activity{
    ToggleButton tg1, tg2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_toggle);

        tg1=(ToggleButton)findViewById(R.id.toggleButton);
        tg2=(ToggleButton)findViewById(R.id.toggleButton2);

        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result=new StringBuffer();
                result.append("You Have Clicked on the First Button ").append(tg1.getText());
                result.append("You Have Clicked on the Second Button ").append(tg2.getText());
                Toast.makeText(ActivityToggle.this, result.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
