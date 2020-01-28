package com.example.mapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.location.places.PlaceReport;

public class LocationPickerText extends AppCompatActivity {

    Button btnPick;
    TextView textView;
    int PLACE_PICKER_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_picker_text);

        btnPick = findViewById(R.id.btn_picker);
        textView = findViewById(R.id.txt_view);

        btnPick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                PlaceReport
            }
        });
    }
}
