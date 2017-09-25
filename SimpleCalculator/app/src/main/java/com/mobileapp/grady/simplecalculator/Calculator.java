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
        numOne = Double.parseDouble(num);
        modifier = func;
        modEntered = true;
        return "0";
    }

    public String calcTotal(String num){
        numTwo = Double.parseDouble(num);
        if(modifier.equals("+")){
            total = numOne + numTwo;
        }else if(modifier.equals("-")){
            total = numOne - numTwo;
        }else if(modifier.equals("/")){
            total = numOne / numTwo;
        }else if(modifier.equals("X")){
            total = numOne * numTwo;
        }
        //reset numbers
        numOne = 0;
        numTwo = 0;
        String returnNum = Double.toString(total);
        return returnNum;
    }
}
