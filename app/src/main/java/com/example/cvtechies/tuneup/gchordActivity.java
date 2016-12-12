package com.example.cvtechies.tuneup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class gchordActivity extends AppCompatActivity {
    //buttons for taking the user back to the home screen or back to the chord list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gchord);
        ImageButton goHomeG = (ImageButton) findViewById(R.id.home_but_g);
        goHomeG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gchordActivity.this, userinfoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton chordListButton = (ImageButton) findViewById(R.id.back_g);
        chordListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gchordActivity.this, chordActivity.class);
                startActivity(intent);
            }
        });


    }
}
