package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonOneQ6 extends AppCompatActivity {

    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private ImageView trueImage;
    private ImageView falseImage;
    private TextView answer;
    private Button next;

    private static final String TAG = "LessonOneQ6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_q6);

        Log.d(TAG, "onClick: Successfully create Q6");

        setUpUIViews();

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueMethod();

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSeventhQuiz();
                Log.d(TAG, "onClick: Successfully move to Q7");
            }
        });

    }

    public void trueMethod() {
        answer.setVisibility(View.VISIBLE);
        trueImage.setVisibility(View.VISIBLE);
        button21.setVisibility(View.GONE);
        button22.setVisibility(View.GONE);
        button23.setVisibility(View.GONE);
        button24.setVisibility(View.GONE);
        next.setVisibility(View.VISIBLE);

    }

    public void falseMethod() {
        answer.setVisibility(View.VISIBLE);
        falseImage.setVisibility(View.VISIBLE);
        button21.setVisibility(View.GONE);
        button22.setVisibility(View.GONE);
        button23.setVisibility(View.GONE);
        button24.setVisibility(View.GONE);
        next.setVisibility(View.VISIBLE);

    }

    public void setUpUIViews(){
        button21 = (Button) findViewById(R.id.choiceA);
        button22 = (Button) findViewById(R.id.choiceB);
        button23 = (Button) findViewById(R.id.choiceC);
        button24 = (Button) findViewById(R.id.choiceD);
        trueImage = (ImageView) findViewById(R.id.trueIcon);
        falseImage = (ImageView) findViewById(R.id.falseIcon);
        answer = (TextView) findViewById(R.id.quizAnswer);
        next = (Button) findViewById(R.id.nextButton);

    }

    public void goToSeventhQuiz(){
        Intent intent = new Intent (this, LessonOneQ7.class);
        startActivity(intent);
    }
}


