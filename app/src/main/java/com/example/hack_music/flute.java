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
    private Button button2;
    private Button trumpet;
    private Button piano;
    private Button flute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flute);
        button2 = findViewById(R.id.button2);
        trumpet = findViewById(R.id.trumpet);
        piano = findViewById(R.id.piano);
        flute = findViewById(R.id.flute);
        final MediaPlayer mediaPlayer = MediaPlayer.create( this, R.raw.piano);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        trumpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTrumpet();
            }
        });
        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPiano();
            }
        });
        flute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFlute();
            }
        });
    }

    private void openFlute() {
        Intent intent = new Intent(this,flute.class);
        startActivity(intent);
    }

    private void openPiano() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void openTrumpet() {
        Intent intent = new Intent(this,trumpet.class);
        startActivity(intent);
    }
}}