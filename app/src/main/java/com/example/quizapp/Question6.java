package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question6 extends AppCompatActivity {

    int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        Intent recInt = getIntent();
        points = recInt.getIntExtra("Score5", points);
        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText("Score is " + Integer.toString(points));
    }

    public void firstRadioButtons (View view){

        if(view.getId() == R.id.questionOneD){
            points++;

        }

    }


    public void moveToQuestion7(View view) {



        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText(" " + Integer.toString(points));
        Intent intent = new Intent(this, Question7.class);
        intent.putExtra("Score6", points);
        this.startActivity(intent);

    }
}