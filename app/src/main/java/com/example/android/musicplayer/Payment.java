package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Identify Home Button
        Button backHome = (Button) findViewById(R.id.back_home);

        // Set a click listener on that View
        backHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent goBackHome = new Intent(Payment.this, MainActivity.class);

                // Start the new activity
                startActivity(goBackHome);
            }
        });

        // Identify Now Playing Button
        Button nowPlaying = (Button) findViewById(R.id.now_playing_payment);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlaying}
                Intent nowPlayingIntent = new Intent(Payment.this, NowPlaying.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
