package com.example.jonathan.learningappwk13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoOne extends YouTubeBaseActivity {

    private YouTubePlayerView youtubePlayer1;
    private Button play;
    private YouTubePlayer.OnInitializedListener mOnInitializedListener;
    private TextView textTutorial;
    private static final String TAG = "VideoOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_one);

        youtubePlayer1 = (YouTubePlayerView) findViewById(R.id.youTubePlayerView);
        play = (Button) findViewById(R.id.button7);
        textTutorial = (TextView) findViewById(R.id.tutorialText);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
                if (!wasRestored){
                Log.d(TAG, "onClick: Done initializing Youtube player");
                    youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                    //youTubePlayer.setFullscreen(true);
                    youTubePlayer.loadPlaylist("PLGvDkhT1t0p2xo7BIARlQrjcCqxYLcr0P");
                    youTubePlayer.play();
            }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onInitializationFailure: Failed initializing Youtube player");
            }
        };

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Initializing Youtube player");
                youtubePlayer1.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);

            }
        });
    }
}
