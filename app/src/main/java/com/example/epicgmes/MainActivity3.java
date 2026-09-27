package com.example.epicgmes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        // Logo da Epic Games -> MainActivity
        ImageView logo = findViewById(R.id.imageView15);
        if (logo != null) {
            logo.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            });
        }

        // Descobrir -> MainActivity
        TextView descobrir = findViewById(R.id.textView4);
        if (descobrir != null) {
            descobrir.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            });
        }

        // Navegar -> MainActivity2
        TextView navegar = findViewById(R.id.textView3);
        if (navegar != null) {
            navegar.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            });
        }

        // Novidades -> Já está na MainActivity3
        TextView novidades = findViewById(R.id.textView2);
        if (novidades != null) {
            novidades.setOnClickListener(v -> {
                // Já está aqui
            });
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
