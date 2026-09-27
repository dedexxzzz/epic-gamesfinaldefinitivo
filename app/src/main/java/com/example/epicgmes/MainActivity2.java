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

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        // Logo da Epic Games -> MainActivity
        ImageView logo = findViewById(R.id.imageView14);
        if (logo != null) {
            logo.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            });
        }

        // Descobrir -> MainActivity
        TextView descobrir = findViewById(R.id.textView7);
        if (descobrir != null) {
            descobrir.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            });
        }

        // Navegar -> Já está na MainActivity2
        TextView navegar = findViewById(R.id.textView8);
        if (navegar != null) {
            navegar.setOnClickListener(v -> {
                // Já está aqui
            });
        }

        // Novidades -> MainActivity3
        TextView novidades = findViewById(R.id.textView9);
        if (novidades != null) {
            novidades.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            });
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
