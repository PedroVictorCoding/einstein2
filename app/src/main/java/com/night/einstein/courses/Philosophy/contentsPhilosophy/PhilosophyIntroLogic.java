package com.night.einstein.courses.Philosophy.contentsPhilosophy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.night.einstein.R;
import com.night.einstein.courses.Philosophy.PhilosophyIntroContent;

public class PhilosophyIntroLogic extends AppCompatActivity {

    Button close;
    ViewPager slideViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy_intro_logic);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }

    public void close(View view) {
        Intent intent = new Intent(PhilosophyIntroLogic.this, PhilosophyIntroContent.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
