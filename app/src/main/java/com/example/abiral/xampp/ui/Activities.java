package com.example.abiral.xampp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.abiral.xampp.R;

import static android.support.v7.widget.CardView.*;

public class Activities extends AppCompatActivity {

    CardView Workout, Aboutus, FindGym, Calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_layout);

        Workout = (CardView) findViewById(R.id.card_workouts);
        Aboutus = (CardView) findViewById(R.id.cardView3);
        FindGym = (CardView) findViewById(R.id.cardView4);
        Calculator = (CardView) findViewById(R.id.cardView2);


        Workout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activities.this, Workout_page.class);
                startActivity(intent);
            }
        });
        Aboutus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activities.this, About_Us.class);
                startActivity(intent);
            }
        });
        FindGym.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activities.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        Calculator.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activities.this, BMI_calculate.class);
                startActivity(intent);
            }
        });


    }
}

