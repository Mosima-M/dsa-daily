package dsa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArraysTest {
    // ========== twoSum ==========

    @Test
    void shouldFindTwoSumIndices() {
        assertArrayEquals(
                new int[]{0, 1},
                Arrays.twoSum(new int[]{2, 7, 11, 15}, 9)
        );
    }

    @Test
    void shouldFindTwoSumWithDuplicates() {
        assertArrayEquals(
                new int[]{0, 1},
                Arrays.twoSum(new int[]{3, 3}, 6)
        );
    }

    // ========== maxProfit ==========

    @Test
    void shouldFindMaxProfit() {
        assertEquals(5, Arrays.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void shouldReturnZeroWhenNoProfitPossible() {
        assertEquals(0, Arrays.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    // ========== productExceptSelf ==========

    @Test
    void shouldComputeProductExceptSelf() {
        assertArrayEquals(
                new int[]{24, 12, 8, 6},
                Arrays.productExceptSelf(new int[]{1, 2, 3, 4})
        );
    }


}
