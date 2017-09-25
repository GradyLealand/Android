/*
*Simple calculator
*Grady Williams
*Sept 29, 2017
*
 */
package com.mobileapp.grady.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //class variables
    private String displayNum = "0";

    //declare elements
    private EditText displayEditText;

    //create an istance of calculator
    Calculator calc = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //atatch all button id's
        displayEditText = (EditText) findViewById(R.id.editTextDisplayNums);
        //number buttons
        Button btnOne = (Button) findViewById(R.id.btnNum1);
        Button btnTwo = (Button) findViewById(R.id.btnNum2);
        Button btnThree = (Button) findViewById(R.id.btnNum3);
        Button btnFour = (Button) findViewById(R.id.btnNum4);
        Button btnFive = (Button) findViewById(R.id.btnNum5);
        Button btnSix = (Button) findViewById(R.id.btnNum6);
        Button btnSeven = (Button) findViewById(R.id.btnNum7);
        Button btnEight = (Button) findViewById(R.id.btnNum8);
        Button btnNine = (Button) findViewById(R.id.btnNum9);
        Button btnZero = (Button) findViewById(R.id.btnNum0);
        //function buttons
        Button btnDecimal = (Button) findViewById(R.id.btnDecimal);
        Button btnBackSpace = (Button) findViewById(R.id.btnBackSpace);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        Button btnPluseMinus = (Button) findViewById(R.id.btnNegPos);
        Button btnAdd = (Button) findViewById(R.id.btnPluse);
        Button btnMinus = (Button) findViewById(R.id.btnSubtract);
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        Button btnEquals = (Button) findViewById(R.id.btnEquals);

        //create onClickListeners
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("1", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("2", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("3", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("4", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("5", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("6", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("7", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("8", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("9", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber("0", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(".", displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnPluseMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check to see that no other function has already been entered

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }//end onCreate


}
