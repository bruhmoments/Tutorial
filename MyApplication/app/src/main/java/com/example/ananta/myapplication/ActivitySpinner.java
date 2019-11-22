package com.example.ananta.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bayup on 15-Nov-19.
 */

public class ActivitySpinner extends Activity implements AdapterView.OnItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_spinner);
        //Adding a Spinner
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        //Listener for Spinner
        spinner.setOnItemSelectedListener(this);
        //Spinner drowdown elements
        List<String> categories=new ArrayList<>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");
        //Creating adapter for spinner
        ArrayAdapter<String>dataAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,categories);
        //Dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Attaching DataAdapter into Spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        //Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
