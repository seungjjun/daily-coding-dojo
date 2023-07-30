import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestSingerTest {
    @Test
    void solution() {
        BestSinger bestSinger = new BestSinger();

        assertArrayEquals(new int[]{10, 10, 10, 20, 20, 100, 100},
            bestSinger.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
    }
}
