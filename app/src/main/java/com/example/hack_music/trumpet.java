package com.example.hack_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trumpet extends AppCompatActivity {
    private Button flute;
    private Button piano;
    private Button violin;
    private Button trumpet_G3;
    private Button trumpet_C5;
    private Button trumpet_C6;
    private Button trumpet_C4;
    private Button trumpet_G4;
    private Button trumpet_G5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trumpet);

        flute = findViewById(R.id.flute);
        piano = findViewById(R.id.piano);
        violin = findViewById(R.id.violin);

        trumpet_G3 = findViewById(R.id.trumpet_G3);
        trumpet_C5 = findViewById(R.id.trumpet_C5);
        trumpet_C6 = findViewById(R.id.trumpet_C6);
        trumpet_C4 = findViewById(R.id.trumpet_C4);
        trumpet_G4 = findViewById(R.id.trumpet_G4);
        trumpet_G5 = findViewById(R.id.trumpet_G5);

        final MediaPlayer mediaPlayer_trumpetG3 = MediaPlayer.create( this, R.raw.trumpet_g3);
        final MediaPlayer mediaPlayer_trumpetC5 = MediaPlayer.create( this, R.raw.trumpet_c5);
        final MediaPlayer mediaPlayer_trumpetC6 = MediaPlayer.create( this, R.raw.trumpet_c6);
        final MediaPlayer mediaPlayer_trumpetC4 = MediaPlayer.create( this, R.raw.trumpet_c4);
        final MediaPlayer mediaPlayer_trumpetG4 = MediaPlayer.create( this, R.raw.trumpet_g4);
        final MediaPlayer mediaPlayer_trumpetG5 = MediaPlayer.create( this, R.raw.trumpet_g5);

        flute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFlute();
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
        trumpet_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer_trumpetG3.seekTo(2);
                mediaPlayer_trumpetG3.start();
            }
        });
        trumpet_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer_trumpetC5.seekTo(2);
                mediaPlayer_trumpetC5.start();
            }
        });
        trumpet_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer_trumpetC6.seekTo(2);
                mediaPlayer_trumpetC6.start();
            }
        });
        trumpet_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer_trumpetC4.seekTo(2);
                mediaPlayer_trumpetC4.start();
            }
        });
        trumpet_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer_trumpetG4.seekTo(2);
                mediaPlayer_trumpetG4.start();
            }
        });
        trumpet_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer_trumpetG5.seekTo(2);
                mediaPlayer_trumpetG5.start();
            }
        });

    }
    private void openPiano() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void openViolin() {
        Intent intent = new Intent(this,violin.class);
        startActivity(intent);
    }

    private void openFlute() {
        Intent intent = new Intent(this,flute.class);
        startActivity(intent);
    }
}