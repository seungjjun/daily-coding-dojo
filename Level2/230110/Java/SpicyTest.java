import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpicyTest {
    @Test
    void solution1() {
        Spicy spicy = new Spicy();

        assertEquals(2, spicy.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    @Test
    void solution2() {
        Spicy spicy = new Spicy();

        assertEquals(-1, spicy.solution(new int[]{1, 2}, 10));
    }

    @Test
    void solution3() {
        Spicy spicy = new Spicy();

        assertEquals(2, spicy.solution(new int[]{1, 2, 3}, 5));
    }
}
