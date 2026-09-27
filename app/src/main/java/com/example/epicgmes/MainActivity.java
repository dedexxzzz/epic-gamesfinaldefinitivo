package com.example.epicgmes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Logo da Epic Games -> MainActivity
        ImageView logo = findViewById(R.id.imageView);
        if (logo != null) {
            logo.setOnClickListener(v -> {
                // Já está na MainActivity
            });
        }
        ImageView logo13 = findViewById(R.id.imageView13);
        if (logo13 != null) {
            logo13.setOnClickListener(v -> {
                // Já está na MainActivity
            });
        }

        // Botão Novidades -> MainActivity3
        Button proxima2 = findViewById(R.id.proximo2);
        if (proxima2 != null) {
            proxima2.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            });
        }

        // Botão Navegar -> MainActivity2
        Button proxima3 = findViewById(R.id.proximo3);
        if (proxima3 != null) {
            proxima3.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            });
        }

        // Botão Evento de Games -> MainActivity4
        Button evento = findViewById(R.id.button2);
        if (evento != null) {
            evento.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            });
        }

        // Botão Jogar agora -> MainActivity5
        Button jogarAgora = findViewById(R.id.button);
        if (jogarAgora != null) {
            jogarAgora.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(intent);
            });
        }

        // ViewPager dos jogos
        ViewPager2 viewPager = findViewById(R.id.viewPagerJogos);

        int[] imagens = {
                R.drawable.battlefield,
                R.drawable.resident,
                R.drawable.phantom1,
                R.drawable.fornite
        };

        String[] precos = {
                "R$ 174,95",
                "R$ 360,54",
                "R$ 249,90",
                "R$ 299,00"
        };

        List<Integer> listaImagens = new ArrayList<>();

        for (int imagem : imagens) {
            listaImagens.add(imagem);
        }

        List<String> listaPrecos = Arrays.asList(precos);

        ImageAdapter adapter = new ImageAdapter(
                listaImagens,
                listaPrecos
        );

        viewPager.setAdapter(adapter);

        // Ajuste das margens da tela
        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (v, insets) -> {

                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars()
                    );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                }
        );
    }
}
