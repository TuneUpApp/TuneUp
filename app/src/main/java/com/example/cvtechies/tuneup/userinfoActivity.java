package com.example.cvtechies.tuneup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userinfoActivity extends AppCompatActivity {
    //This page is where the user will select which activity they want. The tuner or the chord list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        Button goToChords = (Button) findViewById(R.id.chordButton);
        goToChords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userinfoActivity.this,chordActivity.class);
                startActivity(intent);
            }
        });

        Button goToTuner = (Button) findViewById(R.id.tunerbutton);
        goToTuner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userinfoActivity.this,tunerActivity.class);
                startActivity(intent);
            }
        });

    }
}
