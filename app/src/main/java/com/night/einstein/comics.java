package com.night.einstein;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class comics extends AppCompatActivity {
    private WebView myWebView;
    Button refresh, close, zoomIn, zoomOut;

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comics);



        myWebView = findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://dynamic.xkcd.com/random/comic/");
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.setPadding(0, 0, 0, 0);
        myWebView.setInitialScale(getScale());

        myWebView.clearCache(true);
        myWebView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        close = findViewById(R.id.btnClose);
        refresh = findViewById(R.id.refreshRandom);
        zoomIn = findViewById(R.id.zoomIn);
        zoomOut = findViewById(R.id.zoomOut);


        refresh.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
               //Replaces the current activity with a new instance of the same activity
               startActivity(new Intent(comics.this, comics.class));
               //Removes animation from reloading the Activity
               overridePendingTransition(0, 0);
               finish();
           }


                                   });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Moves from the current activity to the MainActivity
                Intent terminate = new Intent(comics.this, MainActivity.class);
                terminate.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(terminate);
                finish();
            }
        });

        zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.zoomIn();
            }
        });
        zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.zoomOut();
            }
        });

       /* String url = "http://dynamic.xkcd.com/random/comic/";
        ImageView imageView = findViewById(R.id.imageView);
        Picasso.with(comics.this).load(url).into(imageView); */

    }

   /* @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    } */



    @Override
    public void onBackPressed() {
    }

    private int getScale(){
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        Double val =  2.5 * width / (double) 1920;
        val = val * 100d;
        return val.intValue();
    }
}

