package com.mobileapp.grady.studyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    private TextView mainDisplay, disAnsA, disAnsB, disAnsC, disAnsD;
    private Button btnA, btnB, btnC, btnD;
    QuizTools tools = new QuizTools();
    String mySTring;
    String[] quizQuestion = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mainDisplay = (TextView)findViewById(R.id.tvDisplay);
        //atatch elements
        disAnsA = (TextView)findViewById(R.id.tvAnswerA);
        disAnsB = (TextView)findViewById(R.id.tvAnswerB);
        disAnsC = (TextView)findViewById(R.id.tvAnswerC);
        disAnsD = (TextView)findViewById(R.id.tvAnswerD);
        btnA = (Button)findViewById(R.id.btnAnswerA);
        btnB = (Button)findViewById(R.id.btnAnswerB);
        btnC = (Button)findViewById(R.id.btnAnswerC);
        btnD = (Button)findViewById(R.id.btnAnswerD);
        InputStream is = getResources().openRawResource(R.raw.quiz_questions);

        //read the file and populate the page with the first question
        ArrayList<String> quizArray = tools.readFile(is);
        quizQuestion = tools.makeQuizArray();
        populateQuiz(quizQuestion);
        System.out.print(quizArray);

        //create on click listeners
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get a new question
                quizQuestion = tools.makeQuizArray();
                populateQuiz(quizQuestion);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get a new question
                quizQuestion = tools.makeQuizArray();
                populateQuiz(quizQuestion);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get a new question
                quizQuestion = tools.makeQuizArray();
                populateQuiz(quizQuestion);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get a new question
                quizQuestion = tools.makeQuizArray();
                populateQuiz(quizQuestion);
            }
        });
    }

    public void populateQuiz(String[] myArray){
        mainDisplay.setText(myArray[0]);
        disAnsA.setText(myArray[1]);
        disAnsB.setText(myArray[2]);
        disAnsC.setText(myArray[3]);
        disAnsD.setText(myArray[4]);

    }



}
