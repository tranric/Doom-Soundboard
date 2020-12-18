package com.example.chamara.doomsoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoomSoundBoard extends AppCompatActivity {

private Button Doomguy1, Enemies1, Environment1, Music1, Weapons1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doom_sound_board);

        Doomguy1 = (Button) findViewById(R.id.txtmusic);
        Enemies1 = (Button) findViewById(R.id.btnenemies);
        Environment1 = (Button) findViewById(R.id.btnenvironment);
        Music1 = (Button) findViewById(R.id.btnchangemusic);
        Weapons1 = (Button) findViewById(R.id.btnweapons);

        Doomguy1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Doomguy.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Enemies1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Weapons1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Weapons.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Environment1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Environment.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Music1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Music.class);
                startActivityForResult(myIntent, 0);
            }

        });



    }
}
