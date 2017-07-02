package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_view);

        // Find the View that store the album
        TextView saraBareilles = (TextView) findViewById(R.id.sara_bareilles);

        // Set a click listener on that View
        saraBareilles.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ArtistIntent = new Intent(AlbumView.this, ArtistView.class);

                // Start the new activity
                startActivity(ArtistIntent);
            }
        });

    }
}
