package com.example.aradessebcskils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Inscription extends AppCompatActivity {
    Spinner spinner;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        spinner=findViewById(R.id.spinner);
        String [] localite={"Safi","Sebt Gzoula", "Jamma shaym"};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,localite);
            spinner.setAdapter((adapter));

    }
}