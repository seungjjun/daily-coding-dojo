import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HindexTest {
    @Test
    void solution1() {
        Hindex hindex = new Hindex();

        assertEquals(3, hindex.solution(new int[]{3, 0, 6, 1, 5}));
    }
}
