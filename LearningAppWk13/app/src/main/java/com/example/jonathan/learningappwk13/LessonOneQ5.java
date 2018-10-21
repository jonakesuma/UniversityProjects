package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonOneQ5 extends AppCompatActivity {

    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private ImageView trueImage;
    private ImageView falseImage;
    private TextView answer;
    private Button finish;

    private static final String TAG = "LessonOneQ5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_q5);

        Log.d(TAG, "onClick: Successfully create Q5");

        setUpUIViews();

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueMethod();

            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                falseMethod();

            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSixthQuiz();
                Log.d(TAG, "onClick: Successfully move to Quiz Selection Page");
            }
        });

    }

    public void trueMethod() {
        answer.setVisibility(View.VISIBLE);
        trueImage.setVisibility(View.VISIBLE);
        button17.setVisibility(View.GONE);
        button18.setVisibility(View.GONE);
        button19.setVisibility(View.GONE);
        button20.setVisibility(View.GONE);
        finish.setVisibility(View.VISIBLE);


    }

    public void falseMethod() {
        answer.setVisibility(View.VISIBLE);
        falseImage.setVisibility(View.VISIBLE);
        button17.setVisibility(View.GONE);
        button18.setVisibility(View.GONE);
        button19.setVisibility(View.GONE);
        button20.setVisibility(View.GONE);
        finish.setVisibility(View.VISIBLE);


    }

    public void setUpUIViews(){
        button17 = (Button) findViewById(R.id.choiceA);
        button18 = (Button) findViewById(R.id.choiceB);
        button19 = (Button) findViewById(R.id.choiceC);
        button20 = (Button) findViewById(R.id.choiceD);
        trueImage = (ImageView) findViewById(R.id.trueIcon);
        falseImage = (ImageView) findViewById(R.id.falseIcon);
        answer = (TextView) findViewById(R.id.quizAnswer);
        finish = (Button) findViewById(R.id.finishButton);
    }

    public void goToSixthQuiz(){
        Intent intent = new Intent (this, QuizLessonOne.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}