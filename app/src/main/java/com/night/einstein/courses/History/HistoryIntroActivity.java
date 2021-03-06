package com.night.einstein.courses.History;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.github.zagum.expandicon.ExpandIconView;
import com.night.einstein.EinsteinsOwl;
import com.night.einstein.InProgress;
import com.night.einstein.R;

public class HistoryIntroActivity extends AppCompatActivity implements GestureDetector.OnGestureListener{

    Button close, start;
    private ExpandIconView expandIconView2;
    private GestureDetector gestureDetector;

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpageframe_easy);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        expandIconView2 = findViewById(R.id.expand_icon2);

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

        setUpSlidingContainer();

        //Starts to course
        start = findViewById(R.id.startLearning);
        start.setText("Coming Soon!");
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Change To HistoryIntroContent when course almost complete
                Intent intent = new Intent(HistoryIntroActivity.this, InProgress.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        final ProgressBar progressBar = findViewById(R.id.progressBar);

        //Header Animation
        ImageView animation = findViewById(R.id.courseImg);
        Glide.with(this)
                .load("https://pedrovictorcoding.github.io/index.html/images/host_android_einstein/historyheader.gif")
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        progressBar.setVisibility(View.GONE);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        progressBar.setVisibility(View.GONE);
                        return false;
                    }
                })
                .into(animation);


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
    private void setUpSlidingContainer() {
        gestureDetector = new GestureDetector(this, this);
        gestureDetector.setIsLongpressEnabled(false);

        View swipeDetectionView = findViewById(R.id.swipe_detector2);
        swipeDetectionView.setClickable(true);
        swipeDetectionView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    expandIconView2.setFraction(.5f, true);
                }
                return gestureDetector.onTouchEvent(event);
            }
        });

    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        float fraction;
        if (Math.signum(distanceY) > 0) {
            fraction = 1f;
        } else {
            fraction = 0f;
        }
        expandIconView2.setFraction(fraction, true);
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }


    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
