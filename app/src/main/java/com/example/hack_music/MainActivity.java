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

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private Button trumpet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        trumpet = findViewById(R.id.trumpet);
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

    }

    private void openTrumpet() {
        Intent intent = new Intent(this,trumpet.class);
        startActivity(intent);
    }
}
