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
    private double numOne;
    private double numTwo;
    private double total;
    private String displayNum;

    //declare elements
    private EditText displayEditText;

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

            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnPluseMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }//end onCreate

    public
}
