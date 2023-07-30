import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeHamburgerTest {
    @Test
    void solution() {
        MakeHamburger makeHamburger = new MakeHamburger();

        assertEquals(2, makeHamburger.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
}
