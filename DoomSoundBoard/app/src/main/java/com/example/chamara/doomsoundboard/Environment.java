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
public class Environment extends AppCompatActivity {


    private Button liftstart, liftstop, door1open, door1close, door2open, door2close, switchon, switchoff, close, stop;
    private SoundPool liftstartsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool liftstopsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool door1opensound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool door1closesound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool door2opensound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool door2closesound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool switchonsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool switchoffsound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private int liftstartliftstart, liftstopliftstop, door1opendoor1open, door1closedoor1close, door2opendoor2open;
    private int door2closedoor2close, switchonswitchon, switchoffswitchoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Environment);

        liftstart = (Button) findViewById(R.id.btnliftstart);
        liftstop = (Button)findViewById(R.id.btnliftstop);
        door1open = (Button)findViewById(R.id.btndoor1open);
        door1close = (Button)findViewById(R.id.btndoor1close);
        door2open = (Button)findViewById(R.id.btndoor2open);
        door2close = (Button)findViewById(R.id.btndoor2close);
        switchon = (Button)findViewById(R.id.btnswitchon);
        switchoff = (Button)findViewById(R.id.btnswitchoff);
        close =  (Button)findViewById(R.id.btnreturn);
        stop = (Button)findViewById(R.id.btnstop);

        liftstartliftstart = liftstartsound.load(this, R.raw.liftstart, 1);
        liftstopliftstop = liftstopsound.load(this, R.raw.liftstop, 1);
        door1opendoor1open = door1opensound.load(this, R.raw.door1open, 1);
        door1closedoor1close = door1closesound.load(this, R.raw.door1close, 1);
        door2opendoor2open = door2opensound.load(this, R.raw.door2open, 1);
        door2closedoor2close = door2closesound.load(this, R.raw.door2close, 1);
        switchonswitchon = switchonsound.load(this, R.raw.switchon, 1);
        switchoffswitchoff = switchoffsound.load(this, R.raw.switchoff, 1);



        liftstart.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                liftstartsound.play(liftstartliftstart, 1, 1, 1, 0, 1);
            }

        });

        liftstop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                liftstopsound.play(liftstopliftstop, 1, 1, 1, 0, 1);
            }

        });

        door1open.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                door1opensound.play(door1opendoor1open, 1, 1, 1, 0, 1);
            }

        });

        door1close.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                door1closesound.play(door1closedoor1close, 1, 1, 1, 0, 1);
            }

        });

        door2open.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                door2opensound.play(door2opendoor2open, 1, 1, 1, 0, 1);
            }

        });

        switchon.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                switchonsound.play(switchonswitchon, 1, 1, 1, 0, 1);
            }

        });

        switchoff.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                switchoffsound.play(switchonswitchon, 1, 1, 1, 0, 1);
            }

        });


        close.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

              finish();
            }

        });

        stop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                liftstartsound.autoPause();
                liftstopsound.autoPause();
                door1opensound.autoPause();
                door1closesound.autoPause();
                door2opensound.autoPause();
                door2closesound.autoPause();
                switchonsound.autoPause();
                switchoffsound.autoPause();


            }

        });


    }


    @Override
    protected void onPause() {
        super.onPause();
        liftstartsound.autoPause();
        liftstopsound.autoPause();
        door1opensound.autoPause();
        door1closesound.autoPause();
        door2opensound.autoPause();
        door2closesound.autoPause();
        switchonsound.autoPause();
        switchoffsound.autoPause();
    }


}
