import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamouflageTest {
    @Test
    void solution() {
        Camouflage camouflage = new Camouflage();

        assertEquals(5, camouflage.solution(
            new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
            }));
    }
}
