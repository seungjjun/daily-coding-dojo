import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitBoxTest {
    @Test
    void solution() {
        FruitBox fruitBox = new FruitBox();

        assertEquals(33, fruitBox.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
