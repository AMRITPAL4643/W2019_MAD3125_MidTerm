package com.midtermmad3125;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.midtermmad3125.ui.MainCityActivity;

public class SplashscreenActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    private TextView n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        n = findViewById(R.id.txtname);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent = new Intent(SplashscreenActivity.this, MainCityActivity.class);
                startActivity(mIntent);
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}

