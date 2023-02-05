import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresOfASortedArrayTest {
    @Test
    void solution1() {
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

        assertArrayEquals(new int[]{0, 1, 9, 16, 100},
            squaresOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    void solution2() {
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, squaresOfASortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }
}