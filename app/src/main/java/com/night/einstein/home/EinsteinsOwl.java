package com.night.einstein.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.night.einstein.R;

public class EinsteinsOwl extends Fragment {
    public static EinsteinsOwl newInstance(){
        EinsteinsOwl fragment = new EinsteinsOwl();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_owl, container, false);


        ImageView physics = view.findViewById(R.id.physicsIntro);
        Glide.with(this).load(R.drawable.elonphysics).into(physics);

        ImageView chemistry = view.findViewById(R.id.chemistryIntro);
        Glide.with(this).load(R.drawable.tubetestchemistry).into(chemistry);

        ImageView philosophy = view.findViewById(R.id.philosophyIntro);
        Glide.with(this).load(R.drawable.knt).into(philosophy);




        return view;
    }
}
