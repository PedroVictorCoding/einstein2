package com.night.einstein;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.Collections;

public class articleView extends AppCompatActivity {
    private ArrayList<String> al;
    private ArrayAdapter arrayAdapter;
    private int i;

    TextView wordCount;
    ImageButton close, button, btnOwl, buttonWords, buttonArticle;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        TextView wordCount = findViewById(R.id.countWords);
        wordCount.setText("Streaks: ".concat(String.valueOf(i)));
        i++;

     /*   close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Moves from the current activity to the MainActivity
                Intent terminate = new Intent(articleView.this, MainActivity.class);
                terminate.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(terminate);
                finish();
            }
        }); */

        al = new ArrayList<>();
            al.add("NONPLUSSED\n" + "\n" + "filled with bewilderment");
            al.add("INCHOATE\n" + "\n" + "only partly in existence; imperfectly formed");
            al.add("GIBBOUS\n" + "\n" + "marked by convexity or swelling");
            al.add("FECKLESS\n" + "\n" + "weak, ineffective");
            al.add("SETOUT\n" + "\n" + "array, display");
            al.add("FASCISM\n" + "\n" + "a political philosophy that exalts nation and stands for a centralized autocratic government headed by a dictatorial leader");
            al.add("COVENANT\n" + "\n" + "a usually formal, solemn, and binding agreement");
            al.add("INTELLECTION\n" + "\n" + " exercise of the intellect, reasoning");
            al.add("CADUCITY\n" + "\n" + "the quality of being transitory or perishable");
            al.add("EMPATHY\n" + "\n" + "the action of comprehending, being sensitive to");
            al.add("ETHIC\n" + "\n" + "understanding of what is wrong or right");
            al.add("METAPHOR\n" + "\n" + "a figure of speech in which a phrase literally denoting one kind of idea is used in place of another to suggest an analogy between them ");
            al.add("GRISTLY\n" + "\n" + "difficult to chew");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");
            al.add("\n" + "\n" + "");



        Collections.shuffle(al);



            arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.helloText, al );

            SwipeFlingAdapterView flingContainer = findViewById(R.id.articles);

            flingContainer.setAdapter(arrayAdapter);
            flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
                @Override
                public void removeFirstObjectInAdapter() {
                    // this is the simplest way to delete an object from the Adapter (/AdapterView)
                    Log.d("LIST", "removed object!");
                    al.remove(0);
                    arrayAdapter.notifyDataSetChanged();
                }

                @SuppressLint("SetTextI18n")
                @Override
                public void onLeftCardExit(Object dataObject) {

                    TextView wordCount = findViewById(R.id.countWords);
                    wordCount.setText("Streaks: ".concat(String.valueOf(i)));
                    i++;
                }

                @SuppressLint("SetTextI18n")
                @Override
                public void onRightCardExit(Object dataObject) {
                    TextView wordCount = findViewById(R.id.countWords);
                    wordCount.setText("Streaks: ".concat(String.valueOf(i)));
                    i++;
                }

                @Override
                public void onAdapterAboutToEmpty(int itemsInAdapter) {
                    // Ask for more data here
                   /* al.add("XML ".concat(String.valueOf(i)));
                    arrayAdapter.notifyDataSetChanged();
                    Log.d("LIST", "notified");
                    i++; */
                    Intent intent = new Intent(articleView.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    Toast.makeText(articleView.this, "All done!" +
                            "", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }

                @Override
                public void onScroll(float scrollProgressPercent) {

                }
            });


            // Optionally add an OnItemClickListener
            flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
                @Override
                public void onItemClicked(int itemPosition, Object dataObject) {
                    Toast.makeText(articleView.this, "Clicked!", Toast.LENGTH_SHORT).show();
                }
            });

        }

        static void makeToast(Context ctx, String s){
            Toast.makeText(ctx, s, Toast.LENGTH_SHORT).show();
        }
    }

