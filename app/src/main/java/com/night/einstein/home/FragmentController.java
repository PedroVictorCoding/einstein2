package com.night.einstein.home;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.night.einstein.InfoActivity;
import com.night.einstein.R;
import com.night.einstein.courses.Geometry.GeometryIntroActivity;
import com.night.einstein.courses.History.HistoryIntroActivity;
import com.night.einstein.courses.Philosophy.PhilosophyIntroActivity;
import com.night.einstein.courses.Physics.PhysicsIntroActivity;
import com.robertlevonyan.views.chip.Chip;
import com.robertlevonyan.views.chip.OnChipClickListener;

import org.w3c.dom.Text;

public class FragmentController extends AppCompatActivity {


    Dialog myDialog;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragmentcontroller);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        FragmentPagerAdapter adapterViewPager;
        ViewPager viewPager = findViewById(R.id.viewPager);

        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setCurrentItem(0);

        myDialog = new Dialog(this);

    }



    public void openPhysics(View view) {
        Intent intent = new Intent(FragmentController.this, PhysicsIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void openPhilosophy(View view) {
        Intent intent = new Intent(FragmentController.this, PhilosophyIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void openChemistry(View view) {
        //Add Intent
    }

    public void openHistory(View view) {
        Intent intent = new Intent(FragmentController.this, HistoryIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void info(View view) {
        Intent intent = new Intent(FragmentController.this, InfoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void openGeometry(View view) {
        Intent intent = new Intent(FragmentController.this, GeometryIntroActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    public void ShowPopupWhatIsPhilosophy(View view) {
        TextView textClose;
        myDialog.setContentView(R.layout.article_view);
        textClose = myDialog.findViewById(R.id.txtclose);
        textClose.setText("x");
        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }


    public static class MyPagerAdapter extends FragmentPagerAdapter {

        MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @SuppressLint("SetTextI18n")
        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return EinsteinsOwl.newInstance();

                case 1:
                    return ArticleFragment.newInstance();

                case 2:
                    return WordFlashCards.newInstance();

            }
            return null;
        }

        @Override
        public int getCount() {
            return 3; //TODO 5 fragments but might change
        }
    }

}