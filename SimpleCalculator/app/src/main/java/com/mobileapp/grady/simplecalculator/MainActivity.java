/**
*Simple calculator
*Grady Williams
*Sept 29, 2017
*https://icons8.com/icon/43502/Calculator" Calculator icon credits
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

    //create an instance of calculator
    Calculator calc = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //atatch all button id's
        displayEditText = (EditText) findViewById(R.id.editTextDisplayNums);
        //number buttons
        final Button btnOne = (Button) findViewById(R.id.btnNum1);
        final Button btnTwo = (Button) findViewById(R.id.btnNum2);
        final Button btnThree = (Button) findViewById(R.id.btnNum3);
        final Button btnFour = (Button) findViewById(R.id.btnNum4);
        final Button btnFive = (Button) findViewById(R.id.btnNum5);
        final Button btnSix = (Button) findViewById(R.id.btnNum6);
        final Button btnSeven = (Button) findViewById(R.id.btnNum7);
        final Button btnEight = (Button) findViewById(R.id.btnNum8);
        final Button btnNine = (Button) findViewById(R.id.btnNum9);
        final Button btnZero = (Button) findViewById(R.id.btnNum0);
        //function buttons
        final Button btnDecimal = (Button) findViewById(R.id.btnDecimal);
        final Button btnBackSpace = (Button) findViewById(R.id.btnBackSpace);
        final Button btnClear = (Button) findViewById(R.id.btnClear);
        final Button btnPluseMinus = (Button) findViewById(R.id.btnNegPos);
        final Button btnAdd = (Button) findViewById(R.id.btnPluse);
        final Button btnMinus = (Button) findViewById(R.id.btnSubtract);
        final Button btnDivide = (Button) findViewById(R.id.btnDivide);
        final Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        final Button btnEquals = (Button) findViewById(R.id.btnEquals);

        //create onClickListeners
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnOne.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnTwo.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnThree.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnFour.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnFive.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnSix.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnSeven.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnEight.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnNine.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnZero.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.appendNumber(btnDecimal.getText().toString(), displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnPluseMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.inverseNumber(displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.gatherFunction(displayNum, btnAdd.getText().toString());
                displayEditText.setText(displayNum);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.gatherFunction(displayNum, btnMinus.getText().toString());
                displayEditText.setText(displayNum);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.gatherFunction(displayNum, btnMultiply.getText().toString());
                displayEditText.setText(displayNum);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.gatherFunction(displayNum, btnDivide.getText().toString());
                displayEditText.setText(displayNum);
            }
        });
        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.backSpace(displayNum);
                displayEditText.setText(displayNum);
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.calcTotal(displayNum);
                displayEditText.setText(displayNum);
                //reset display num
                displayNum = "0";
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNum = calc.clearDisplay(displayNum);
                displayEditText.setText(displayNum);
            }
        });

    }//end onCreate


}
