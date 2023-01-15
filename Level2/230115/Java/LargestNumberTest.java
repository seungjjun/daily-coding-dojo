import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumberTest {
    @Test
    void solution1() {
        LargestNumber largestNumber = new LargestNumber();

        assertEquals("6210", largestNumber.solution(new int[]{6, 10, 2}));
    }

    @Test
    void solution2() {
        LargestNumber largestNumber = new LargestNumber();

        assertEquals("9534330", largestNumber.solution(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    void solution3() {
        LargestNumber largestNumber = new LargestNumber();

        assertEquals("67767676", largestNumber.solution(new int[]{67, 676, 677}));
    }

    @Test
    void solution4() {
        LargestNumber largestNumber = new LargestNumber();

        assertEquals("9799797881881817", largestNumber.solution(new int[]{979, 97, 978, 81, 818, 817}));
    }

    @Test
    void solution5() {
        LargestNumber largestNumber = new LargestNumber();

        assertEquals("0", largestNumber.solution(new int[]{0, 0, 0}));
    }
}
