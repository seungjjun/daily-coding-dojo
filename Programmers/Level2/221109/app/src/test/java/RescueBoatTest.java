import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RescueBoatTest {
    @Test
    void solution() {
        RescueBoat rescueBoat = new RescueBoat();

        assertEquals(3, rescueBoat.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, rescueBoat.solution(new int[]{70, 80, 50}, 100));
    }
}