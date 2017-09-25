package com.mobileapp.grady.simplecalculator;

/**
 * Created by Grady on 2017-09-25.
 *
 * A class to store all calculator functions
 */

public class Calculator {
    //class variables
    private double numOne = 0;
    private double numTwo = 0;
    private double total = 0;
    private String modifier = "0";
    private boolean modEntered = false;

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
    }//end appendNumber

    public String gatherFunction(String num, String func){
        //check to make sure a function ahs not already been clickd
        if(modEntered == false){
            numOne = Double.parseDouble(num);
            modifier = func;
            modEntered = true;
            return "0";
        }//if one has check to see if there is already a number stored
        else if(modEntered == true){
            if
        }
    }
}
