package com.example.leont.androidlessons;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.widget.Toast;


public class orientationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);

        String message = getOrientationString() + "\r\n" + getRotatationString();
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }

    private String getOrientationString(){
        String orientationString = "";

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            orientationString = "Портретная ориентация";
        }
        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            orientationString = "Альбомная ориентация";
        }
        else{
            orientationString = "Не удалось определить ориентацию";
        }

        return  orientationString;
    }

    private String getRotatationString(){
        String rotatationString;

        switch(getWindowManager().getDefaultDisplay().getRotation())
        {
            case Surface.ROTATION_0:
                rotatationString = "Не поворачивали";
                break;

            case Surface.ROTATION_270:
                rotatationString = "Повернули по часовой стрелке";
                break;

            case Surface.ROTATION_180:
                rotatationString = "Повернули вверх ногами";
                break;

            case Surface.ROTATION_90:
                rotatationString = "Повернули против часовой стрелки";
                break;

            default:
                rotatationString = "Не опредлана оринтация";
        }

        return  rotatationString;
    }
}
