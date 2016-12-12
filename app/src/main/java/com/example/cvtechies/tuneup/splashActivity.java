package com.example.cvtechies.tuneup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {
    //This is our splash screen. It displays the the logo along with a loading spinner
    //for 4 seconds before the main activity starts
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(splashActivity.this,MainActivity.class));
                finish();

            }
        },4000);

    }
}
