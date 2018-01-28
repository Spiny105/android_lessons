package com.example.leont.androidlessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        }
    }
}
