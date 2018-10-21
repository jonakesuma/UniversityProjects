package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseLessons extends AppCompatActivity {

    private ImageView lessonOneIcon;
    private ImageView lessonTwoIcon;
    private ImageView informationIcon;
    private ImageView backIcon;
    private TextView lessonOneTitle;
    private TextView lessonTwoTitle;
    private TextView informationTitle;
    private TextView backTitle;

    private static final String TAG = "ChooseLessons";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_lessons);

        Log.d(TAG, "onCreate: Successfully created Choose Lesson page");

        setupUIViews();
        Log.d(TAG, "onCreate: Successfully setup UI views");

        lessonOneIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLessonOne();
                Log.d(TAG, "onClick: Successfully start lesson One");
            }
        });

        lessonTwoIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLessonTwo();
                Log.d(TAG, "onClick: Successfully start lesson Two");
            }
        });

        informationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInformation();
                Log.d(TAG, "onClick: Successfully start Information page");
            }
        });

        lessonOneTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLessonOne();
                Log.d(TAG, "onClick: Successfully start lesson One");
            }
        });

        lessonTwoTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLessonTwo();
                Log.d(TAG, "onClick: Successfully start lesson Two");
            }
        });

        informationTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInformation();
                Log.d(TAG, "onClick: Successfully start Information page");
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

    public void startLessonOne(){
        Intent intent = new Intent(this, LessonOne.class);
        startActivity(intent);
    }

    public void startLessonTwo(){
        Intent intent = new Intent(this, LessonTwo.class);
        startActivity(intent);
    }

    public void startInformation(){
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
    }

    public void setupUIViews(){
        lessonOneIcon = (ImageView) findViewById(R.id.lessonOneView);
        lessonTwoIcon = (ImageView) findViewById(R.id.lessonTwoView);
        informationIcon = (ImageView) findViewById(R.id.informationView);
        backIcon = (ImageView) findViewById(R.id.backView);
        lessonOneTitle = (TextView) findViewById(R.id.lessonOneText);
        lessonTwoTitle = (TextView) findViewById(R.id.lessonTwoText);
        informationTitle = (TextView) findViewById(R.id.informationText);
        backTitle = (TextView) findViewById(R.id.backText);
    }

}
