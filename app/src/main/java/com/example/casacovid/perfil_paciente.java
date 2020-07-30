package com.example.casacovid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class perfil_paciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_paciente);
        getSupportActionBar().hide();
    }
}