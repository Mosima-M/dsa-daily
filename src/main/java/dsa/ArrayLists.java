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

    public static int secondLargest(ArrayList<Integer> numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = -1;
        }

        return secondLargest;
    }

    public static ArrayList<Integer> rotateRight(ArrayList<Integer> numbers, int k){

        return null;
    }

}
