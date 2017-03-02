package com.example.prueba;


import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.LocationManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.location.Location;
import android.Manifest;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;


public class PreguntasActivity extends AppCompatActivity {

    Button buttonActualizar;
    TextView textViewLatitud;
    TextView textViewLongitud;




    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);


        buttonActualizar = (Button) findViewById(R.id.buttonActualizar);
        textViewLatitud = (TextView) findViewById(R.id.textViewLatitud);
        textViewLongitud = (TextView) findViewById(R.id.textViewLongitud);


        buttonActualizar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }









}



