package com.mobileapp.grady.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnZero;
    private Button btnDecimal;
    private Button btnBackSpace;
    private Button btnClear;
    private Button btnPluseMinus;
    private Button btnAdd;
    private Button btnMinus;
    private Button btnDivide;
    private Button btnMultiply;
    private Button btnEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayEditText = (EditText) findViewById(R.id.editTextDisplayNums);
        btnOne = (Button) findViewById(R.id.btnNum1);
        btnTwo = (Button) findViewById(R.id.btnNum2);
        btnThree = (Button) findViewById(R.id.btnNum3);
        btnFour = (Button) findViewById(R.id.btnNum4);
        btnFive = (Button) findViewById(R.id.btnNum5);
        btnSix = (Button) findViewById(R.id.btnNum6);
        btnSeven = (Button) findViewById(R.id.btnNum7);
        btnEight = (Button) findViewById(R.id.btnNum8);
        btnNine = (Button) findViewById(R.id.btnNum9);
        btnZero = (Button) findViewById(R.id.btnNum0);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnBackSpace = (Button) findViewById(R.id.btnBackSpace);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnPluseMinus = (Button) findViewById(R.id.btnNegPos);
        btnAdd = (Button) findViewById(R.id.btnPluse);
        btnMinus = (Button) findViewById(R.id.btnSubtract);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnEquals = (Button) findViewById(R.id.btnEquals);
    }
}
