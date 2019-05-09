package com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.night.einstein.R;

public class TheoriesOfLogic extends Fragment {
    public static TheoriesOfLogic newInstance(){
        TheoriesOfLogic fragment = new TheoriesOfLogic();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.theories_of_logic , container, false);
        return view;

    }
}

