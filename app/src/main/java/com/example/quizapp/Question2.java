package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {

    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Intent recInt = getIntent();
        points = recInt.getIntExtra("Score", points);
    }

    public void firstRadioButtons (View view){

        if(view.getId() == R.id.questionOneC){
            points++;
        }

    }


    public void moveToQuestion2(View view) {


        TextView scoreTextView = (TextView) findViewById(R.id.score);
        scoreTextView.setText(" " + Integer.toString(points));

        Intent intent = new Intent(this, Question2.class);
        intent.putExtra("Score1", points);
        this.startActivity(intent);

    }
}