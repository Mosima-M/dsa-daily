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

}
