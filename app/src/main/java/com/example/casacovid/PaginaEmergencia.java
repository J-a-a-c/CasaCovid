package com.example.casacovid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PaginaEmergencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_emergencia);
        getSupportActionBar().hide();
    }
}