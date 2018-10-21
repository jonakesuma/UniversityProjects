package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class QuizLessonOne extends AppCompatActivity {

    private ListView list;
    private static final String TAG = "QuizLessonOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_lesson_one);

        Log.d(TAG, "onCreate: Successfuly create Quiz selection page");

        list = (ListView) findViewById(R.id.listQuiz);
        ArrayList<String> listLesson = new ArrayList<>();
        listLesson.add("SDLC");
        listLesson.add("Project Management and Identification");
        listLesson.add("Feasibility Analysis");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listLesson);
        list.setAdapter(adapter);
        Log.d(TAG, "onCreate: Successfully set adapter for listView");

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.d(TAG, "onItemClick: ListView for Lesson One successfully created.");
                if (position == 0) {
                    goToQuizSDLC();
                    Log.d(TAG, "onItemClick: Successfully move to  SDLC quiz");
                }
                if (position == 1) {
                    goToQuizPM();
                    Log.d(TAG, "onItemClick: Successfully move to PM&I quiz");
                }
                if (position == 2) {
                    goToQuizFeasibility();
                    Log.d(TAG, "onItemClick: Successfully move to Feasibility Analysis quiz");
                }
            }
        });




    }

    public void goToQuizSDLC(){
        Intent intent = new Intent (this, LessonOneQ1.class);
        startActivity(intent);
    }

    public void goToQuizPM(){
        Intent intent = new Intent(this, LessonOneQ5.class);
        startActivity(intent);
    }

    public void goToQuizFeasibility(){
        Intent intent = new Intent (this, LessonOneQ6.class);
        startActivity(intent);
    }


}
