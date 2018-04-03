package com.example.android.mymusicapp;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ThousandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of thousand songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Black Eyed Peas", "Gotta feeling",
                R.drawable.notes));
        songs.add(new Song("Justin Timberlake", "Rock your body",
                R.drawable.notes));
        songs.add(new Song("Daft Punk", "One more time",
                R.drawable.notes));
        songs.add(new Song("Lady Gaga", "Bad romance",
                R.drawable.notes));
        songs.add(new Song("Coldplay", "Viva la vida",
                R.drawable.notes));
        songs.add(new Song("Rihanna", "Please don\'t stop the music",
                R.drawable.notes));
        songs.add(new Song("Norah Jones", "Come away with me",
                R.drawable.notes));
        songs.add(new Song("Pink", "Get the party started",
                R.drawable.notes));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_thousand);

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
                // Create a new intent to open the {@link PlayingActivity}
                Intent playingIntent = new Intent(ThousandActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(playingIntent);
            }
        });
    }
}