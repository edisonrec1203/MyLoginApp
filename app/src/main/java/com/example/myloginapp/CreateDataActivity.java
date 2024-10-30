package com.example.myloginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreateDataActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_data);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String ageText = editTextAge.getText().toString().trim();

                if (!name.isEmpty() && !ageText.isEmpty()) {
                    try {
                        int age = Integer.parseInt(ageText);
                        // Lógica para guardar los datos (ejemplo de éxito)
                        Toast.makeText(CreateDataActivity.this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        // Maneja el caso de edad no válida
                        Toast.makeText(CreateDataActivity.this, "Ingrese una edad válida", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(CreateDataActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
