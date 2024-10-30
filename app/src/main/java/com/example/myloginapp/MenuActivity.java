package com.example.myloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        MaterialButton createButton = findViewById(R.id.createButton);
        MaterialButton readButton = findViewById(R.id.readButton);
        MaterialButton updateButton = findViewById(R.id.updateButton);
        MaterialButton deleteButton = findViewById(R.id.deleteButton);

        // Aquí agrega los intents para navegar a las actividades correspondientes
        createButton.setOnClickListener(v -> {
            // Navegar a la actividad de crear datos
            Intent intent = new Intent(MenuActivity.this, CreateDataActivity.class);
            startActivity(intent);
        });

        readButton.setOnClickListener(v -> {
            // Navegar a la actividad de leer datos
            Intent intent = new Intent(MenuActivity.this, ReadDataActivity.class);
            startActivity(intent);
        });

        updateButton.setOnClickListener(v -> {
            // Navegar a la actividad de actualizar datos
            Intent intent = new Intent(MenuActivity.this, UpdateDataActivity.class);
            startActivity(intent);
        });

        deleteButton.setOnClickListener(v -> {
            // Navegar a la actividad de eliminar datos
            Intent intent = new Intent(MenuActivity.this, DeleteDataActivity.class);
            startActivity(intent);
        });
    }
}