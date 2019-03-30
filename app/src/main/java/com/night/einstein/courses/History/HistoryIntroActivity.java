package com.night.einstein.courses.History;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.night.einstein.EinsteinsOwl;
import com.night.einstein.R;

public class HistoryIntroActivity extends AppCompatActivity {

    Button close, start;

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpageframe_easy);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Close to Owl TODO check for previous activity function
        close = findViewById(R.id.goBack);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryIntroActivity.this, EinsteinsOwl.class);
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
              //  Intent intent = new Intent(HistoryIntroActivity.this, .class);
             //   intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
              //  startActivity(intent);
            }
        });

        //Header Animation
        ImageView animation = findViewById(R.id.courseImg);
        //TODO change animation
        Glide.with(this).load(R.drawable.philosophersphilosophy).into(animation);


        //Animation of difficulty level
        LinearLayout linear = findViewById(R.id.difficulty);
        AnimationDrawable animationDrawable = (AnimationDrawable) linear.getBackground();
        animationDrawable.setEnterFadeDuration(700);
        animationDrawable.setExitFadeDuration(700);
        animationDrawable.start();


        //Add Text to Course Title
        final TextView courseTitle = findViewById(R.id.courseTitle);
        courseTitle.setText(R.string.introduction_to_history);
        //Add Text to About Content
        final TextView aboutContent = findViewById(R.id.aboutContent);
        aboutContent.setText(getString(R.string.historyIntroAbout));
        //Add Text to Contents Content
        final TextView contentsContent = findViewById(R.id.contentsContent);
        contentsContent.setText(getString(R.string.historyIntroSyllabusContent));
        //Add Text Duration to Duration TODO check text
        final TextView courseDuration = findViewById(R.id.courseDuration);
        courseDuration.setText(R.string.not_identified);


    }

}
