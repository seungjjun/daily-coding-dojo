import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockPricesTest {
    @Test
    void solution1() {
        StockPrices stockPrices = new StockPrices();

        assertArrayEquals(new int[]{4, 3, 1, 1, 0},
            stockPrices.solution(new int[]{1, 2, 3, 2, 3}));
    }

    @Test
    void solution2() {
        StockPrices stockPrices = new StockPrices();

        assertArrayEquals(new int[]{5, 4, 1, 2, 1, 0},
            stockPrices.solution(new int[]{1, 2, 3, 2, 3, 1}));
    }
}
