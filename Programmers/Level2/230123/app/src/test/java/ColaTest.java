import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaTest {
    @Test
    void solution() {
        Cola cola = new Cola();

        assertEquals(9, cola.solution(3, 1, 20));
    }

    @Test
    void solution2() {
        Cola cola = new Cola();

        assertEquals(19, cola.solution(2, 1, 20));
    }
}
