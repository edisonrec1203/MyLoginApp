package com.example.myloginapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class AlertSettingsActivity extends AppCompatActivity {

    private EditText heartRateInput, bloodPressureInput, temperatureInput;
    private MaterialButton saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_settings);

        heartRateInput = findViewById(R.id.heartRateInput);
        bloodPressureInput = findViewById(R.id.bloodPressureInput);
        temperatureInput = findViewById(R.id.temperatureInput);
        saveButton = findViewById(R.id.saveButton);

        loadPreferences();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savePreferences();
            }
        });
    }

    private void loadPreferences() {
        SharedPreferences preferences = getSharedPreferences("AlertSettings", MODE_PRIVATE);
        heartRateInput.setText(preferences.getString("heartRate", ""));
        bloodPressureInput.setText(preferences.getString("bloodPressure", ""));
        temperatureInput.setText(preferences.getString("temperature", ""));
    }

    private void savePreferences() {
        String heartRate = heartRateInput.getText().toString();
        String bloodPressure = bloodPressureInput.getText().toString();
        String temperature = temperatureInput.getText().toString();

        SharedPreferences preferences = getSharedPreferences("AlertSettings", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("heartRate", heartRate);
        editor.putString("bloodPressure", bloodPressure);
        editor.putString("temperature", temperature);
        editor.apply();

        Toast.makeText(AlertSettingsActivity.this, "Configuración de alertas guardada", Toast.LENGTH_SHORT).show();
    }
}
