package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonOneQ2 extends AppCompatActivity {

    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private ImageView trueImage;
    private ImageView falseImage;
    private TextView answer;
    private Button next;

    private static final String TAG = "LessonOneQ2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_q2);

        Log.d(TAG, "onCreate: Successfully create Q2");

        setUpUIViews();

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueMethod();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToThirdQuiz();
                Log.d(TAG, "onClick: Successfully move to Q3");
            }
        });
    }

    public void trueMethod() {
        answer.setVisibility(View.VISIBLE);
        trueImage.setVisibility(View.VISIBLE);
        button5.setVisibility(View.GONE);
        button6.setVisibility(View.GONE);
        button7.setVisibility(View.GONE);
        button8.setVisibility(View.GONE);
        next.setVisibility(View.VISIBLE);

    }

    public void falseMethod() {
        answer.setVisibility(View.VISIBLE);
        falseImage.setVisibility(View.VISIBLE);
        button5.setVisibility(View.GONE);
        button6.setVisibility(View.GONE);
        button7.setVisibility(View.GONE);
        button8.setVisibility(View.GONE);
        next.setVisibility(View.VISIBLE);

    }

    public void setUpUIViews(){
        button5 = (Button) findViewById(R.id.choiceA);
        button6 = (Button) findViewById(R.id.choiceB);
        button7 = (Button) findViewById(R.id.choiceC);
        button8 = (Button) findViewById(R.id.choiceD);
        trueImage = (ImageView) findViewById(R.id.trueIcon);
        falseImage = (ImageView) findViewById(R.id.falseIcon);
        answer = (TextView) findViewById(R.id.quizAnswer);
        next = (Button) findViewById(R.id.nextButton);
    }

    public void goToThirdQuiz(){
        Intent intent = new Intent (this, LessonOneQ3.class);
        startActivity(intent);
    }

}
