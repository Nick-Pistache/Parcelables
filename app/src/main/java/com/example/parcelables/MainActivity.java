package com.example.parcelables;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String PARKING_ACTIVITY = "PARKING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final TextView brandText = findViewById(R.id.editText);
        final TextView kilometersText = findViewById(R.id.editText2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brandString = brandText.getText().toString();
                int kilometersInt = Integer.parseInt(kilometersText.getText().toString());
                final Vehicule vehicule = new Vehicule(brandString,kilometersInt);
                Intent toParkingActivity = new Intent(MainActivity.this,ParkingActivity.class);
                toParkingActivity.putExtra(PARKING_ACTIVITY,vehicule);
                startActivity(toParkingActivity);
            }
        });
    }
}
