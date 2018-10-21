package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonOneQ4 extends AppCompatActivity {

    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private ImageView trueImage;
    private ImageView falseImage;
    private TextView answer;
    private Button finishBut;

    private static final String TAG = "LessonOneQ4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_q4);

        Log.d(TAG, "onClick: Successfully create Q4");

        setUpUIViews();

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueMethod();

            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        finishBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFifthQuiz();
                Log.d(TAG, "onClick: Successfully move to Quiz Selection Page");
            }
        });

    }

    public void trueMethod() {
        answer.setVisibility(View.VISIBLE);
        trueImage.setVisibility(View.VISIBLE);
        button13.setVisibility(View.GONE);
        button14.setVisibility(View.GONE);
        button15.setVisibility(View.GONE);
        button16.setVisibility(View.GONE);
        finishBut.setVisibility(View.VISIBLE);

    }

    public void falseMethod() {
        answer.setVisibility(View.VISIBLE);
        falseImage.setVisibility(View.VISIBLE);
        button13.setVisibility(View.GONE);
        button14.setVisibility(View.GONE);
        button15.setVisibility(View.GONE);
        button16.setVisibility(View.GONE);
        finishBut.setVisibility(View.VISIBLE);

    }

    public void setUpUIViews(){
        button13 = (Button) findViewById(R.id.choiceA);
        button14 = (Button) findViewById(R.id.choiceB);
        button15 = (Button) findViewById(R.id.choiceC);
        button16 = (Button) findViewById(R.id.choiceD);
        trueImage = (ImageView) findViewById(R.id.trueIcon);
        falseImage = (ImageView) findViewById(R.id.falseIcon);
        answer = (TextView) findViewById(R.id.quizAnswer);
        finishBut = (Button) findViewById(R.id.finishButton);

    }

    public void goToFifthQuiz(){
        Intent intent = new Intent (this, QuizLessonOne.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}