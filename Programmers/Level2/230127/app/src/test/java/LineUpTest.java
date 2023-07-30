import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LineUpTest {
    @Test
    void solution() {
        LineUp lineUp = new LineUp();

        assertArrayEquals(new int[]{3, 1, 2}, lineUp.solution(3, 5));
    }
}
