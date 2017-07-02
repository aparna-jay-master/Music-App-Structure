package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ArtistView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_view);

        // Find the View that store the album
        ImageView theBlessedUnrest = (ImageView) findViewById(R.id.blessed_unrest_album);

        // Set a click listener on that View
        theBlessedUnrest.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent AlbumIntent = new Intent(ArtistView.this, AlbumView.class);

                // Start the new activity
                startActivity(AlbumIntent);
            }
        });
    }
}
