package dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayListsTest {

    @Test
    void shouldRemoveDuplicates() {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(1,2,2,3,1,4));

        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(1,2,3,4));

        assertEquals(expected, ArrayLists.removeDuplicates(numbers));
    }

    @Test
    void shouldReturnEmptyList() {

        ArrayList<Integer> numbers = new ArrayList<>();

        assertEquals(numbers,
                ArrayLists.removeDuplicates(numbers));
    }

    @Test
    void shouldHandleSingleElement() {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(7));

        assertEquals(numbers,
                ArrayLists.removeDuplicates(numbers));
    }

    @Test
    void shouldFindSecondLargest() {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(5,8,2,8,3));

        assertEquals(5,
                ArrayLists.secondLargest(numbers));
    }

    @Test
    void shouldReturnMinusOneIfOnlyOneUniqueNumber() {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(5,5,5));

        assertEquals(-1,
                ArrayLists.secondLargest(numbers));
    }

    @Test
    void shouldHandleNegativeNumbers() {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(-4,-1,-9));

        assertEquals(-4,
                ArrayLists.secondLargest(numbers));
    }

    @Test
    void shouldRotateRightByTwo() {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(4,5,1,2,3));

        assertEquals(expected,
                ArrayLists.rotateRight(numbers,2));
    }

    @Test
    void shouldRotateByZero() {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(1,2,3));

        assertEquals(numbers,
                ArrayLists.rotateRight(numbers,0));
    }

//    @Test
//    void shouldRotateMoreThanSize() {
//
//        ArrayList<Integer> numbers =
//                new ArrayList<>(Arrays.asList(1,2,3));
//
//        ArrayList<Integer> expected =
//                new ArrayList<>(Arrays.asList(2,3,1));
//
//        assertEquals(expected,
//                ArrayLists.rotateRight(numbers,4));
//    }

}
