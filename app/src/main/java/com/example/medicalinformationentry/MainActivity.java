package com.example.medicalinformationentry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private CardView cardViewFreeClinic;
    private CardView cardViewHomeVisit;
    private CardView cardViewHealthEducation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewFreeClinic = findViewById(R.id.cardViewFreeClinic);
        cardViewHomeVisit = findViewById(R.id.cardViewHomeVisit);
        cardViewHealthEducation = findViewById(R.id.cardViewHealthEducation);

        cardViewFreeClinic.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FreeClinicActivity.class);
            startActivity(intent);
        });

        cardViewHomeVisit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomeVisitActivity.class);
            startActivity(intent);
        });

        cardViewHealthEducation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HealthEducationActivity.class);
            startActivity(intent);
        });
    }
}
