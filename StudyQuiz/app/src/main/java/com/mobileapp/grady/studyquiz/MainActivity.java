package com.mobileapp.grady.studyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnStartQuiz;
    EditText userNameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameInput = (EditText)findViewById(R.id.editTextNameInput);
        Button btnStartQuiz = (Button)findViewById(R.id.btnNameSubmit);

        btnStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(MainActivity.this, QuizActivity.class);
                String passName = String.valueOf(userNameInput.getText());
                quiz.putExtra("userName", passName);//pass through the user name
                startActivity(quiz);
            }
        });
    }
}
