package com.example.cvtechies.tuneup;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class tunerActivity extends AppCompatActivity {
    //creating a sound controller variable called mySoundController
    private soundController mysoundController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuner);

        //Creating an instance of the soundController class with the name mySoundController
        mysoundController = new soundController();

        //getting the current context of sound controller, which holds the sound pool Map for all the sounds
        mysoundController.soundState(getBaseContext());

        //adding each of the sound files for the appropriate string of the guitar to the sound pool map
        mysoundController.addStringSound(1, R.raw.lowestring);
        mysoundController.addStringSound(2, R.raw.astring);
        mysoundController.addStringSound(5, R.raw.bstring);
        mysoundController.addStringSound(3, R.raw.dstring);
        mysoundController.addStringSound(4, R.raw.gstring);
        mysoundController.addStringSound(6, R.raw.highestring);

        //The functions below are playing each one of the sounds by calling the soundController class'
        //paySound function which takes the appropriate soundID of the strig we want to play for a particular
        //button click

        Button lowEString = (Button) findViewById(R.id.play_e);
        lowEString.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                mysoundController.playString(1);

            }
        });

        Button astring = (Button)findViewById(R.id.play_a);
        astring.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                mysoundController.playString(2);

            }
        });

        Button dstring = (Button)findViewById(R.id.play_d);
        dstring.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                mysoundController.playString(3);

            }
        });

        Button gstring = (Button)findViewById(R.id.play_g);
        gstring.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                mysoundController.playString(4);

            }
        });

        Button bstring = (Button)findViewById(R.id.play_b);
        bstring.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                mysoundController.playString(5);

            }
        });

        Button littlestring = (Button)findViewById(R.id.play_little_e);
        littlestring.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                mysoundController.playString(6);

            }
        });


        ImageButton goHomeTuner = (ImageButton) findViewById(R.id.home_but_tuner);
        goHomeTuner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //since the audio clips are being played in a loop, once the the home button is clicked
                //it calls the soundController stopStrings function to stop all sound being played
                //whichever string it may be
                mysoundController.stopStrings(1);
                mysoundController.stopStrings(2);
                mysoundController.stopStrings(3);
                mysoundController.stopStrings(4);
                mysoundController.stopStrings(5);
                mysoundController.stopStrings(6);
                Intent intent = new Intent(tunerActivity.this, userinfoActivity.class);
                startActivity(intent);
            }
        });

    }


}
