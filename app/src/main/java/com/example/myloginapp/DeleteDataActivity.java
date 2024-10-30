package com.example.myloginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DeleteDataActivity extends AppCompatActivity {

    private Button buttonDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_data);

        buttonDelete = findViewById(R.id.buttonDelete);

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para eliminar datos
                Toast.makeText(DeleteDataActivity.this, "Datos eliminados correctamente", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
