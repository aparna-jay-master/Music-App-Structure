package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Identify View that stores album picture
        ImageView theBlessedUnrest = (ImageView) findViewById(R.id.sara_album_view);

        // Set a click listener on that View
        theBlessedUnrest.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumView}
                Intent AlbumIntent = new Intent(MainActivity.this, AlbumView.class);

                // Start the new activity
                startActivity(AlbumIntent);
            }
        });

        // Identify button
        Button upgradeButton = (Button) findViewById(R.id.upgrade_button);

        // Set a click listener on that View
        upgradeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Payment}
                Intent paymentIntent = new Intent(MainActivity.this, Payment.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });

    }
}
