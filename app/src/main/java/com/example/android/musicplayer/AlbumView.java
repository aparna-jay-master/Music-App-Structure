package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AlbumView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_view);

        // Find the View that is attached to the artist
        TextView saraBareilles = (TextView) findViewById(R.id.sara_bareilles);

        // Set a click listener on that View
        saraBareilles.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistView}
                Intent artistIntent = new Intent(AlbumView.this, ArtistView.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });

        // Identify which song was clicked
        TextView braveSong = (TextView) findViewById(R.id.brave_song);

        // Set a click listener on that View
        braveSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Brave song is clicked.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlaying}
                Intent nowPlayingIntent = new Intent(AlbumView.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

    }
}
