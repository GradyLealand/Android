package com.mobileapp.grady.studyquiz;

import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by Grady on 2017-10-23.
 */

public class QuizTools {
    private HashMap<String, String> definitionMap = new HashMap<String, String>();
    private ArrayList<String> definitionsList;
    private ArrayList<String> answersList = new ArrayList<String>();
    Random ran = new Random();


    //reads the quiz file
    public ArrayList<String> readFile(InputStream is){
        String quizString;
        ArrayList<String> quizArray;
        //create buffered reader and String builder to read from and into
        String line = "";
        StringBuilder fullFile = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //read into StringBuilder
        try{
            while((line = br.readLine()) != null){
                fullFile.append(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //convert to a string then return it.
        quizString = fullFile.toString();
        //add the String to an array list and then put that ArrayList into a HashMap
        quizArray = parseToArray(quizString);
        toHash(quizArray);
        definitionsList = new ArrayList<String>(definitionMap.keySet());
        //make the keypairs ArrayList;
        makeKeyPairs();
        return quizArray;
    }

    //put the string into an array seperating at the |'s
    public ArrayList<String> parseToArray(String myString){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(myString.split("\\|")));
        return list;
    }//end parseToArray

    //populate hash maps
    void toHash(ArrayList list){
        //a seperate key value since the look is incrementing by 2
        //loop through the array in increments of 2
        for(int i = 0; i < list.size(); i += 2){
            definitionMap.put(String.valueOf(list.get(i)), String.valueOf(list.get(i + 1)));
        }
    }//end toHash

    //populate array lists
    void makeKeyPairs(){
        for(int i = 0; i < definitionsList.size(); i++){

            answersList.add(definitionMap.get(String.valueOf(definitionsList.get(i))));
        }
    }
    //create questions array
    String[] makeQuizArray(){
        String[] strArray = new String[5];
        //pick a random definition
        int defNum = ran.nextInt(definitionsList.size());
        //get a random position for the correct answer
        int hideAnswer = ran.nextInt(4) + 1; //make it be 1-4
        //set the first index of the array to the random definition
        strArray[0] = String.valueOf(definitionsList.get(defNum));
        //start at index 1
        for(int i = 1; i < strArray.length; i++){
            //declare the number that will be randomized outside of the while
            // loop so it can be accessed at the end
            int wrong = 0;
            if(i == hideAnswer){
                strArray[i] = String.valueOf(definitionMap.get(String.valueOf(definitionsList.get(defNum))));
            }else{
                //while the random wrong answer is equal to the answer or an already placed wrong
                boolean check = false;
                while(!check){
                    //set true
                    check = true;
                    //roll to get a random wrong answer
                    wrong = ran.nextInt(answersList.size());
                    //loop through the list to see if it has an identical match
                    for(int j = 1; j <5; j++){
                        if(strArray[j]!=null){
                            if(strArray[j].equals(String.valueOf(answersList.get(wrong)))){
                                //if equal set check to false
                                check = false;
                            }
                        //check to see if the term at "wrong" (from the answersList)
                            // is the same as the answer (from the hashmap)
                        }else if(String.valueOf(answersList.get(wrong))
                                .equals(String.valueOf(definitionMap.get(String
                                        .valueOf(definitionsList.get(defNum)))))){
                            //if it is equal to the correct answer flag as false
                            check = false;
                        }
                    }
                }
                //if it is not equal to the corect answer or any index of the array add to array
                strArray[i] = String.valueOf(answersList.get(wrong));
            }
        }
        //remove the definition form the list so it cant be guessed again
        definitionsList.remove(defNum);
        return strArray;
    }




}
