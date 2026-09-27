package com.example.epicgmes;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        // Ajuste de margens
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Aplicar risco no meio do preço original (R$ 59,90)
        TextView tvOriginalPrice = findViewById(R.id.textViewOriginalPrice);
        if (tvOriginalPrice != null) {
            tvOriginalPrice.setPaintFlags(tvOriginalPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }

        // Botão Baixar Jogo
        Button btnBaixar = findViewById(R.id.btnBaixarJogo);
        if (btnBaixar != null) {
            btnBaixar.setOnClickListener(v -> {
                Toast.makeText(MainActivity5.this, "Iniciando download de Five Nights at Freddy's: Into the Pit...", Toast.LENGTH_LONG).show();
            });
        }

        // Navegação do Header
        ImageView logo = findViewById(R.id.imageView17);
        if (logo != null) {
            logo.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity5.this, MainActivity.class));
            });
        }

        TextView descobrir = findViewById(R.id.textViewDescobrir5);
        if (descobrir != null) {
            descobrir.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity5.this, MainActivity.class));
            });
        }

        TextView navegar = findViewById(R.id.textViewNavegar5);
        if (navegar != null) {
            navegar.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity5.this, MainActivity2.class));
            });
        }

        TextView novidades = findViewById(R.id.textViewNovidades5);
        if (novidades != null) {
            novidades.setOnClickListener(v -> {
                startActivity(new Intent(MainActivity5.this, MainActivity3.class));
            });
        }
    }
}
