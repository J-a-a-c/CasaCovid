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
    btnLlamar1,btnLlamar2,btnLlamar3,btnLlamar4,btnLlamar5,btnLlamar6,btnLlamar7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineas_emergencia);
        getSupportActionBar().hide();

        btnLlamar1=(Button) findViewById(R.id.btnLlamar1);
        btnLlamar2=(Button) findViewById(R.id.btnLlamar2);
        btnLlamar3=(Button) findViewById(R.id.btnLlamar3);
        btnLlamar4=(Button) findViewById(R.id.btnLlamar4);
        btnLlamar5=(Button) findViewById(R.id.btnLlamar5);
        btnLlamar6=(Button) findViewById(R.id.btnLlamar6);
        btnLlamar7=(Button) findViewById(R.id.btnLlamar7);

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

        btnLlamar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL, Uri.parse("tel:105"));
                if(ActivityCompat.checkSelfPermission(lineas_emergencia.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(i);
            }
        });

        btnLlamar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL, Uri.parse("tel:116"));
                if(ActivityCompat.checkSelfPermission(lineas_emergencia.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(i);
            }
        });

        btnLlamar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL, Uri.parse("tel:115"));
                if(ActivityCompat.checkSelfPermission(lineas_emergencia.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(i);
            }
        });

        btnLlamar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL, Uri.parse("tel:01 261 0502"));
                if(ActivityCompat.checkSelfPermission(lineas_emergencia.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(i);
            }
        });

        btnLlamar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL, Uri.parse("tel:01 265 8783"));
                if(ActivityCompat.checkSelfPermission(lineas_emergencia.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(i);
            }
        });

        btnLlamar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL, Uri.parse("tel:117"));
                if(ActivityCompat.checkSelfPermission(lineas_emergencia.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED)
                    return;
                startActivity(i);
            }
        });



    }
}