package com.example.leont.androidlessons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class crowCounterActivity extends Activity {

    private long crowCounter = 0;
    private long catCount = 0;

    TextView crowCountTextView;
    TextView helloTextView;
    TextView catCountTextView;

    private List<String> helloMessages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crow_counter_activity);

        crowCountTextView = findViewById(R.id.crowTextView);
        helloTextView = findViewById(R.id.helloTextView);
        catCountTextView = findViewById(R.id.catCountTextView);

        //Инициализация полей
        helloMessages.add(0, "И тебе не кашлять!");
        helloMessages.add(1,"Ты кто такой? Давай, до свидания!");
        helloMessages.add(2,"Приветствую, сударь!");
    }

    //Считать ворон
    public void crowCount(View v){
        crowCounter++;
        String msg = "Ворон сосчитано: " + crowCounter;
        crowCountTextView.setText(msg);
    }

    //Сообщение
    public void onHelloButtonClick(View v){
        int helloIndex = Math.abs((new Random()).nextInt() % 3);
        helloTextView.setText(helloMessages.get(helloIndex));
    }

    //Считать котов
    public void catCount(View v){
        catCount++;
        String msg = "Котов сосчитано: " + catCount;
        catCountTextView.setText(msg);
    }
}
