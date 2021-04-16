package Lesson3;

import java.util.*;

public class WordsArray {

    public void findUniqueWord(String[] myArray) {
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(myArray));
        System.out.println("Unique words:" + uniqueWords);
        ArrayList<String> myArrayList = new ArrayList<>(uniqueWords);
        HashMap<String, String> uniqueWordsCount = new HashMap<>();
        for (String s : myArrayList) {
            int counter = 0;
            for (String value : myArray) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            uniqueWordsCount.put(s, Integer.toString(counter));
        }
        System.out.println(uniqueWordsCount);
    }


}
