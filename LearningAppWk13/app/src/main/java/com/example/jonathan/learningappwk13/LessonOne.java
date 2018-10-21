package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonOne extends AppCompatActivity {

    private ImageView lessonIcon;
    private ImageView videoIcon;
    private ImageView quizIcon;
    private ImageView backIcon;
    private TextView lessonTitle;
    private TextView videoTitle;
    private TextView quizTitle;
    private TextView backTitle;
    private static final String TAG = "LessonOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);
        setupUIViews();
        Log.d(TAG, "onCreate: Successfully setup UI views");

        lessonIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLesson();
                Log.d(TAG, "onClick: Successfully move to Lesson One selection page");
            }
        });

        lessonTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLesson();
                Log.d(TAG, "onClick: Successfully move to lesson One selection page");
            }
        });

        videoIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToVideo();
                Log.d(TAG, "onClick: Successfully start video page for Lesson One");
            }
        });

        videoTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToVideo();
                Log.d(TAG, "onClick: Successfully start video page for Lesson One");
            }
        });

        quizIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToQuiz();;
                Log.d(TAG, "onClick: Successfully start quiz for Lesson One");
            }
        });

        quizTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToQuiz();
                Log.d(TAG, "onClick: Successfully start quiz for Lesson One");
            }
        });

        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        backTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    public void setupUIViews(){
        lessonIcon = (ImageView) findViewById(R.id.lessonView);
        videoIcon = (ImageView) findViewById(R.id.videoView);
        quizIcon = (ImageView) findViewById(R.id.quizView);
        backIcon = (ImageView) findViewById(R.id.backView);
        lessonTitle = (TextView) findViewById(R.id.lessonText);
        videoTitle = (TextView) findViewById(R.id.videoText);
        quizTitle = (TextView) findViewById(R.id.quizText);
        backTitle = (TextView) findViewById(R.id.backText);
    }
    public void goToQuiz(){
        Intent intent = new Intent(this, QuizLessonOne.class);
        startActivity(intent);
    }

    public void goToLesson(){
        Intent intent = new Intent (this, ChooseLessonOne.class);
        startActivity(intent);
    }

    public void goToVideo(){
        Intent intent = new Intent (this, VideoOne.class);
        startActivity(intent);
    }
}
