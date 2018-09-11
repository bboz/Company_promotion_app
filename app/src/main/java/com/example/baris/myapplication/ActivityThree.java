package com.example.baris.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class ActivityThree extends YouTubeBaseActivity {

    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess
                    (YouTubePlayer.Provider provider,
                     YouTubePlayer youTubePlayer,
                     boolean b) {
                youTubePlayer.loadVideo("f3FKj0n89E8");
            }
            @Override
            public void onInitializationFailure
                    (YouTubePlayer.Provider provider,
                     YouTubeInitializationResult
                             youTubeInitializationResult) {
            }
        };
        youTubePlayerView.initialize
                ("AIzaSyD_vDtGc6lWgOYsWjVVAJe4orEiG-MATLY"
                ,onInitializedListener);
    }
}
