package com.example.casacovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        CardView card1 = (CardView) findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), recomendaciones.class);
                startActivityForResult(intent, 0);
            }
        });

        CardView card2 = (CardView) findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), lineas_emergencia.class);
                startActivityForResult(intent, 0);
            }
        });

        CardView card3 = (CardView) findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), sintomas.class);
                startActivityForResult(intent, 0);
            }
        });

        CardView card4 = (CardView) findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), covid19.class);
                startActivityForResult(intent, 0);
            }
        });

        CardView card5 = (CardView) findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), PaginaEmergencia.class);
                startActivityForResult(intent, 0);
            }
        });

        CardView card6 = (CardView) findViewById(R.id.card6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), sobre_nosotros.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}