package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonOneQ3 extends AppCompatActivity {

    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private ImageView trueImage;
    private ImageView falseImage;
    private TextView answer;
    private Button next;

    private static final String TAG = "LessonOneQ3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_q3);

        Log.d(TAG, "onClick: Successfully create Q3");

        setUpUIViews();

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueMethod();

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToForthQuiz();
                Log.d(TAG, "onClick: Successfully move to Q4");
            }
        });

    }

    public void trueMethod() {
        answer.setVisibility(View.VISIBLE);
        trueImage.setVisibility(View.VISIBLE);
        button9.setVisibility(View.GONE);
        button10.setVisibility(View.GONE);
        button11.setVisibility(View.GONE);
        button12.setVisibility(View.GONE);
        next.setVisibility(View.VISIBLE);
    }

    public void falseMethod() {
        answer.setVisibility(View.VISIBLE);
        falseImage.setVisibility(View.VISIBLE);
        button9.setVisibility(View.GONE);
        button10.setVisibility(View.GONE);
        button11.setVisibility(View.GONE);
        button12.setVisibility(View.GONE);
        next.setVisibility(View.VISIBLE);
    }

    public void setUpUIViews(){
        button9 = (Button) findViewById(R.id.choiceA);
        button10 = (Button) findViewById(R.id.choiceB);
        button11 = (Button) findViewById(R.id.choiceC);
        button12 = (Button) findViewById(R.id.choiceD);
        trueImage = (ImageView) findViewById(R.id.trueIcon);
        falseImage = (ImageView) findViewById(R.id.falseIcon);
        answer = (TextView) findViewById(R.id.quizAnswer);
        next = (Button) findViewById(R.id.nextButton);
    }

    public void goToForthQuiz(){
        Intent intent = new Intent (this, LessonOneQ4.class);
        startActivity(intent);
    }
}
