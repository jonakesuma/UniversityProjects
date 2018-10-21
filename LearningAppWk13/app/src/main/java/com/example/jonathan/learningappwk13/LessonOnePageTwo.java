package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LessonOnePageTwo extends AppCompatActivity {

    private Button next;
    private Button previous;
    private static final String TAG = "LessonOnePageTwo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_page_two);
        Log.d(TAG, "onCreate: Successfully create page 2 of SDLC");

        next = (Button) findViewById(R.id.nextButton);
        previous = (Button) findViewById(R.id.previousButton);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextPage();
                Log.d(TAG, "onClick: Successfully move to page 3 of SDLC");

            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void goToNextPage(){
        Intent intent = new Intent(this, LessonOnePageThree.class);
        startActivity(intent);
    }
}
