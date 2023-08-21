import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTwoQueueTest {
    @Test
    void solution() {
        SumTwoQueue sumTwoQueue = new SumTwoQueue();

        assertEquals(2, sumTwoQueue.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}));
        assertEquals(-1, sumTwoQueue.solution(new int[]{1, 1}, new int[]{1, 5}));
        assertEquals(7, sumTwoQueue.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));
        assertEquals(-1, sumTwoQueue.solution(new int[]{1, 1, 1}, new int[]{1, 2, 1}));
        assertEquals(-1, sumTwoQueue.solution(new int[]{2, 4, 6}, new int[]{1, 3, 5}));
        assertEquals(8, sumTwoQueue.solution(new int[]{1, 2, 4}, new int[]{3, 2, 4}));
    }
}
