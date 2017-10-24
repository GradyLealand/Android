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

/**
 * Created by Grady on 2017-10-23.
 */

public class QuizTools {
    private HashMap<String, String> definitionMap = new HashMap<String, String>();
    private ArrayList<String> definitions = new ArrayList<String>();


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
        quizString =fullFile.toString();
        //add the String to an array list and then put that arraylist into a hashmap
        quizArray = parseToArray(quizString);
        toHash(quizArray);
        // add all the definitions into an Array list so they can be picked form and removed
        definitions = createDefinitionsList(quizArray);
        return quizArray;
    }

    //put the string into an array seperating at the |'s
    public ArrayList<String> parseToArray(String myString){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(myString.split("\\|")));
        return list;
    }//end parseToArray

    //populate hash maps
    void toHash(ArrayList list){
        //loop through the array in increments of 2
        for(int i = 0; i < list.size(); i += 2){
            // place i in the key and i + 1 in the value to represent (definition, phrase)
            definitionMap.put(String.valueOf(list.get(i)), String.valueOf(list.get(i + 1)));
        }
    }//end toHash

    //create an arraylist of only the definitions
    ArrayList<String> createDefinitionsList(ArrayList<String> disect){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < disect.size(); i += 2){
            list.add(String.valueOf(disect.get(i)));
        }
        return list;
    }//end createDefinitionsList

    //return an array of the definition , 4 possible answers, and the answer key
    ArrayList<String> buildQuestion(){
        ArrayList<String> questionList = new ArrayList<String>();
        //get a random number between 0 and the length of the remaining definitions
        Random ran = new Random();
        int ranNum = ran.nextInt(definitions.size());
        int hideAnswer = ran.nextInt(4);
        //get a random definition
        String question = String.valueOf(definitions.get(ranNum));
        //remove it form the list so it can not be used again
        definitions.remove(ranNum);
        //put the definition and 3 random phrases into the list
        questionList.add(question);
        for (int i = 1; i < 6; i++){
            strin
        }



        return questionList;
    }

}
