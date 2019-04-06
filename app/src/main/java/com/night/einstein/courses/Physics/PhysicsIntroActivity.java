package com.night.einstein.courses.Physics;

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
import com.night.einstein.InProgress;
import com.night.einstein.R;


public class PhysicsIntroActivity extends AppCompatActivity {

        Button close, start;

        @SuppressLint("SetTextI18n")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.startpageframe_difficult);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            close = findViewById(R.id.goBack);
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PhysicsIntroActivity.this, EinsteinsOwl.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    overridePendingTransition(0, 0);
                    startActivity(intent);
                }
            });

            start = findViewById(R.id.startLearning);
            start.setText("Coming Soon!");
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //TODO Change to PhysicsIntroContent when course completed or close to complete
                    Intent intent = new Intent(PhysicsIntroActivity.this, InProgress.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            });

            ImageView animation = findViewById(R.id.courseImg);
            Glide.with(this).load(R.drawable.earthphysics).into(animation);


            LinearLayout linear = findViewById(R.id.difficulty);
            AnimationDrawable animationDrawable = (AnimationDrawable) linear.getBackground();
            animationDrawable.setEnterFadeDuration(700);
            animationDrawable.setExitFadeDuration(700);
            animationDrawable.start();


            //Add Text to Course Title
            final TextView courseTitle = findViewById(R.id.courseTitle);
            courseTitle.setText(R.string.introduction_to_physics);
            //Add Text to About Content
            final TextView aboutContent = findViewById(R.id.aboutContent);
            aboutContent.setText(getString(R.string.physics_intro_about));
            //Add Text to Contents Content
            final TextView contentsContent = findViewById(R.id.contentsContent);
            contentsContent.setText(R.string.physicsIntroSyllabusContent);
            //Add Text Duration to Duration TODO check text
            final TextView courseDuration = findViewById(R.id.courseDuration);
            courseDuration.setText(R.string.not_identified);

        }

            }



