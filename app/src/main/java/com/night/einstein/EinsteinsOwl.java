package com.night.einstein;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.night.einstein.courses.Geometry.GeometryIntroActivity;
import com.night.einstein.courses.History.HistoryIntroActivity;
import com.night.einstein.courses.Philosophy.PhilosophyIntroActivity;
import com.night.einstein.courses.Physics.PhysicsIntroActivity;

public class EinsteinsOwl extends Activity {

    Button philosophyIntro, physicsIntro;
    ImageButton close, button, buttonWords, buttonArticle;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owl2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

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

        ImageView logosvg = findViewById(R.id.biologyIntro );
        Glide.with(this).load("").into(logosvg);

     /*   ImageView game_header = findViewById(R.id.science_horizontal_header);
        Glide.with(this).load("https://pedrovictorcoding.github.io/index.html/images/host_android_einstein/earthphysics_1.gif").into(game_header);

        ImageView philosophy_header = findViewById(R.id.philosophy_horizontal_header);
        Glide.with(this).load("https://pedrovictorcoding.github.io/index.html/images/host_android_einstein/philosophersphilosophy.gif").into(philosophy_header);

        ImageView geometry_header = findViewById(R.id.mathematics_horizontal_header);
        Glide.with(this).load("https://pedrovictorcoding.github.io/index.html/images/host_android_einstein/geometry.gif").into(geometry_header);

        ImageView humanities_header = findViewById(R.id.humanities_horizontal_header);
        Glide.with(this).load("https://pedrovictorcoding.github.io/index.html/images/host_android_einstein/historyheader.gif").into(humanities_header); */


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

    public void info(View view) {
        Intent intent = new Intent(EinsteinsOwl.this, InfoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void openGeometry(View view) {
        Intent intent = new Intent(EinsteinsOwl.this, GeometryIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void openPhysics2(View view) {
    }

    public void openWords(View view) {
        Intent intent = new Intent(EinsteinsOwl.this, articleView.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void openArticles(View view) {

    }

    public void openYoutubePlayer(View view) {
        Intent intent = new Intent(EinsteinsOwl.this, YoutubeEinsteinPlayer.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
