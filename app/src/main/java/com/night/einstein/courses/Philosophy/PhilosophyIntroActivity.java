package com.night.einstein.courses.Philosophy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.night.einstein.EinsteinsOwl;
import com.night.einstein.R;

public class PhilosophyIntroActivity extends AppCompatActivity {

    Button close, start;

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpageframe_intermediate);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Close to Owl TODO check for previous activity function
        close = findViewById(R.id.goBack);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhilosophyIntroActivity.this, EinsteinsOwl.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                overridePendingTransition(0, 0);
                startActivity(intent);
            }
        });

        //Starts to course
        start = findViewById(R.id.startLearning);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhilosophyIntroActivity.this, PhilosophyIntroContent.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        //Header Animation
        ImageView animation = findViewById(R.id.courseImg);
        Glide.with(this).load(R.drawable.philosophersphilosophy).into(animation);


        //Animation of difficulty level
        LinearLayout linear = findViewById(R.id.difficulty);
        AnimationDrawable animationDrawable = (AnimationDrawable) linear.getBackground();
        animationDrawable.setEnterFadeDuration(700);
        animationDrawable.setExitFadeDuration(700);
        animationDrawable.start();


        //Add Text to Course Title
        final TextView courseTitle = findViewById(R.id.courseTitle);
        courseTitle.setText(R.string.introduction_to_philosophy);
        //Add Text to About Content
        final TextView aboutContent = findViewById(R.id.aboutContent);
        aboutContent.setText(getString(R.string.philosophyIntroAbout));
        //Add Text to Contents Content
        final TextView contentsContent = findViewById(R.id.contentsContent);
        contentsContent.setText(R.string.philosophyIntroSyllabusContent);
        //Add Text Duration to Duration TODO check text
        final TextView courseDuration = findViewById(R.id.courseDuration);
        courseDuration.setText(R.string.not_identified);


    }

}
