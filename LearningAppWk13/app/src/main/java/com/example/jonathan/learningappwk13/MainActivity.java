package com.example.jonathan.learningappwk13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button startButton;
    private Button getButton;
    private TextView textQuote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textQuote = (TextView) findViewById(R.id.quoteName);
        getButton = (Button) findViewById(R.id.getQoTD);
        startButton = (Button) findViewById(R.id.startBut);

        Log.d(TAG, "onCreate: Successfully create Main Activity");

        getButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                String url ="https://quotes.rest/qod";
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                Log.d(TAG, "onResponse: Successfully received response from Quote REST API");
                                String quotez = response.substring(0,500);
                                String exctractedQuote = quotez.substring(quotez.indexOf("quote")+50, quotez.indexOf("length")-10);
                                textQuote.setText(exctractedQuote);

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d(TAG, "onErrorResponse:  Failed to receive response from Quote Rest API");
                        textQuote.setText("Quote not found");
                    }
                });
                queue.add(stringRequest);
            }
        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToChooseLessons();
                Log.d(TAG, "onClick: Successfully move to Choose Lessons page");
            }
        })
;}

    public void moveToChooseLessons(){
        Intent intent;
        intent = new Intent(this, ChooseLessons.class);
        startActivity(intent);
    }}