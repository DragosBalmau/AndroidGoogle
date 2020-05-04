package com.example.tema2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;

    private List<String> fructe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //ScrollView
        setContentView(R.layout.scrollview);
//
//        //FrameView
//        setContentView(R.layout.frame);
//
//        //Spinner
//        setContentView(R.layout.spinner);
//        spinner = findViewById(R.id.spinnerFructe);
//        setSpinnerSource();
//        spinner.setAdapter(getSpinnerAdapter());
    }

    private void setSpinnerSource(){
        fructe = new ArrayList<>();
        fructe.add("Mar");
        fructe.add("Para");
        fructe.add("Mango");
        fructe.add("Cirese");
        fructe.add("Fructul pasiunii");
        fructe.add("Zmeura");
        fructe.add("Rodie");
        fructe.add("Rosie");
    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fructe);
    }

}