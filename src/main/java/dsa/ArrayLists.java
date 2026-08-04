package dsa;

import java.util.ArrayList;

public class ArrayLists {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers){
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer number : numbers) {
            if (!newList.contains(number)) {
                newList.add(number);
            }
        }
        return newList;
    }

    public static int secondLargest(ArrayList<Integer> numbers){
        return 0;
    }

    public static ArrayList<Integer> rotateRight(ArrayList<Integer> numbers, int k){
        return null;
    }

}
