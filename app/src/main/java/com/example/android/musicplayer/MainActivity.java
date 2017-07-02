package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that store the album
        ImageView theBlessedUnrest = (ImageView) findViewById(R.id.sara_album_view);

        // Set a click listener on that View
        theBlessedUnrest.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent AlbumIntent = new Intent(MainActivity.this, AlbumView.class);

                // Start the new activity
                startActivity(AlbumIntent);
            }
        });

    }
}