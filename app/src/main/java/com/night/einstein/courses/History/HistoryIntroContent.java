package com.night.einstein.courses.History;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.night.einstein.R;
import com.night.einstein.courses.Philosophy.PhilosophyIntroActivity;
import com.night.einstein.courses.Philosophy.PhilosophyIntroContent;
import com.night.einstein.courses.Philosophy.contentsPhilosophy.PhilosophyIntroLogic;

public class HistoryIntroContent extends AppCompatActivity {

    Button logicLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_intro_content);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        logicLayout = findViewById(R.id.logicButton);
        logicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         //       Intent intent = new Intent(HistoryIntroContent.this, .class);
           //     intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
          //      startActivity(intent);
            }
        });

        Button close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryIntroContent.this, HistoryIntroActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });




    }
}
