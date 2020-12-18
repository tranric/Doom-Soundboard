package com.example.chamara.doomsoundboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by leiroux on 11/13/2015.
 */
public class Enemies extends AppCompatActivity {

    private Button arachnotron, archvile, baronofhell, cacodemon, cyberdemon, demon, hellknight, iconofsin, imp, lostsoul, mancubus;
    private Button painelemental, revenant, shotgunguy, thespidermastermind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enemies);

        arachnotron = (Button)findViewById(R.id.btnarachnotron);
        archvile = (Button)findViewById(R.id.btnarchvile);
        baronofhell = (Button)findViewById(R.id.btnbaronofhell);
        cacodemon = (Button)findViewById(R.id.btncacodemon);
        cyberdemon = (Button)findViewById(R.id.btncyberdemon);
        demon = (Button)findViewById(R.id.btndemon);
        hellknight = (Button)findViewById(R.id.btnhellknight);
        iconofsin = (Button)findViewById(R.id.btniconofsin);
        imp = (Button)findViewById(R.id.btnimp);
        lostsoul = (Button)findViewById(R.id.btnlostsoul);
        mancubus = (Button)findViewById(R.id.btnmancubus);
        painelemental = (Button)findViewById(R.id.btnpainelemental);
        revenant = (Button)findViewById(R.id.btnrevenant);
        shotgunguy = (Button)findViewById(R.id.btnshotgunguy);
        thespidermastermind = (Button)findViewById(R.id.btnthespidermastermind);



        arachnotron.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies1.class);
                startActivityForResult(myIntent, 0);
            }

        });

        archvile.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies2.class);
                startActivityForResult(myIntent, 0);
            }

        });

        baronofhell.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies3.class);
                startActivityForResult(myIntent, 0);
            }

        });

        cacodemon.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies2.class);
                startActivityForResult(myIntent, 0);
            }

        });

        cyberdemon.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies1.class);
                startActivityForResult(myIntent, 0);
            }

        });

        demon.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies2.class);
                startActivityForResult(myIntent, 0);
            }

        });

        hellknight.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies3.class);
                startActivityForResult(myIntent, 0);
            }

        });

        iconofsin.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies4.class);
                startActivityForResult(myIntent, 0);
            }

        });
        imp.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies5.class);
                startActivityForResult(myIntent, 0);
            }

        });
        lostsoul.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies6.class);
                startActivityForResult(myIntent, 0);
            }

        });
        mancubus.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies2.class);
                startActivityForResult(myIntent, 0);
            }

        });
        painelemental.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies2.class);
                startActivityForResult(myIntent, 0);
            }

        });
        revenant.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies2.class);
                startActivityForResult(myIntent, 0);
            }

        });
        shotgunguy.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies7.class);
                startActivityForResult(myIntent, 0);
            }

        });
        thespidermastermind.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Enemies1.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }




}
