package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LessonOneTwoPageOne extends AppCompatActivity {

    private Button quiz;
    private static final String TAG = "LessonOneTwoPageOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_two_page_one);
        Log.d(TAG, "onCreate: Successfully create page one of Project Management n Identification");

        quiz = (Button) findViewById(R.id.quizBut);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToQuiz();
                Log.d(TAG, "onClick: Successfully move to Quiz page of Project Management n Identification");
            }
        });
    }

    public void goToQuiz(){
        Intent intent = new Intent (this, LessonOneQ5.class);
        startActivity(intent);
    }
}
