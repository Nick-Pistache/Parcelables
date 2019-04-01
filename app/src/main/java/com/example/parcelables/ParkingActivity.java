package com.example.parcelables;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.parcelables.MainActivity.PARKING_ACTIVITY;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        Intent fromMainActivity = getIntent();
        Vehicule vehicule = fromMainActivity.getParcelableExtra(PARKING_ACTIVITY);
        TextView brandText = findViewById(R.id.textView);
        TextView kilometersText = findViewById(R.id.textView2);


        String vehiculeString = vehicule.getBrand();
        String kilometersString = Integer.toString(vehicule.getKilometers());
        brandText.setText(vehiculeString);
        kilometersText.setText(kilometersString);
    }
}
