package com.night.einstein;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.night.einstein.courses.Philosophy.PhilosophyIntroActivity;
import com.night.einstein.courses.Physics.PhysicsIntroActivity;

public class EinsteinsOwl extends AppCompatActivity {

    Button philosophyIntro, physicsIntro;
    ImageButton close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owl);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        philosophyIntro = findViewById(R.id.philosophyIntro);
        philosophyIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EinsteinsOwl.this, PhilosophyIntroActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        physicsIntro = findViewById(R.id.physicsIntro);
        physicsIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EinsteinsOwl.this, PhysicsIntroActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Moves from the current activity to the MainActivity
                Intent terminate = new Intent(EinsteinsOwl.this, MainActivity.class);
                terminate.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(terminate);
                finish();
            }
        });
    }
}
