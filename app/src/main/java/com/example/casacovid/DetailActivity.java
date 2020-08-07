package com.example.casacovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private  int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Detalles de "+paises_afectados.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(paises_afectados.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(paises_afectados.countryModelsList.get(positionCountry).getCases());
        tvRecovered.setText(paises_afectados.countryModelsList.get(positionCountry).getRecovered());
        tvCritical.setText(paises_afectados.countryModelsList.get(positionCountry).getCritical());
        tvActive.setText(paises_afectados.countryModelsList.get(positionCountry).getActive());
        tvTodayCases.setText(paises_afectados.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(paises_afectados.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(paises_afectados.countryModelsList.get(positionCountry).getTodayDeaths());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}