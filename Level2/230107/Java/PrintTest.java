import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {
    @Test
    void solution1() {
        Print print = new Print();

        assertEquals(1, print.solution(new int[]{2, 1, 4, 3}, 2));
    }

    @Test
    void solution2() {
        Print print = new Print();

        assertEquals(5, print.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
