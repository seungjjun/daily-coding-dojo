import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void solution() {
        Rectangle rectangle = new Rectangle();

        assertEquals(4000, rectangle.solution(
            new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}
        ));
    }
}
