package com.example.ananta.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by bayup on 14-Nov-19.
 */

public class ActivityAutoComplete extends Activity {
    AutoCompleteTextView autocmplt;
    String[] arr = {"EdgardJS.exe", "Sentot", "Hilmi324", "Sendi", "Enoch Bening"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_autocomplete);
        autocmplt =(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, arr);
        autocmplt.setThreshold(2);
        autocmplt.setAdapter(adapter);
    }
}
