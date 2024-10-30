package com.example.myloginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class UpdateDataActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private Button buttonUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        buttonUpdate = findViewById(R.id.buttonUpdate);

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String age = editTextAge.getText().toString();

                // Lógica para actualizar datos
                if (!name.isEmpty() && !age.isEmpty()) {
                    Toast.makeText(UpdateDataActivity.this, "Datos actualizados correctamente", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UpdateDataActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

