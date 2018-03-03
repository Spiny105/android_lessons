package com.example.leont.androidlessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Вызов окон различных уроков
    public void startLesson(View v){

        Intent intent;
        switch (v.getId()){

            //Lesson 1. Hello Kitty
            case R.id.helloKittyBytton:
                intent = new Intent(this, helloKittyActivity.class);
                startActivity(intent);
                break;

            //Урок 2. Считаем ворон
            case R.id.crowCounterLessonButton:
                intent = new Intent(this, crowCounterActivity.class);
                startActivity(intent);
                break;

            //Урок 3. Светофор
            case R.id.traficLigthButton:
                intent = new Intent(this, trafficLightsActivity.class);
                startActivity(intent);
                break;

            //Урок 4. Оринтация устройства
            case R.id.orientationButton:
                intent = new Intent(this, orientationActivity.class);
                startActivity(intent);
                break;

            //Урок 5. Играемся с Toast
            case R.id.toastButton:
                intent = new Intent(this, toastActivity.class);
                startActivity(intent);
                break;

            //Урок 6. Играемся с Basic Activity
            case R.id.basicActivityButton:
                intent = new Intent(this, basicActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
