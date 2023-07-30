import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ZumCodingTestTest {
    @Test
    void solution() {
        ZumCodingTest zumCodingTest = new ZumCodingTest();

//        assertEquals(12, zumCodingTest.solution(new int[]{6, 5, 7, 3, 4, 2}));
//        assertEquals(4, zumCodingTest.solution(new int[]{2, 2, 2, 3}));
//        assertEquals(8, zumCodingTest.solution(new int[]{2, 1, 4, 5, 1, 3, 3}));

        assertArrayEquals(new int[]{1, 3, 4, 2, 5},
            zumCodingTest.solution(new int[][]{{1, 0, 5}, {2, 2, 2}, {3, 3, 1}, {4, 4, 1}, {5, 10, 2}}));
//
//        assertEquals(new int[]{1, 3, 2, 4, 5},
//            zumCodingTest.solution(new int[][]{{1, 0, 3}, {2, 1, 3}, {3, 3, 2}, {4, 9, 1}, {5, 10, 2}}));

//        assertArrayEquals(new int[]{1, 2, 4, 5, 3},
//            zumCodingTest.solution(new int[][]{{1, 2, 10}, {2, 5, 8}, {3, 6, 9}, {4, 20, 6}, {5,25,5}}));

//        assertEquals(3, zumCodingTest.solution(2));
//        assertEquals(12, zumCodingTest.solution(3));
    }
}
