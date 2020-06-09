package com.grasset.roger.playvideotest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView mvideOView = (VideoView)findViewById(R.id.mvideoViewBIG);
        String uriPath = "android.resource://com.grasset.roger.playvideotest/"+R.raw.pizza;
        Uri uri = Uri.parse(uriPath);
        mvideOView.setVideoURI(uri);
        mvideOView.requestFocus();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mvideOView);
        mvideOView.setMediaController(mediaController);

        mvideOView.start();
    }
}
