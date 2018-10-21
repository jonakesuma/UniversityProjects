package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LessonOnePageOne extends AppCompatActivity {

    private Button next;
    private static final String TAG = "LessonOnePageOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_page_one);
        next = (Button) findViewById(R.id.nextButton);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextPage();
                Log.d(TAG, "onClick: Successfully move to second page of SDLC");
            }
        });

    }

    public void goToNextPage(){
        Intent intent = new Intent(this, LessonOnePageTwo.class);
        startActivity(intent);
    }
}
