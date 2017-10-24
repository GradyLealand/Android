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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        TextView mainDisplay = (TextView)findViewById(R.id.tvDisplay);
        TextView disAnsA = (TextView)findViewById(R.id.tvAnswerA);
        TextView disAnsB = (TextView)findViewById(R.id.tvAnswerB);
        TextView disAnsC = (TextView)findViewById(R.id.tvAnswerC);
        TextView disAnsD = (TextView)findViewById(R.id.tvAnswerD);
        InputStream is = getResources().openRawResource(R.raw.quiz_questions);

        ArrayList<String> quizArray = tools.readFile(is);
        System.out.print(quizArray);

    }
}
