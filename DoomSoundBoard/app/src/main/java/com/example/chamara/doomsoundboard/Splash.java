package com.example.chamara.doomsoundboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by leiroux on 11/5/2015.
 */
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread splasher = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                    Intent Doom = new Intent(getApplicationContext(), DoomSoundBoard.class);
                    startActivity(Doom);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splasher.start();
    }
}
