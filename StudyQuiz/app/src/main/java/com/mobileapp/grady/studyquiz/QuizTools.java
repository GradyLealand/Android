package com.mobileapp.grady.studyquiz;

import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Grady on 2017-10-23.
 */

public class QuizTools {
    private HashMap<Integer, String> definitionMap = new HashMap<Integer, String>();
    private HashMap<Integer, String> phraseMap = new HashMap<Integer, String>();


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
        quizArray = parseToArray(quizString);
        toHash(quizArray);
        System.out.println(phraseMap.toString());
        return quizArray;
    }

    //put the string into an array seperating at the |'s
    public ArrayList<String> parseToArray(String myString){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(myString.split("\\|")));
        return list;
    }

    //populate hash maps
    void toHash(ArrayList list){
        //the value to assign to key
        int keyValue = 1;
        for(int i = 0; i < list.size(); i++){
            //if even add to the definitions map
            if(i % 2 == 0){
                definitionMap.put(keyValue, String.valueOf(list.get(i)));
            }else{
                phraseMap.put(keyValue, String.valueOf(list.get(i)));
                keyValue++;
            }
        }
    }

    public HashMap<Integer, String> getDefinitionMap() {
        return definitionMap;
    }

    public void setDefinitionMap(HashMap<Integer, String> definitionMap) {
        this.definitionMap = definitionMap;
    }

    public HashMap<Integer, String> getPhraseMap() {
        return phraseMap;
    }

    public void setPhraseMap(HashMap<Integer, String> phraseMap) {
        this.phraseMap = phraseMap;
    }
}
