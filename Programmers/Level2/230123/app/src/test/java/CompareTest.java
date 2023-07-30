import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {
    @Test
    void divisorNumber() {
        Compare compare = new Compare();

        assertEquals(2, compare.getDivisorNumber(5));
    }

    @Test
    void solution() {
        Compare compare = new Compare();

        assertEquals(21, compare.solution(10, 3, 2));
    }
}
