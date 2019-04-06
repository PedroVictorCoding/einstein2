package com.night.einstein;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.night.einstein.courses.Philosophy.PhilosophyIntroContent;
import com.night.einstein.courses.Philosophy.contentsPhilosophy.PhilosophyIntroLogic;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info); getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void openWebSite(View view) {
                String url = "https://pedrovictorcoding.github.io/index.html";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
    }

    public void openDiolor(View view) {
                String url = "https://github.com/Diolor/Swipecards";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
    }

    public void openBumptech(View view) {
            String url = "https://github.com/bumptech/glide";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
}

    public void openMaterialChipView(View view) {
                String url = "https://github.com/robertlevonyan/materialChipView";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
    }

    public void close(View view) {
        Intent intent = new Intent(InfoActivity.this, EinsteinsOwl.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}