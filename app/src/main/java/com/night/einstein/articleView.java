package com.night.einstein;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;

public class articleView extends AppCompatActivity {
    private ArrayList<String> al;
    private ArrayAdapter arrayAdapter;
    private int i;

    TextView wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_view);

            al = new ArrayList<>();
            al.add("Swipe right to learn more word \n Swipe left to close");
            al.add("ADD FUN WORDS");
            al.add("ADD FUN WORDS");
            al.add("ADD FUN WORDS");
            al.add("ADD FUN WORDS");
            al.add("ADD FUN WORDS");
            al.add("ADD FUN WORDS");
            al.add("ADD FUN WORDS");



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

                @Override
                public void onLeftCardExit(Object dataObject) {
                    //Do something on the left!
                    //You also have access to the original object.
                    //If you want to use it just cast it (String) dataObject
                    Intent intent = new Intent(articleView.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                @SuppressLint("SetTextI18n")
                @Override
                public void onRightCardExit(Object dataObject) {
                    TextView wordCount = findViewById(R.id.countWords);
                    wordCount.setText("Streaks:".concat(String.valueOf(i)));
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

