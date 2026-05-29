package com.example.clickprocessinglab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Task5Activity extends AppCompatActivity {

    // Флаг режима: true - режим А, false - режим Б
    private boolean isModeA = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task5);

        final Button buttonMain = findViewById(R.id.buttonMain);
        Button buttonSwitch = findViewById(R.id.buttonSwitch);

        // Обработчик основной кнопки
        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isModeA) {
                    // Режим А - показываем фамилию
                    Toast.makeText(Task5Activity.this,
                            "Деревянко А.В.",
                            Toast.LENGTH_SHORT).show();
                } else {
                    // Режим Б - показываем номер группы
                    Toast.makeText(Task5Activity.this,
                            "Группа ИНС-б-о-24-2",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Обработчик кнопки переключения режима
        buttonSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isModeA = !isModeA; // Переключаем флаг

                if (isModeA) {
                    buttonSwitch.setText("Режим: А (ФИО)");
                    Toast.makeText(Task5Activity.this,
                            "Переключено в режим А",
                            Toast.LENGTH_SHORT).show();
                } else {
                    buttonSwitch.setText("Режим: Б (Группа)");
                    Toast.makeText(Task5Activity.this,
                            "Переключено в режим Б",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}