package com.example.hrsh.block4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer pmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pmusic=MediaPlayer.create(this,R.raw.music);
        pmusic.start();
        Button play=(Button) findViewById(R.id.button);
        Button pause=(Button) findViewById(R.id.button2);
        Switch switch_looping=(Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                pmusic.setLooping(isChecked);

            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                    pmusic.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
          if(pmusic.isPlaying()){
                pmusic.pause();
          }


            }
        });

    }
    public void OnDestroy()
    {
        pmusic.pause();
    }
    public void OnPause()
    {
        pmusic.pause();
    }
}
