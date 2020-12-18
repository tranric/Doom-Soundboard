package com.example.chamara.doomsoundboard;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by leiroux on 11/13/2015.
 */
public class Doomguy  extends AppCompatActivity {

    //make return and stop buttons
    //implement return and input all sounds
    //make a ad remove button.

    private Button itempickup, weaponpickup, powerup, teleport, nextmap, activatehitground, injured, death1, death2, death3;
    private Button stop, close;
    private SoundPool itempickupsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool weaponpickupsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool powerupsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool teleportsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool nextmapsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool activatehitgroundsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool injuredsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool death1sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool death2sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool death3sound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private int itempickupitempickup, weaponpickupweaponpickup, poweruppowerup, teleportteleport, nextmapnextmap;
    private int activatehitgroundactivatehitground, injuredinjured, death1death1, death2death2, death3death3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Doomguy);

        itempickup = (Button) findViewById(R.id.btnitempickup);
        weaponpickup = (Button)findViewById(R.id.btnweaponpickup);
        powerup = (Button)findViewById(R.id.btnpowerup);
        teleport = (Button)findViewById(R.id.btnteleport);
        nextmap = (Button)findViewById(R.id.btnnextmap);
        activatehitground = (Button)findViewById(R.id.btnactivatehitground);
        injured = (Button)findViewById(R.id.btninjured);
        death1 = (Button)findViewById(R.id.btndeath1);
        death2 = (Button)findViewById(R.id.btndeath2);
        death3 = (Button)findViewById(R.id.btndeath3);
        stop = (Button)findViewById(R.id.btnstop);
        close = (Button)findViewById(R.id.btnreturn);

        itempickupitempickup = itempickupsound.load(this, R.raw.doomguyitempickup, 1);
        weaponpickupweaponpickup = weaponpickupsound.load(this, R.raw.doomguyweaponpickup, 1);
        poweruppowerup = powerupsound.load(this, R.raw.doomguypowerup, 1);
        teleportteleport = teleportsound.load(this, R.raw.doomguyteleport, 1);
        nextmapnextmap = nextmapsound.load(this, R.raw.doomguynextmap, 1);
        activatehitgroundactivatehitground = activatehitgroundsound.load(this, R.raw.doomguyactivate, 1);
        injuredinjured = injuredsound.load(this, R.raw.doomguyinjured, 1);
        death1death1 = death1sound.load(this, R.raw.doomguydeath1, 1);
        death2death2 = death2sound.load(this, R.raw.doomguydeath2, 1);
        death3death3 = death3sound.load(this, R.raw.doomguydeath3, 1);



        itempickup.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                itempickupsound.play(itempickupitempickup, 1, 1, 1, 0, 1);
            }

        });

        weaponpickup.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                weaponpickupsound.play(weaponpickupweaponpickup, 1, 1, 1, 0, 1);
            }

        });

        powerup.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                powerupsound.play(poweruppowerup, 1, 1, 1, 0, 1);
            }

        });

        teleport.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                teleportsound.play(teleportteleport, 1, 1, 1, 0, 1);
            }

        });

        nextmap.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                nextmapsound.play(nextmapnextmap, 1, 1, 1, 0, 1);
            }

        });

        activatehitground.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                activatehitgroundsound.play(activatehitgroundactivatehitground, 1, 1, 1, 0, 1);
            }

        });

        injured.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                injuredsound.play(injuredinjured, 1, 1, 1, 0, 1);
            }

        });

        death1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                death1sound.play(death1death1, 1, 1, 1, 0, 1);
            }

        });

        death2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                death2sound.play(death2death2, 1, 1, 1, 0, 1);
            }

        });

        death3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                death3sound.play(death3death3, 1, 1, 1, 0, 1);
            }

        });


        close.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

              finish();
            }

        });

        stop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                itempickupsound.autoPause();
                weaponpickupsound.autoPause();
                powerupsound.autoPause();
                teleportsound.autoPause();
                nextmapsound.autoPause();
                activatehitgroundsound.autoPause();
                injuredsound.autoPause();
                death1sound.autoPause();
                death2sound.autoPause();
                death3sound.autoPause();
            }

        });


    }


    @Override
    protected void onPause() {
        super.onPause();
        itempickupsound.autoPause();
        weaponpickupsound.autoPause();
        powerupsound.autoPause();
        teleportsound.autoPause();
        nextmapsound.autoPause();
        activatehitgroundsound.autoPause();
        injuredsound.autoPause();
        death1sound.autoPause();
        death2sound.autoPause();
        death3sound.autoPause();
    }


}
