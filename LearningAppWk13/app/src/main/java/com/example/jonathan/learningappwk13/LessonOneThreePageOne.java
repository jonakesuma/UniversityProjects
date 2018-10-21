package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LessonOneThreePageOne extends AppCompatActivity {

    private Button next;
    private static final String TAG = "LessonOneThreePageOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_three_page_one);
        Log.d(TAG, "onCreate: Successfully create page one of Feasibility Analysis");

        next = (Button) findViewById(R.id.nextButton);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPageTwo();
                Log.d(TAG, "onClick: Successfully move to page 2 of Feasibility analysis");
            }
        });
    }

    public void goToPageTwo(){
            Intent intent = new Intent(this, LessonOneThreePageTwo.class);
            startActivity(intent);
    }
}
