package com.example.cvtechies.tuneup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class echordActivity extends AppCompatActivity {
    //buttons for taking the user back to the home screen or back to the chord list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echord);
        ImageButton goHomeE = (ImageButton) findViewById(R.id.home_but_e);
        goHomeE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(echordActivity.this, userinfoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton chordListButton = (ImageButton) findViewById(R.id.back_e);
        chordListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(echordActivity.this, chordActivity.class);
                startActivity(intent);
            }
        });

    }
}
