package com.mobileapp.grady.studyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    //answers tht each button will return
    private final int ANSWER_A = 1;
    private final int ANSWER_B = 2;
    private final int ANSWER_C = 3;
    private final int ANSWER_D = 4;
    //declare elements
    private TextView mainDisplay, disAnsA, disAnsB, disAnsC, disAnsD,disFinalScore;
    private Button btnA, btnB, btnC, btnD;
    //instance QuizTools
    QuizTools tools = new QuizTools();
    //create "other" class variables
    String[] quizQuestion = new String[5];
    int round = 1;// start at round and update each question so the game knows when to stop

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mainDisplay = (TextView)findViewById(R.id.tvDisplay);
        //attach elements
        disAnsA = (TextView)findViewById(R.id.tvAnswerA);
        disAnsB = (TextView)findViewById(R.id.tvAnswerB);
        disAnsC = (TextView)findViewById(R.id.tvAnswerC);
        disAnsD = (TextView)findViewById(R.id.tvAnswerD);
        disFinalScore = (TextView)findViewById(R.id.tvFinalScore);
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
                //check to see if the answer is correct
                boolean correct = tools.checkCorrect(ANSWER_A);
                if (correct){
                    Toast.makeText(getBaseContext(),"CORRECT!!!!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getBaseContext(),"wrong :(",Toast.LENGTH_SHORT).show();
                }
                //get a new question
                if (round < 10){
                    quizQuestion = tools.makeQuizArray();
                    populateQuiz(quizQuestion);
                    round++;
                }else {
                    Intent myIntent = getIntent();
                    String userName = myIntent.getStringExtra("userName");
                    disFinalScore.setText(userName + " Final Score: " + tools.getCorrectAnswer()
                            + "/10");
                    //disable all buttons
                    disableButtons();
                }

            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check to see if the answer is correct
                boolean correct = tools.checkCorrect(ANSWER_B);
                if (correct){
                    Toast.makeText(getBaseContext(),"CORRECT!!!!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getBaseContext(),"wrong :(",Toast.LENGTH_SHORT).show();
                }
                //get a new question
                if (round < 10){
                    quizQuestion = tools.makeQuizArray();
                    populateQuiz(quizQuestion);
                    round++;
                }else {
                    Intent myIntent = getIntent();
                    String userName = myIntent.getStringExtra("userName");
                    disFinalScore.setText(userName + " Final Score: " + tools.getCorrectAnswer()
                            + "/10");
                    //disable all buttons
                    disableButtons();
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check to see if the answer is correct
                boolean correct = tools.checkCorrect(ANSWER_C);
                if (correct){
                    Toast.makeText(getBaseContext(),"CORRECT!!!!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getBaseContext(),"wrong :(",Toast.LENGTH_SHORT).show();
                }
                //get a new question
                if (round < 10){
                    quizQuestion = tools.makeQuizArray();
                    populateQuiz(quizQuestion);
                    round++;
                }else {
                    Intent myIntent = getIntent();
                    String userName = myIntent.getStringExtra("userName");
                    disFinalScore.setText(userName + " Final Score: " + tools.getCorrectAnswer()
                            + "/10");
                    //disable all buttons
                    disableButtons();
                }
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check to see if the answer is correct
                boolean correct = tools.checkCorrect(ANSWER_D);
                if (correct){
                    Toast.makeText(getBaseContext(),"CORRECT!!!!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getBaseContext(),"wrong :(",Toast.LENGTH_SHORT).show();
                }
                //get a new question
                if (round < 10){
                    quizQuestion = tools.makeQuizArray();
                    populateQuiz(quizQuestion);
                    round++;
                }else {
                    Intent myIntent = getIntent();
                    String userName = myIntent.getStringExtra("userName");
                    disFinalScore.setText(userName + " Final Score: " + tools.getCorrectAnswer()
                            + "/10");
                    //disable all buttons
                    disableButtons();
                }
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

    //disable all buttons when the final question is answered
    public void disableButtons(){
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
    }



}
