import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheTest {
    @Test
    void solution() {
        Cache cache = new Cache();

        assertEquals(50, cache.solution(3,
            new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju",
                "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    @Test
    void solution2() {
        Cache cache = new Cache();

        assertEquals(16, cache.solution(2,
            new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
    }

    @Test
    void solution3() {
        Cache cache = new Cache();

        assertEquals(25, cache.solution(0,
            new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
