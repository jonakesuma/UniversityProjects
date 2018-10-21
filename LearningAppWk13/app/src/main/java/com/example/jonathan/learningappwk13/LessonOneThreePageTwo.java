package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LessonOneThreePageTwo extends AppCompatActivity {

    private Button nextButton;
    private Button previousButton;
    private static final String TAG = "LessonOneThreePageTwo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one_three_page_two);
        Log.d(TAG, "onCreate: Successfully create page 2 of Feasibility Analysis");

        previousButton = (Button) findViewById(R.id.previous);
        nextButton = (Button) findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPageThree();
                Log.d(TAG, "goToPageThree: Successfully moved to page 3 of Feasibility Analysis");
            }
        });
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void goToPageThree(){
        Intent intent = new Intent(this, LessonOneThreePageThree.class);
        startActivity(intent);
    }
}
