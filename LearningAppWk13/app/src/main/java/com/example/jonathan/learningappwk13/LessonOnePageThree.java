package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LessonOnePageThree extends AppCompatActivity {

    private Button quiz;
    private Button previous;
    private static final String TAG = "LessonOnePageThree";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_page_three);
        Log.d(TAG, "onCreate: Successfully create page 3 for SDLC");

        quiz = (Button) findViewById(R.id.quizButton);
        previous = (Button) findViewById(R.id.previousButton);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToQuiz();
                Log.d(TAG, "onClick: Successfully move to SDLC Quiz");
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void goToQuiz(){
        Intent intent = new Intent(this, LessonOneQ1.class);
        startActivity(intent);
    }


}
