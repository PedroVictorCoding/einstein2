package com.night.einstein;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.night.einstein.courses.Philosophy.PhilosophyIntroActivity;
import com.robertlevonyan.views.chip.Chip;
import com.robertlevonyan.views.chip.OnChipClickListener;

import java.util.Objects;

public class ArticleActivity extends AppCompatActivity {

    Button close;
    Dialog myDialog;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        myDialog = new Dialog(this);


        //TextView text1 = findViewById(R.id.text1);
        //text1.setText(getString(R.string.what_is_philosophy_article) + "  ");

        close = findViewById(R.id.goBack);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArticleActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                overridePendingTransition(0, 0);
                startActivity(intent);
            }
        });


       Chip chipPhilo1 = findViewById(R.id.chipPhilo1);
        chipPhilo1.setOnChipClickListener(new OnChipClickListener() {
            @Override
            public void onChipClick(View v) {
                Intent intent = new Intent(ArticleActivity.this, PhilosophyIntroActivity.class);
                startActivity(intent);
            }
        });




    }

    public void ShowPopupWhatIsPhilosophy(View view) {
        TextView textClose;
        myDialog.setContentView(R.layout.article_what_is_philosophy);
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
}

