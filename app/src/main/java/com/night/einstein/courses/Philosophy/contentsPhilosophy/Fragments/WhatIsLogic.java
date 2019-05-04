package com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.night.einstein.R;

public class WhatIsLogic extends Fragment {
    public static WhatIsLogic newInstance(){
        WhatIsLogic fragment = new WhatIsLogic();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.what_is_logic , container, false);
        return view;

    }
}
