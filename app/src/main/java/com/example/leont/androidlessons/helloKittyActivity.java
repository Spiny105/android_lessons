package com.example.leont.androidlessons;

import android.content.Context;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class helloKittyActivity extends AppCompatActivity {

    TextView kittyNameView;
    EditText kittyNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_kitty);

        kittyNameEditText = (EditText)findViewById(R.id.kittyNameEditText);
        kittyNameView = (TextView)findViewById(R.id.kittyNameTextView);
    }

    //Нажатие на кнопку Ок
    public void kittyNameEntered(View v){

        //Скрыть клавиатуру ввода текста
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        //Отобразить введенное имя
        String name = kittyNameEditText.getText().toString();
        if (name.isEmpty())
            return;
        else
            kittyNameView.setText("Привет, " + name);

    }
}
