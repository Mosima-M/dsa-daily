package dsa;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapsTests {

    @Test
    void countWords_countsOccurrencesCorrectly() {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");

        HashMap<String, Integer> result = HashMaps.countWords(words);

        assertEquals(2, result.get("apple"));
        assertEquals(1, result.get("banana"));
        assertEquals(2, result.size());
    }

    @Test
    void countWords_emptyList_returnsEmptyMap() {
        HashMap<String, Integer> result = HashMaps.countWords(new ArrayList<>());
        assertTrue(result.isEmpty());
    }

    @Test
    void highestMark_returnsStudentWithHighestMark() {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Sima", 85);
        marks.put("Lethabo", 92);
        marks.put("Karabo", 78);

        assertEquals("Lethabo", HashMaps.highestMark(marks));
    }

    @Test
    void highestMark_emptyMap_returnsEmptyString() {
        assertEquals("", HashMaps.highestMark(new HashMap<>()));
    }

    @Test
    void removeBelow_filtersEntriesBelowMinimum() {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Presh", 85);
        marks.put("Rea", 40);
        marks.put("Hlogi", 60);

        HashMap<String, Integer> result = HashMaps.removeBelow(marks, 60);

        assertEquals(2, result.size());
        assertTrue(result.containsKey("Presh"));
        assertTrue(result.containsKey("Hlogi"));
        assertFalse(result.containsKey("Rea"));
    }

    @Test
    void removeBelow_originalMapUnchanged() {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Nolo", 85);

        HashMaps.removeBelow(marks, 90);

        assertEquals(1, marks.size());
    }
}
