package com.example.clickprocessinglab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task2);

        // Программный подход (через setOnClickListener)
        Button buttonChangeText = findViewById(R.id.buttonChangeText);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button clickedButton = (Button) v;
                clickedButton.setText("Деревянко А.В.");
            }
        });
    }
}