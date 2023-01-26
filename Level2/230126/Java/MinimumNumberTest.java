import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberTest {
    @Test
    void solution() {
        MinimumNumber minimumNumber = new MinimumNumber();

        assertEquals(29, minimumNumber.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }
}
