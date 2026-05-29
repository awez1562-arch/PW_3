package com.example.clickprocessinglab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Task3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task3);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        // Отдельный слушатель для кнопки 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Task3Activity.this,
                        "Деревянко А.В. - нажата кнопка 1",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Отдельный слушатель для кнопки 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Task3Activity.this,
                        "Деревянко А.В. - нажата кнопка 2",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Отдельный слушатель для кнопки 3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Task3Activity.this,
                        "Деревянко А.В. - нажата кнопка 3",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}