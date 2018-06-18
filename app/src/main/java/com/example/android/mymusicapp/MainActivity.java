package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows each category
        TextView sixties = (TextView) findViewById(R.id.sixties);
        TextView seventies = (TextView) findViewById(R.id.seventies);
        TextView eighties = (TextView) findViewById(R.id.eighties);
        TextView nineties = (TextView) findViewById(R.id.nineties);

        // Set a click listener on each View
        sixties.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sixtiesIntent = new Intent(MainActivity.this, SixtiesActivity.class);

                // Start the new activity
                startActivity(sixtiesIntent);
            }
        });
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
    }
}
