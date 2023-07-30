import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {
    @Test
    void solution1() {
        Truck truck = new Truck();

        assertEquals(8, truck.solution(2, 10, new int[]{7, 4, 5, 6}));
    }

    @Test
    void solution2() {
        Truck truck = new Truck();

        assertEquals(110, truck.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}
