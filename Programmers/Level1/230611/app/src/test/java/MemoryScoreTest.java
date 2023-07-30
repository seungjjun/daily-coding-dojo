import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryScoreTest {
    @Test
    void test() {
        MemoryScore memoryScore = new MemoryScore();

        assertArrayEquals(new int[]{67, 0, 55},
            memoryScore.solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55},
                new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}}));
    }
}