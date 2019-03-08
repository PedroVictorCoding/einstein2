package com.night.einstein;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import su.levenetc.android.textsurface.Text;
import su.levenetc.android.textsurface.TextBuilder;
import su.levenetc.android.textsurface.TextSurface;
import su.levenetc.android.textsurface.animations.Alpha;
import su.levenetc.android.textsurface.animations.Delay;
import su.levenetc.android.textsurface.animations.Sequential;
import su.levenetc.android.textsurface.animations.Slide;
import su.levenetc.android.textsurface.contants.Align;
import su.levenetc.android.textsurface.contants.Side;

public class SplashScreen extends AppCompatActivity {

    TextSurface textAnimated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
       /* getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); */




        new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent intent = new Intent(SplashScreen.this, EinsteinsOwl.class);
                startActivity(intent);
                finish();

            }

        }, 1000);

     /*   textAnimated = findViewById(R.id.textAnimation);
        Text text = TextBuilder
                .create("einstein")
                .setSize(30)
                .setAlpha(0)
                .setColor(Color.WHITE)
                .setPosition(Align.SURFACE_CENTER).build();

        textAnimated.play(
                new Sequential(
                        Slide.showFrom(Side.TOP, text, 500),
                        Delay.duration(500),
                        Alpha.hide(text, 1500)
                )
        ); */

    }
}
