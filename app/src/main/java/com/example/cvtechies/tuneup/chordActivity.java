package com.example.cvtechies.tuneup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class chordActivity extends AppCompatActivity {

    //Thse are all the buttons that take the user to the specific chord/help screen they want to view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord);
        ImageButton goHomeChords = (ImageButton) findViewById(R.id.home_but_c);
        goHomeChords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chordActivity.this, userinfoActivity.class);
                startActivity(intent);
            }
        });

        Button gchordbutton = (Button) findViewById(R.id.g_chord);
        gchordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chordActivity.this,gchordActivity.class);
                startActivity(intent);
            }
        });

        Button cchordbutton = (Button) findViewById(R.id.c_chord);
        cchordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chordActivity.this,cchordActivity.class);
                startActivity(intent);
            }
        });

        Button achordbutton = (Button) findViewById(R.id.a_chord);
        achordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chordActivity.this,achordActivity.class);
                startActivity(intent);
            }
        });

        Button dchordbutton = (Button) findViewById(R.id.d_chord);
        dchordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chordActivity.this,dchordActivity.class);
                startActivity(intent);
            }
        });

        Button echordbutton = (Button) findViewById(R.id.e_chord);
        echordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chordActivity.this,echordActivity.class);
                startActivity(intent);
            }
        });

        ImageButton helpbutton = (ImageButton) findViewById(R.id.help);
        helpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chordActivity.this,helpActivity.class);
                startActivity(intent);
            }
        });
    }
}
