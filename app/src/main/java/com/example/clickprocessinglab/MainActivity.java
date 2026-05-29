package com.example.clickprocessinglab;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button clickedButton = (Button) v;
                //clickedButton.setText("Нажата!");
                // Или в одну строку: ((Button)v).setText("Нажата!");
                ((Button)v).setText("Нажата кнопка 1");
                Toast.makeText(MainActivity.this, "Нажата кнопка 1", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button)v).setText("Нажата кнопка 2");
                Toast.makeText(MainActivity.this, "Нажата кнопка 2", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button)v).setText("Нажата кнопка 3");
                Toast.makeText(MainActivity.this, "Нажата кнопка 3", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*public void onButtonClick(View view) {
        Toast.makeText(this, "Деревянко", Toast.LENGTH_SHORT).show();
    }*/
}