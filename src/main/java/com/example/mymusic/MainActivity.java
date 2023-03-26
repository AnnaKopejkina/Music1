package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
private MediaPlayer MediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonId);

        button.setOnClickListener(event -> {
            System.out.println("включилась музыка");

            MediaPlayer = android.media.MediaPlayer.create(this, R.raw.shny);
            MediaPlayer.start();
        });
    }


}



