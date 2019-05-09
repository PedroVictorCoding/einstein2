package com.night.einstein.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.night.einstein.home.FragmentController;

import com.night.einstein.R;

public class WordFlashCards extends Fragment{

        public static WordFlashCards newInstance(){
            WordFlashCards fragment = new WordFlashCards();
            return fragment;
        }



        @SuppressLint("SetTextI18n")
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            final View view = inflater.inflate(R.layout.activity_words, container, false);


            return view;
        }
}
