package com.night.einstein;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class InProgress extends AppCompatActivity {

    TextView physicsVoting = findViewById(R.id.PhysicsVotes);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_progress);


    }


    Long physicsVotes = 0L;
    DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    ValueEventListener listener = new ValueEventListener() {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            physicsVotes = dataSnapshot.getValue(Long.class);
            physicsVoting.setText(Math.toIntExact(physicsVotes));
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {}
    };

    @Override
    public void onStart() {
        super.onStart();
        reference.child("physics").addValueEventListener(listener);
    }

    @Override
    public void onStop() {
        super.onStop();
        reference.child("physics").removeEventListener(listener);
    }

    @SuppressLint("SetTextI18n")
    public void physicsVote(View view) {
        reference.child("physics").setValue(++physicsVotes);
    }


}