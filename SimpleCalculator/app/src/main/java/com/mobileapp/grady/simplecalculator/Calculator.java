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
    private boolean negativeInt = false;
    private boolean solutionHeld = false;
    private boolean numEntered = true;

    //when a number or decimal button is clicked
    public String appendNumber(String appendNum, String origNum){
        //tell the program a number has been entered
        numEntered = true;
        //check for rolling math
        if (solutionHeld == true){
            origNum = "0";
            solutionHeld = false;
        }
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

    //if a function button is clicked
    public String gatherFunction(String num, String func){
        if(numEntered == true) {
            //check to see if a function has already been clicked
            if (!modEntered) {
                //store the curent displayed number in numOne
                numOne = Double.parseDouble(num);
                //store the type of function in func
                modifier = func;
                //if a function has not been triggered yet set bool to true
                modEntered = true;
                //reset negativeInt
                negativeInt = false;
                solutionHeld = true;
                //tell the program it will need to enter another number
                numEntered = false;
                return num;
            } else {//a function key was already clicked
                //make a string to pars and hold and new num one
                String newNum = calcTotal(num);
                numOne = Double.parseDouble(newNum);
                modifier = func;
                //make sure the program still knows that a mod was entered
                modEntered = true;
                //tell the program it will need to enter another number
                numEntered = false;
                return newNum;
            }
        }else{
            return num;
        }
    }

    //when the "+/-" button is clicked
    public String inverseNumber(String origNum){
        //check to see if only a 0 is present
        if(origNum.equals("0")){
            return origNum;
        }else if(origNum.charAt(0) == '0'){
            boolean allZero = true;
            for(int i = 2; i < origNum.length(); i++){
                if (origNum.charAt(i) != '0'){
                    allZero = false;
                }
            }
            if(allZero == true){
                return origNum;
            }
        }
        //check to see it the number is already a negative
        if(negativeInt == false){// if not append "-" to the front of the string
            origNum = "-" + origNum;
            negativeInt = true;
        }else{//remove the first char, "-", from the string
            origNum = origNum.substring(1);
            negativeInt = false;
        }
        return origNum;
    }

    //when"=" button is clicked
    public String calcTotal(String num){
        numTwo = Double.parseDouble(num);
        if(modifier.equals("+")){
            total = numOne + numTwo;
        }else if(modifier.equals("-")){
            total = numOne - numTwo;
        }else if(modifier.equals("/")){
            //if you try to divide by zero
            if(numTwo == 0){
                //reset numbers
                numOne = 0;
                numTwo = 0;
                //reset booleans
                modEntered = false;
                negativeInt = false;
                //assign total to a string and return it for display
                String returnNum = "NaN";
                solutionHeld = true;
                return returnNum;
            }
            total = numOne / numTwo;
        }else if(modifier.equals("X")){
            total = numOne * numTwo;

        }
        //reset numbers
        numOne = total;
        numTwo = 0;
        //reset booleans
        modEntered = false;
        negativeInt = false;
        solutionHeld = true;
        //assign total to a string and return it for display
        String returnNum = Double.toString(total);
        return returnNum;
    }

    //when the backspace button is clicked
    public String backSpace(String num){
        if(num.length() > 1){
            num = num.substring(0, num.length() - 1);
        }else{
            num = "0";
        }
        return num;
    }

    //when the
    public String clearDisplay(String num){
        //reset everything
        numOne = 0;
        numTwo = 0;
        total = 0;
        modEntered = false;
        num = "0";
        return num;
    }
}
