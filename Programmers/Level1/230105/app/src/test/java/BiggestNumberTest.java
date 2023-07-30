import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggestNumberTest {
    @Test
    void solution() {
        BiggestNumber biggestNumber = new BiggestNumber();

        assertEquals("6210", biggestNumber.solution(new int[]{6, 10, 2}));
    }

    @Test
    void solution2() {
        BiggestNumber biggestNumber = new BiggestNumber();

        assertEquals("9534330", biggestNumber.solution(new int[]{3, 30, 34, 5, 9}));
    }
}
