package com.example.thermometerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Thermometer thermometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thermometer = (Thermometer) findViewById(R.id.thermometer);
        thermometer.changeUnit(false);
        thermometer.setCurrentTemp(22f);
    }
}