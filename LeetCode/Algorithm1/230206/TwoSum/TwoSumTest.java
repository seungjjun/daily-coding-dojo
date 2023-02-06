import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    void solution1() {
        TwoSum twoSum = new TwoSum();

        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void solution2() {
        TwoSum twoSum = new TwoSum();

        assertArrayEquals(new int[]{1, 3}, twoSum.twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    void solution3() {
        TwoSum twoSum = new TwoSum();

        assertArrayEquals(new int[]{2, 3}, twoSum.twoSum(new int[]{1, 2, 8, 12}, 10));
    }
}
