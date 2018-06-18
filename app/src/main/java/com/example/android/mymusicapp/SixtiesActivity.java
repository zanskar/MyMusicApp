package com.example.android.mymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SixtiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of sixties songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Bill Haley", "Rock Around the Clock",
                R.drawable.hp));
        songs.add(new Song("Simon and Garfunkel", "The Sound of Silence",
                R.drawable.hp));
        songs.add(new Song("The Beatles", "I wanna hold your hand",
                R.drawable.hp));
        songs.add(new Song("The Rolling Stones", "I can't get no satisfaction",
                R.drawable.hp));
        songs.add(new Song("The Beach Boys", "Good vibrations",
                R.drawable.hp));
        songs.add(new Song("The animals", "The house of rising sun",
                R.drawable.hp));
        songs.add(new Song("The Beatles", "Come together",
                R.drawable.hp));
        songs.add(new Song("Procol Harum", "A wither shade of pale",
                R.drawable.hp));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_sixties);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Display a toast message saying that thereis no mp3  file yet.
                Toast.makeText(getApplicationContext(), getString(R.string.nofile), Toast.LENGTH_LONG).show();
            }
        });
    }
}
