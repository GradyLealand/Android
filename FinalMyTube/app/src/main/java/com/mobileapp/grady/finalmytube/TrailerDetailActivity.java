package com.mobileapp.grady.finalmytube;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by Grady on 2017-12-10.
 */

public class TrailerDetailActivity extends YouTubeBaseActivity {
    public static final String TAG = "TrailerDetail:";

    YouTubePlayerView mYouTubePlayerView;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "On create finished");
        mYouTubePlayerView = findViewById(R.id.YouTubePlayer);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("5guMumPFBag");
                Log.d(TAG, "done Initializing");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "Failed to Initialize");
            }
        };

        Button btnPlay = (Button)findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Initializing player");
                mYouTubePlayerView.initialize("AIzaSyC_maAvNYJjHGQT1ocwOGLTvsSBqf1d634", mOnInitializedListener);
            }
        });


    }
}
