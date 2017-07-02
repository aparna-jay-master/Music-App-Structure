package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View that stores the album
        ImageView theBlessedUnrest = (ImageView) findViewById(R.id.blessed_unrest_album_np);

        // Set a click listener on that View
        theBlessedUnrest.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent AlbumIntent = new Intent(NowPlaying.this, AlbumView.class);

                // Start the new activity
                startActivity(AlbumIntent);
            }
        });

        // Find the View that is attached to the artist
        TextView saraBareilles = (TextView) findViewById(R.id.sara_bareilles_np);

        // Set a click listener on that View
        saraBareilles.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistIntent = new Intent(NowPlaying.this, ArtistView.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });
    }
}
