package com.example.clickprocessinglab;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Task1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task1);
    }

    // Декларативный подход (через XML атрибут onClick)
    public void showFullName(View view) {
        Toast.makeText(this, "Деревянко А.В.", Toast.LENGTH_SHORT).show();
    }
}