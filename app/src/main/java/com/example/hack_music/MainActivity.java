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
    private Button violin;
    private Button flute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trumpet = findViewById(R.id.trumpet);
        violin = findViewById(R.id.violin);
        flute = findViewById(R.id.flute);

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

    private void openViolin() {
        Intent intent = new Intent(this,violin.class);
        startActivity(intent);
    }

    private void openTrumpet() {
        Intent intent = new Intent(this,trumpet.class);
        startActivity(intent);
    }
}
