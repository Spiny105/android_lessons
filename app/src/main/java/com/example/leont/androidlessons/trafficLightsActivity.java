package com.example.leont.androidlessons;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class trafficLightsActivity extends AppCompatActivity {

    ConstraintLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_lights);

        background = (ConstraintLayout) findViewById(R.id.traficLigthLayout);
    }

    //Изменить цвет фона
    public void changeBackGroundColor(View v){
        switch(v.getId()){

            case R.id.greenButton:
                background.setBackgroundColor(ContextCompat.getColor(this, R.color.colorGreen));
                break;

            case R.id.yellowButton:
                background.setBackgroundColor(ContextCompat.getColor(this, R.color.colorYellow));
                break;

            case R.id.redButton:
                background.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRed));
                break;
        }
    }
}
