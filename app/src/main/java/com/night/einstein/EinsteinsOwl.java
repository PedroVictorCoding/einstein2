package com.night.einstein;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.night.einstein.courses.History.HistoryIntroActivity;
import com.night.einstein.courses.Philosophy.PhilosophyIntroActivity;
import com.night.einstein.courses.Physics.PhysicsIntroActivity;

public class EinsteinsOwl extends AppCompatActivity {

    Button philosophyIntro, physicsIntro;
    ImageButton close, button, buttonWords, buttonArticle;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owl);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        button = findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EinsteinsOwl.this, YoutubeEinsteinPlayer.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        /* btnOwl = findViewById(R.id.btn4);
        btnOwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(articleView.this, EinsteinsOwl.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }); */

      buttonWords = findViewById(R.id.btn2);
        buttonWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EinsteinsOwl.this, articleView.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        buttonArticle = findViewById(R.id.btn3);
        buttonArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EinsteinsOwl.this, ArticleActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


      /*  close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Moves from the current activity to the MainActivity
                Intent terminate = new Intent(EinsteinsOwl.this, MainActivity.class);
                terminate.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(terminate);
                finish();
            }
        }); */


        ImageView physics = findViewById(R.id.physicsIntro);
        Glide.with(this).load(R.drawable.elonphysics).into(physics);

        ImageView chemistry = findViewById(R.id.chemistryIntro);
        Glide.with(this).load(R.drawable.tubetestchemistry).into(chemistry);

        ImageView philosophy = findViewById(R.id.philosophyIntro);
        Glide.with(this).load(R.drawable.knt).into(philosophy);
    }

    public void openPhysics(View view) {
        Intent intent = new Intent(EinsteinsOwl.this, PhysicsIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void openPhilosophy(View view) {
        Intent intent = new Intent(EinsteinsOwl.this, PhilosophyIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void openChemistry(View view){
        //Add Intent
    }

    public void openHistory(View view) {
        Intent intent = new Intent(EinsteinsOwl.this, HistoryIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
