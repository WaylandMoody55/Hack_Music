package com.example.hack_music;
/** hello my name is wayland*/
/** hello my name is wayland*/
/** hello my name is wayland*/
/** hello my name is wayland*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class flute extends AppCompatActivity {
    private Button trumpet;
    private Button piano;
    private Button violin;

    private Button C5;
    private Button C6;
    private Button C4;
    private Button G4;
    private Button G5;
    private Button G6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flute);

        trumpet = findViewById(R.id.trumpet);
        piano = findViewById(R.id.piano);
        violin = findViewById(R.id.violin);

        C5 = findViewById(R.id.C5);
        C6 = findViewById(R.id.C6);
        C4 = findViewById(R.id.C4);
        G4 = findViewById(R.id.G4);
        G5 = findViewById(R.id.G5);
        G6 = findViewById(R.id.G6);

        final MediaPlayer mediaPlayerG3 = MediaPlayer.create( this, R.raw.piano);
        final MediaPlayer mediaPlayerC5 = MediaPlayer.create( this, R.raw.flute_c5);
        final MediaPlayer mediaPlayerC6 = MediaPlayer.create( this, R.raw.flute_c6);
        final MediaPlayer mediaPlayerC4 = MediaPlayer.create( this, R.raw.flute_c4);
        final MediaPlayer mediaPlayerG4 = MediaPlayer.create( this, R.raw.flute_g4);
        final MediaPlayer mediaPlayerG5 = MediaPlayer.create( this, R.raw.flute_g5);
        final MediaPlayer mediaPlayerG6 = MediaPlayer.create( this, R.raw.flute_g6);


        trumpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTrumpet();
            }
        });
        violin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViolin();
            }
        });
        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPiano();
            }
        });

        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerC5.seekTo(0);
                mediaPlayerC5.start();
            }
        });
        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerC6.seekTo(0);
                mediaPlayerC6.start();
            }
        });
        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerC4.seekTo(0);
                mediaPlayerC4.start();
            }
        });
        G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerG4.seekTo(0);
                mediaPlayerG4.start();
            }
        });
        G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerG5.seekTo(0);
                mediaPlayerG5.start();
            }
        });
        G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerG6.seekTo(0);
                mediaPlayerG6.start();
            }
        });

    }

    private void openPiano() {
        Intent intent = new Intent(this,flute.class);
        startActivity(intent);
    }

    private void openViolin() {
        Intent intent = new Intent(this,violin.class);
        startActivity(intent);
    }

    private void openTrumpet() {
        Intent intent = new Intent(this,trumpet.class);
        startActivity(intent);
    }
}
