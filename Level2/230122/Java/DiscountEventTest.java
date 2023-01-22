import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountEventTest {
    @Test
    void solution() {
        DiscountEvent discountEvent = new DiscountEvent();

        assertEquals(3, discountEvent.solution(
            new String[]{"banana", "apple", "rice", "pork", "pot"},
            new int[]{3, 2, 2, 2, 1},
            new String[]{
                "chicken", "apple", "apple", "banana",
                "rice", "apple", "pork", "banana",
                "pork", "rice", "pot", "banana",
                "apple", "banana"
            }));
    }
}
