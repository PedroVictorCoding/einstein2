package com.night.einstein.courses.Physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.night.einstein.EinsteinsOwl;
import com.night.einstein.R;


    public class PhysicsIntroActivity extends AppCompatActivity {

        Button close;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_physics_intro);
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

            ImageView animation = findViewById(R.id.courseImg);
            Glide.with(this).load(R.drawable.earthphysics).into(animation);

            }
        }


