package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonOneQ7 extends AppCompatActivity {

    private Button button25;
    private Button button26;
    private Button button27;
    private Button button28;
    private ImageView trueImage;
    private ImageView falseImage;
    private TextView answer;
    private Button finish;

    private static final String TAG = "LessonOneQ7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_q7);

        Log.d(TAG, "onClick: Successfully create Q7");

        setUpUIViews();

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueMethod();

            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishQuiz();
                Log.d(TAG, "onClick: Successfully move to Quiz Selection Page");
            }
        });

    }

    public void trueMethod() {
        answer.setVisibility(View.VISIBLE);
        trueImage.setVisibility(View.VISIBLE);
        button25.setVisibility(View.GONE);
        button26.setVisibility(View.GONE);
        button27.setVisibility(View.GONE);
        button28.setVisibility(View.GONE);
        finish.setVisibility(View.VISIBLE);
    }

    public void falseMethod() {
        answer.setVisibility(View.VISIBLE);
        falseImage.setVisibility(View.VISIBLE);
        button25.setVisibility(View.GONE);
        button26.setVisibility(View.GONE);
        button27.setVisibility(View.GONE);
        button28.setVisibility(View.GONE);
        finish.setVisibility(View.VISIBLE);
    }

    public void setUpUIViews(){
        button25 = (Button) findViewById(R.id.choiceA);
        button26 = (Button) findViewById(R.id.choiceB);
        button27 = (Button) findViewById(R.id.choiceC);
        button28 = (Button) findViewById(R.id.choiceD);
        trueImage = (ImageView) findViewById(R.id.trueIcon);
        falseImage = (ImageView) findViewById(R.id.falseIcon);
        answer = (TextView) findViewById(R.id.quizAnswer);
        finish = (Button) findViewById(R.id.finishButton);

    }

    public void finishQuiz(){
        Intent intent = new Intent(this, QuizLessonOne.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
