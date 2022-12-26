import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneketmonTest {
    @Test
    void solution() {
        Phoneketmon phoneketmon = new Phoneketmon();

        assertEquals(2, phoneketmon.solution(new int[]{3, 1, 2, 3}));

        assertEquals(3, phoneketmon.solution(new int[]{3, 3, 3, 2, 2, 4}));

        assertEquals(2, phoneketmon.solution(new int[]{3, 3, 3, 2, 2, 2}));

        assertEquals(1, phoneketmon.solution(new int[]{1, 1, 1, 1, 1}));
    }
}
