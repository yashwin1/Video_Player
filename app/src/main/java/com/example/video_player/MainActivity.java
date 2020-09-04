package com.example.video_player;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;      //Video Player with the play/pause/stop buttons

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView yashwinVideoView = (VideoView) findViewById(R.id.yashwinVideoView);
        yashwinVideoView.setVideoPath("https://www.youtube.com/watch?v=bo_efYhYU2A");

//      Player controls(play, pause, stop, ...)
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(yashwinVideoView);
        yashwinVideoView.setMediaController(mediaController);

        yashwinVideoView.start();

    }
}
