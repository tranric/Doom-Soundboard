package com.example.chamara.doomsoundboard;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by leiroux on 11/13/2015.
 */
public class Music extends AppCompatActivity {


    private Button atdoomsgate, hidingthesecrets, intermissionfromdoom, isawedthedemons, signofevil, sweetlittledeadbunny, thedemonsdead;
    private Button theendofDOOM, stop, btnreturn;
    private MediaPlayer atdoomsgatesound, hidingthesecretssound, intermissionfromdoomsound, isawedthedemonssound, signofevilsound;
    private MediaPlayer sweetlittledeadbunnysound, thedemonsdeadsound, theendofDOOMsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Music);

        atdoomsgate = (Button)findViewById(R.id.btnatdoomsgate);
        hidingthesecrets = (Button)findViewById(R.id.btnhidingthesecrets);
        intermissionfromdoom = (Button)findViewById(R.id.btnintermissionfromdoom);
        isawedthedemons = (Button)findViewById(R.id.btnisawedthedemons);
        signofevil = (Button)findViewById(R.id.btnsignofevil);
        sweetlittledeadbunny = (Button)findViewById(R.id.btnsweetlittledeadbunny);
        thedemonsdead = (Button)findViewById(R.id.btnthedemonsdead);
        theendofDOOM = (Button)findViewById(R.id.btntheendofdoom);


        atdoomsgatesound = MediaPlayer.create(Music.this, R.raw.atdoomsgate);
        hidingthesecretssound = MediaPlayer.create(Music.this, R.raw.hidingthesecrets);
        intermissionfromdoomsound = MediaPlayer.create(Music.this, R.raw.intermissionfromdoom);
        isawedthedemonssound = MediaPlayer.create(Music.this, R.raw.isawedthedemons);
        signofevilsound = MediaPlayer.create(Music.this, R.raw.signofevil);
        sweetlittledeadbunnysound = MediaPlayer.create(Music.this, R.raw.sweetlittledeadbunny);
        thedemonsdeadsound = MediaPlayer.create(Music.this, R.raw.thedemonsdead);
        theendofDOOMsound = MediaPlayer.create(Music.this, R.raw.theendofdoom);
        stop = (Button)findViewById(R.id.btnstop);
        btnreturn = (Button)findViewById(R.id.btnreturn);

        atdoomsgate.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                atdoomsgatesound.start();

            }

        });

        hidingthesecrets.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                hidingthesecretssound.start();
            }

        });


        intermissionfromdoom.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                intermissionfromdoomsound.start();
            }

        });

        isawedthedemons.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                isawedthedemonssound.start();
            }

        });

        signofevil.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                signofevilsound.start();
            }

        });
        sweetlittledeadbunny.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                sweetlittledeadbunnysound.start();
            }

        });

        thedemonsdead.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                thedemonsdeadsound.start();
            }

        });

        theendofDOOM.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                theendofDOOMsound.start();
            }

        });

        atdoomsgatesound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                atdoomsgatesound.start();
            }
        });

        hidingthesecretssound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                hidingthesecretssound.start();
            }
        });

        intermissionfromdoomsound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                intermissionfromdoomsound.start();
            }
        });

        isawedthedemonssound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                isawedthedemonssound.start();
            }
        });

        signofevilsound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                signofevilsound.start();
            }
        });

        sweetlittledeadbunnysound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                sweetlittledeadbunnysound.start();
            }
        });

        thedemonsdeadsound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                thedemonsdeadsound.start();
            }
        });
        theendofDOOMsound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                theendofDOOMsound.start();
            }
        });





        stop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                atdoomsgatesound.stop();
                intermissionfromdoomsound.stop();
                hidingthesecretssound.stop();
                isawedthedemonssound.stop();
                signofevilsound.stop();
                sweetlittledeadbunnysound.stop();
                thedemonsdeadsound.stop();
                theendofDOOMsound.stop();
            }

        });

        btnreturn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                finish();


            }

        });


    }

}
