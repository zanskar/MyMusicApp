package com.example.android.mymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NinetiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of nineties songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("The Cranberries", "Zombie",
                R.drawable.hp));
        songs.add(new Song("Lou Bega", "Mambo N°5",
                R.drawable.hp));
        songs.add(new Song("Ace of Base", "All that she wants",
                R.drawable.hp));
        songs.add(new Song("Bryan Adams", "Everything I do, I do it for you",
                R.drawable.hp));
        songs.add(new Song("Elton John", "Candle in the wind",
                R.drawable.hp));
        songs.add(new Song("Wuthney Houston", "I will always love you",
                R.drawable.hp));
        songs.add(new Song("Celine Dion", "My heart will go on",
                R.drawable.hp));
        songs.add(new Song("Sinead O\'Connor", "Nothing compares to you",
                R.drawable.hp));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_nineties);

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
