package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput, passwordInput;
    private MaterialButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.username);
        passwordInput = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginbtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    private void loginUser() {
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        // Recuperar credenciales de SharedPreferences
        SharedPreferences preferences = getSharedPreferences("UserCredentials", MODE_PRIVATE);
        String savedUsername = preferences.getString("username", null);
        String savedPassword = preferences.getString("password", null);

        // Verificar credenciales
        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            // Credenciales correctas, redirigir al menú principal
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
            finish(); // Cerrar la actividad de inicio de sesión
        } else {
            // Credenciales incorrectas
            Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
        }
    }
}


