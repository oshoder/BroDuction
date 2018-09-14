package com.example.felix.broduction.settings.minigames.kings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.felix.broduction.R;

public class KingsSettingsActivity extends AppCompatActivity{

    private Spinner spinnerzwei;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kings_settings);
        spinnerzwei = (Spinner)findViewById(R.id.spinner);
    }
}