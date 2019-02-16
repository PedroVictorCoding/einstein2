package com.night.einstein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeEinsteinPlayer extends YouTubeBaseActivity {

    private static final String API_KEY_CREDENTIAL = "AIzaSyBCebRfltYk1crlrvk8zdwEZVQz9Nmsu2Y";

    static String getApiKey(){
        return API_KEY_CREDENTIAL;

    }
    private static final String TAG = "YoutubeEinsteinPlayer";

    YouTubePlayerView mYoutubePlayerView;
    YouTubePlayer.OnInitializedListener mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {

        @Override
        public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
            Log.d(TAG, "onCreate: Done initializing.");
            youTubePlayer.loadPlaylist("PLSV9jDSU47bAfg9lLxJsYi6EwaGy8qTZX");
        }

        @Override
        public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            Intent intent = new Intent(getApplicationContext(), YoutubeEinsteinPlayer.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "There was an error, try to reopen the app",
                    Toast.LENGTH_LONG).show();
        }
    };


    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_einstein_player);
        Log.d(TAG, "onCreate: Starting.");
        btnClose = findViewById(R.id.btnClose);
        mYoutubePlayerView = findViewById(R.id.youtubePlay);
        mYoutubePlayerView.initialize(getApiKey(), mOnInitializedListener);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent intent = new Intent(YoutubeEinsteinPlayer.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
       /* Intent intent = new Intent(YoutubeEinsteinPlayer.this, YoutubeEinsteinPlayer.class);
        startActivity(intent); */
        }
    }

