package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChooseLessonOne extends AppCompatActivity {

    private ListView list;
    private static final String TAG = "ChooseLessonOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_lesson_one);
        Log.d(TAG, "onCreate: Choose lesson from lesson one successfully created.");

        list = (ListView) findViewById(R.id.lessonList);

        ArrayList<String> listLesson = new ArrayList<>();
        listLesson.add("SDLC");
        listLesson.add("Project Management and Identification");
        listLesson.add("Feasibility Analysis");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listLesson);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.d(TAG, "onItemClick: ListView for Lesson One successfully created.");
                if (position == 0) {
                    goToPartOne();
                    Log.d(TAG, "onItemClick: Successfully move to part SDLC");
                }
                if (position == 1) {
                    goToPartTwo();
                    Log.d(TAG, "onItemClick: Successfully move to PM&I");
                }
                if (position == 2) {
                    goToPartThree();
                    Log.d(TAG, "onItemClick: Successfully move to Feasibility Analysis");
                }
            }
        });
    }

    public void goToPartOne(){
        Intent intent = new Intent (this, LessonOnePageOne.class);
        startActivity(intent);
    }

    public void goToPartTwo(){
        Intent intent = new Intent (this, LessonOneTwoPageOne.class);
        startActivity(intent);
    }

    public void goToPartThree(){
        Intent intent = new Intent(this,LessonOneThreePageOne.class);
        startActivity(intent);
    }
}
