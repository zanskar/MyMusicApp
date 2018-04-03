package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the sixties category
        TextView sixties = (TextView) findViewById(R.id.sixties);

        // Set a click listener on that View
        sixties.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sixtiesIntent = new Intent(MainActivity.this, SixtiesActivity.class);

                // Start the new activity
                startActivity(sixtiesIntent);
            }
        });
        // Find the View that shows the seventies category
        TextView seventies = (TextView) findViewById(R.id.seventies);

        // Set a click listener on that View
        seventies.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SeventiesActivity}
                Intent seventiesIntent = new Intent(MainActivity.this, SeventiesActivity.class);

                // Start the new activity
                startActivity(seventiesIntent);
            }
        });
        // Find the View that shows the eighties category
        TextView eighties = (TextView) findViewById(R.id.eighties);

        // Set a click listener on that View
        eighties.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EightiesActivity}
                Intent eightiesIntent = new Intent(MainActivity.this, EightiesActivity.class);

                // Start the new activity
                startActivity(eightiesIntent);
            }
        });
        // Find the View that shows the nineties category
        TextView nineties = (TextView) findViewById(R.id.nineties);

        // Set a click listener on that View
        nineties.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NinetiesActivity}
                Intent ninetiesIntent = new Intent(MainActivity.this, NinetiesActivity.class);

                // Start the new activity
                startActivity(ninetiesIntent);
            }
        });
        // Find the View that shows the thousand category
        TextView thousand = (TextView) findViewById(R.id.thousand);

        // Set a click listener on that View
        thousand.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ThousandActivity}
                Intent thousandIntent = new Intent(MainActivity.this, ThousandActivity.class);

                // Start the new activity
                startActivity(thousandIntent);
            }
        });
        // Find the View that shows the thousandten category
        TextView thousandten = (TextView) findViewById(R.id.thousandten);

        // Set a click listener on that View
        thousandten.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SixtiesActivity}
                Intent thousandtenIntent = new Intent(MainActivity.this, ThousandtenActivity.class);

                // Start the new activity
                startActivity(thousandtenIntent);
            }
        });
    }
}
