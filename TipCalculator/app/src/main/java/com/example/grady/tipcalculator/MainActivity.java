package com.example.grady.tipcalculator;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.text.*;
import android.widget.*;
import android.widget.SeekBar.OnSeekBarChangeListener;


public class MainActivity extends AppCompatActivity {
    //link in MyMath
    public MyMath calculator = new MyMath();

    //constants for saveing
    private static final String BILL_TOTAL = "BILL_TOTAL";
    private static final String CUSTOM_PERCENT = "CUSTOM PERCENT";

    //class variables
    private double currentBillTotal;
    private int currentCustomPercent;

    //Step#1
    private EditText tipCustomEditText;
    private EditText totalCustomEditText;
    private EditText billEditText;
    private TextView customTipTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Step#2
        tipCustomEditText = (EditText) findViewById(R.id.tipCustomTextEdit);
        totalCustomEditText = (EditText) findViewById(R.id.totalCustomTextEdit);
        billEditText = (EditText) findViewById(R.id.billEditText);
        customTipTextView = (TextView) findViewById(R.id.customTipTextView);
        SeekBar customeSeekBar = (SeekBar) findViewById(R.id.customSeekBar);
        //Step#3
        //billEditText.addTextChangedListener(billEditTextWatch);
        customeSeekBar.setOnSeekBarChangeListener(customSeekBarListener);
    }//end onCreate

    private SeekBar.OnSeekBarChangeListener customSeekBarListener = new SeekBar.OnSeekBarChangeListener(){
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            currentCustomPercent = seekBar.getProgress();
            updateCustom();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    };//end annon inner class

    public void updateCustom(){
        customTipTextView.setText(currentCustomPercent+"%");
        double customTipAmount = currentBillTotal * currentCustomPercent *.01;
        double customTotalAmount = currentBillTotal + customTipAmount;
        tipCustomEditText.setText(String.format("%.02", customTipAmount));
        totalCustomEditText.setText(String.format("%.02",customTotalAmount));
    }
}

