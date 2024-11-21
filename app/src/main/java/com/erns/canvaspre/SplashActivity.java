package com.erns.canvaspre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Encontrar el botón en el layout
        Button startButton = findViewById(R.id.startButton);

        // Listener para el botón "Empezar"
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar LoginActivity cuando se hace clic en el botón
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();  // Finalizar la SplashActivity para que no regrese al presionar atrás
            }
        });
    }
}
