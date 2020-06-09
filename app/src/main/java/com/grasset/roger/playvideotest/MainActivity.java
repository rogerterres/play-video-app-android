package com.grasset.roger.playvideotest;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=5200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);

        VideoView mvideoView = (VideoView)findViewById(R.id.MyVideoView);
        String uriPath = "android.resource://com.grasset.roger.playvideotest/"+R.raw.logoroger;

        Uri uri = Uri.parse(uriPath);
        mvideoView.setVideoURI(uri);
        mvideoView.requestFocus();
        mvideoView.start();
    }
}
