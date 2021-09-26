package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question7 extends AppCompatActivity {

    int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);

        Intent recInt = getIntent();
        points = recInt.getIntExtra("Score6", points);
    }

    public void firstRadioButtons (View view){

        if(view.getId() == R.id.questionOneA){
            points++;

        }

    }


    public void moveToFinal(View view) {



        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText("Score is " + Integer.toString(points));
        Intent intent = new Intent(this, Final.class);
        intent.putExtra("Score7", points);
        this.startActivity(intent);

    }
}