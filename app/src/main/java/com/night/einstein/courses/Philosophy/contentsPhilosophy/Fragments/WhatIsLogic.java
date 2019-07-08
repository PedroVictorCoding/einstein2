package com.night.einstein.courses.Philosophy.contentsPhilosophy.Fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.night.einstein.R;

import org.w3c.dom.Text;

public class WhatIsLogic extends Fragment {


    public static WhatIsLogic newInstance(){
        WhatIsLogic fragment = new WhatIsLogic();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.what_is_logic , container, false);
        TextView pagecontent = view.findViewById(R.id.pagecontent);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            pagecontent.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            pagecontent.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
        }

        return view;

    }
}
