package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ArtistView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_view);

        // Find the View that stores the album
        ImageView theBlessedUnrest = (ImageView) findViewById(R.id.blessed_unrest_album);

        // Set a click listener on that View
        theBlessedUnrest.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumView}
                Intent AlbumIntent = new Intent(ArtistView.this, AlbumView.class);

                // Start the new activity
                startActivity(AlbumIntent);
            }
        });

        // Identify button to go back home
        Button homeButtonArtist = (Button) findViewById(R.id.back_home_artist);

        // Set a click listener on that View
        homeButtonArtist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent goBackHomeArtistIntent = new Intent(ArtistView.this, MainActivity.class);

                // Start the new activity
                startActivity(goBackHomeArtistIntent);
            }
        });
    }
}
