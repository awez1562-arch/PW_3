package com.example.clickprocessinglab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Task4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task3);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        // Один общий слушатель для всех кнопок
        View.OnClickListener commonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.button1) {
                    Toast.makeText(Task4Activity.this,
                            "Деревянко А.В. - нажата кнопка 1",
                            Toast.LENGTH_SHORT).show();
                } else if (v.getId() == R.id.button2) {
                    Toast.makeText(Task4Activity.this,
                            "Деревянко А.В. - нажата кнопка 2",
                            Toast.LENGTH_SHORT).show();
                } else if (v.getId() == R.id.button3) {
                    Toast.makeText(Task4Activity.this,
                            "Деревянко А.В. - нажата кнопка 3",
                            Toast.LENGTH_SHORT).show();
                }
            }
        };

        // Назначаем один и тот же слушатель всем кнопкам
        button1.setOnClickListener(commonListener);
        button2.setOnClickListener(commonListener);
        button3.setOnClickListener(commonListener);
    }
}