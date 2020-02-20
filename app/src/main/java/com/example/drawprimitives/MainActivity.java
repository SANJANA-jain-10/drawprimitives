package com.example.drawprimitives;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    myCanvas mycanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mycanvas = new myCanvas(this);
        mycanvas.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        setContentView(mycanvas);
    }
}
