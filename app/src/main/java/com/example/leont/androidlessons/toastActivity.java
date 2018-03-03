package com.example.leont.androidlessons;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class toastActivity extends AppCompatActivity {

    private Boolean catIsHungry;
    private Boolean catIsSleeping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        catIsHungry = true;
        catIsSleeping = false;
    }

    //Узнать, как у кота дела
    public void getCatStatusButtonClick(View v)
    {
        Toast toast;
        ImageView catImage = new ImageView(getApplicationContext());

        if (catIsSleeping) {
            catImage.setImageResource(R.drawable.sleeping_cat);
            toast = Toast.makeText(getApplicationContext(), "Кот спит", Toast.LENGTH_SHORT);
        }
        else if (catIsHungry) {
            catImage.setImageResource(R.drawable.hungry_cat);
            toast = Toast.makeText(getApplicationContext(), "Кот голодный", Toast.LENGTH_SHORT);
        }
        else {
            catImage.setImageResource(R.drawable.happy_cat);
            toast = Toast.makeText(getApplicationContext(), "Кот доволен", Toast.LENGTH_SHORT);
            catIsSleeping = true;
        }

        LinearLayout layout = (LinearLayout)toast.getView();
        layout.addView(catImage);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    //Попытаться накормить кота
    public void onCatFeedButtonClick(View v){
        Toast toast;

        ImageView catImage = new ImageView(getApplicationContext());

        if (catIsSleeping) {
            catImage.setImageResource(R.drawable.sleeping_cat);
            toast = Toast.makeText(getApplicationContext(), "Кот спит", Toast.LENGTH_SHORT);
        }
        else if (catIsHungry) {
            catImage.setImageResource(R.drawable.happy_cat);
            toast = Toast.makeText(getApplicationContext(), "Кот накормлен", Toast.LENGTH_SHORT);
            catIsHungry = false;
        }
        else {
            catImage.setImageResource(R.drawable.scared_cat);
            toast = Toast.makeText(getApplicationContext(), "В кота столько не влезет!", Toast.LENGTH_SHORT);
        }

        LinearLayout layout = (LinearLayout)toast.getView();
        layout.addView(catImage);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
