package com.night.einstein.courses.Philosophy.contentsPhilosophy;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.night.einstein.R;
import com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments.ArgumentsLogic;
import com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments.EndLogic;
import com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments.TheoriesOfLogic;
import com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments.TruthLogic;
import com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments.WhatIsLogic;

public class PhilosophyIntroLogic extends AppCompatActivity {

    Button close;

    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy_intro_logic);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ViewPager viewPager = findViewById(R.id.viewPager);

        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setCurrentItem(0);

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter{

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i){
                case 0:
                    return WhatIsLogic.newInstance();

                case 1:
                    return ArgumentsLogic.newInstance();

                case 2:
                    return TruthLogic.newInstance();

                case 3:
                    return TheoriesOfLogic.newInstance();

                case 4:
                    return EndLogic.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 5; //TODO 5 fragments but might change
        }
    }
}
