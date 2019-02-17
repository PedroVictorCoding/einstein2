package com.night.einstein.courses.Philosophy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.night.einstein.R;
import com.night.einstein.courses.Philosophy.contents.PhilosophyIntroLogic;

public class PhilosophyIntroContent extends AppCompatActivity {

    Button logicLayout, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy_intro_content);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Moves from the current activity to the MainActivity
                Intent terminate = new Intent(PhilosophyIntroContent.this, PhilosophyIntroActivity.class);
                terminate.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(terminate);
                finish();
            }
        });

        logicLayout = findViewById(R.id.logicButton);
        logicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhilosophyIntroContent.this, PhilosophyIntroLogic.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
