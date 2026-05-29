package com.example.clickprocessinglab;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        // Навигация к основному ходу работы
        findViewById(R.id.btn0).setOnClickListener(v ->
                startActivity(new Intent(MainMenu.this, MainActivity.class)));

        // Навигация к Заданию 1
        findViewById(R.id.btn1).setOnClickListener(v ->
                startActivity(new Intent(MainMenu.this, Task1Activity.class)));

        // Навигация к Заданию 2
        findViewById(R.id.btn2).setOnClickListener(v ->
                startActivity(new Intent(MainMenu.this, Task2Activity.class)));

        // Навигация к Заданию 3
        findViewById(R.id.btn3).setOnClickListener(v ->
                startActivity(new Intent(MainMenu.this, Task3Activity.class)));

        // Навигация к Заданию 4
        findViewById(R.id.btn4).setOnClickListener(v ->
                startActivity(new Intent(MainMenu.this, Task4Activity.class)));

        // Навигация к Заданию 5
        findViewById(R.id.btn5).setOnClickListener(v ->
                startActivity(new Intent(MainMenu.this, Task5Activity.class)));
    }
}