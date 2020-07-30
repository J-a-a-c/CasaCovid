package com.example.casacovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


public class login_activity extends AppCompatActivity {

    final private int REQUEST_CODE_ASK_PERMISSION=111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        getSupportActionBar().hide();

        solicitarPermisos();

        TextView gotoRegister=(TextView)findViewById(R.id.gotoRegister);
        gotoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Registro_activity.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), lineas_emergencia.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    private void solicitarPermisos() {
        int permisoCall = ActivityCompat.checkSelfPermission(login_activity.this, Manifest.permission.CALL_PHONE);

        if (permisoCall!= PackageManager.PERMISSION_GRANTED){

            if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                requestPermissions(new String[]{Manifest.permission.CALL_PHONE},REQUEST_CODE_ASK_PERMISSION);
            }
        }
    }

}