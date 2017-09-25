package com.mobileapp.grady.simplecalculator;

/**
 * Created by Grady on 2017-09-25.
 *
 * A class to store all calculator functions
 */

public class Calculator {
    public String appendNumber(String appendNum, String origNum){
        //check to see fi the display still reads 0
        if(appendNum.equals(".")){
            if(origNum.contains(".")){
                //do nothing
                return origNum;
            }else{
                origNum = origNum + appendNum;
                return origNum;
            }
        }else if(origNum.equals("0")){
            origNum = appendNum;
            return origNum;
        }else{
            origNum = origNum + appendNum;
            return origNum;
        }
    }
}
