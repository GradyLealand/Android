package com.mobileapp.grady.studyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    private TextView mainDisplay, disAnsA, disAnsB, disAnsC, disAnsD;
    QuizTools tools = new QuizTools();
    String mySTring;
    String[] quizQuestion = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mainDisplay = (TextView)findViewById(R.id.tvDisplay);
        disAnsA = (TextView)findViewById(R.id.tvAnswerA);
        disAnsB = (TextView)findViewById(R.id.tvAnswerB);
        disAnsC = (TextView)findViewById(R.id.tvAnswerC);
        disAnsD = (TextView)findViewById(R.id.tvAnswerD);
        InputStream is = getResources().openRawResource(R.raw.quiz_questions);

        ArrayList<String> quizArray = tools.readFile(is);
        quizQuestion = tools.makeQuizArray();
        populateQuiz(quizQuestion);
        System.out.print(quizArray);
    }

    public void populateQuiz(String[] myArray){
        mainDisplay.setText(myArray[0]);
        disAnsA.setText(myArray[1]);
        disAnsB.setText(myArray[2]);
        disAnsC.setText(myArray[3]);
        disAnsD.setText(myArray[4]);

    }



}
