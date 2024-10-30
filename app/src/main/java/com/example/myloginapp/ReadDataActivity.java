package com.example.myloginapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReadDataActivity extends AppCompatActivity {

    private TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_data);

        textViewData = findViewById(R.id.textViewData);

        // Lógica para leer datos y mostrarlos
        textViewData.setText("Nombre: Juan\nEdad: 25");
    }
}
