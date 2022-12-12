package com.example.dictonary_kapil;

import java.util.HashMap;

public class DictionaryUsingHashMap {

    // Creating HashMap
    private HashMap<String, String> dictionary;

    // Creating constructor
    public DictionaryUsingHashMap() {
        this.dictionary = new HashMap<>();
        addWordList();
    }

    // Method to add word and meaning
    public boolean addWord(String word, String meaning){
        try {
            dictionary.put(word, meaning);
        }catch (Exception e){
            e.printStackTrace(); // this method print the exception
            return false;
        }

        return true;
    }

    // This method will return meaning of word, if word is present in map
    // else it will display message, that word not exist
    public String getMeaning(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }else{
            return "Word does not exist in dictionary!";
        }
    }

    // here adding word and their meaning in map.
    private void addWordList(){
        addWord("shubh", "Auspicious");
        addWord("Phase", "a stage in the development of something");
        addWord("project", "an individual or collaborative enterprise that is carefully planned to achieve a particular aim");
        addWord("start", "beginning");
        addWord("Depreciating assets ", "Whose value decreases with time");
        addWord("hi", "friendly greeting");
    }
}

