import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevelopmentTest {
    @Test
    void solution() {
        Development development = new Development();

        assertArrayEquals(new int[]{2, 1},
            development.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
    }
}
