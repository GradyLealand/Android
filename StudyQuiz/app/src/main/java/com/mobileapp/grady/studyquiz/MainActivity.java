package com.mobileapp.grady.studyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStartQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStartQuiz = (Button)findViewById(R.id.btnNameSubmit);

        btnStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(quiz);
            }
        });
    }
}
