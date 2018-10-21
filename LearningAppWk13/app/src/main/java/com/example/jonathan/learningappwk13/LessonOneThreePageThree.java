package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LessonOneThreePageThree extends AppCompatActivity {

    private static final String TAG = "LessonOneThreePageThree";
    private Button quizButton;
    private Button previousButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_three_page_three);

        Log.d(TAG, "onCreate: Success create page 3 of Feasibility analysis");

        quizButton = (Button) findViewById(R.id.button6);
        previousButton = (Button) findViewById(R.id.previous);

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToQuiz();
                Log.d(TAG, "onClick: Successfully move to Quiz of Feasibility Analysis");
            }
        });
    }

    public void goToQuiz(){
        Intent intent = new Intent (this, LessonOneQ6.class);
        startActivity(intent);
    }
}
