package dsa;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {

    public static HashMap<String, Integer> countWords(ArrayList<String> words) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }

    public static String highestMark(HashMap<String, Integer> marks) {

        String highestStudent = "";
        int highestMark = Integer.MIN_VALUE;

        for (String student : marks.keySet()) {
            if (marks.get(student) > highestMark) {
                highestMark = marks.get(student);
                highestStudent = student;
            }
        }
        return highestStudent;
    }

    public static HashMap<String, Integer> removeBelow(HashMap<String, Integer> map, int minimum){
        return null;
    }
}

