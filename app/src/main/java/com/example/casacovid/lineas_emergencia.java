package com.example.casacovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lineas_emergencia extends AppCompatActivity {

    Button
    btnLlamar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineas_emergencia);
        btnLlamar1=(Button) findViewById(R.id.btnLlamar1);

        btnLlamar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL, Uri.parse("tel:113"));
                if(ActivityCompat.checkSelfPermission(lineas_emergencia.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(i);
            }
        });

    }
}