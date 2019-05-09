package com.night.einstein.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.night.einstein.ArticleActivity;
import com.night.einstein.R;
import com.night.einstein.courses.Philosophy.PhilosophyIntroActivity;
import com.robertlevonyan.views.chip.Chip;
import com.robertlevonyan.views.chip.OnChipClickListener;

public class ArticleFragment extends Fragment {
    public static ArticleFragment newInstance(){
        ArticleFragment fragment = new ArticleFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_article, container, false);






        return view;

    }
}
