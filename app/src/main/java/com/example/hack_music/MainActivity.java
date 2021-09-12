package com.example.hack_music;
/** hello my name is wayland*/
/** hello my name is wayland*/
/** hello my name is wayland*/
/** hello my name is wayland*/
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button G3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        G3 = findViewById(R.id.G3);
        final MediaPlayer mediaPlayer = MediaPlayer.create( this, R.raw.piano);
        G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
}
