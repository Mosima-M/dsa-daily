package dsa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringsTests {

    @Test
    void reverseStringTests() {
        assertEquals("olleh", Strings.reverseString("hello"));
        assertEquals("avaJ", Strings.reverseString("Java"));
        assertEquals("321", Strings.reverseString("123"));
        assertEquals("", Strings.reverseString(""));
    }
    @Test
    void countVowelsTests() {
        assertEquals(2, Strings.countVowels("hello"));
        assertEquals(5, Strings.countVowels("AEIOU"));
        assertEquals(0, Strings.countVowels("rhythm"));
        assertEquals(3, Strings.countVowels("Java Programming"));
        assertEquals(0, Strings.countVowels(""));
    }

}
