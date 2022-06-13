package com.example.falaseries.control;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.falaseries.R;

public class SearchSerie extends AppCompatActivity {

    private ImageButton voltar, image_1, image_2, image_3,image_4, image_5, image_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_serie);

        getSupportActionBar().hide();
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchSerie.this, SerieRegister.class);
                startActivity(intent);
            }
        });
        image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchSerie.this, SerieDescription.class);
                startActivity(intent);
            }
        });

        image_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchSerie.this,SerieDescription.class);
                startActivity(intent);
            }
        });

        image_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchSerie.this,SerieDescription.class);
                startActivity(intent);
            }
        });

        image_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchSerie.this,SerieDescription.class);
                startActivity(intent);
            }
        });

        image_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchSerie.this,SerieDescription.class);
                startActivity(intent);
            }
        });

        image_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchSerie.this,SerieDescription.class);
                startActivity(intent);
            }
        });
    }
    private void IniciarComponentes() {
        voltar = findViewById(R.id.back);
        image_1 = findViewById(R.id.image_1);
        image_2 = findViewById(R.id.image_2);
        image_3 = findViewById(R.id.image_3);
        image_4 = findViewById(R.id.image_4);
        image_5 = findViewById(R.id.image_5);
        image_6 = findViewById(R.id.image_6);
    }
}