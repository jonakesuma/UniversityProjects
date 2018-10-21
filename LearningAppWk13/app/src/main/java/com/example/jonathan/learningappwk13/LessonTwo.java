package com.example.jonathan.learningappwk13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LessonTwo extends AppCompatActivity {
    private static final String TAG = "LessonTwo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);
        Log.d(TAG, "onCreate: Succesfully create lesson 2 page");
    }
}
