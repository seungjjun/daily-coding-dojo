import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetNumberTest {
    @Test
    void solution() {
        TargetNumber targetNumber = new TargetNumber();

        assertArrayEquals(new int[]{0, 1, 1, 1, 1, 1, 1, 1,1,1}, targetNumber.solution(123456789));
    }
}
