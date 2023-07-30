import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastCommonMultipleTest {
    @Test
    void sort() {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

        assertArrayEquals(new int[]{2,6,8,14},
            leastCommonMultiple.sort(new int[]{6, 14, 2, 8}));
    }

    @Test
    void solution() {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

        assertEquals(10, leastCommonMultiple.solution(new int[]{2, 5}));
    }

    @Test
    void solution2() {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

        assertEquals(12, leastCommonMultiple.solution(new int[]{2, 3, 4}));
    }

    @Test
    void solution3() {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

        assertEquals(168, leastCommonMultiple.solution(new int[]{2, 6, 8, 14}));
    }
}