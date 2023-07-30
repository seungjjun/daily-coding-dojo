import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exampleTest {
    @Test
    void solution1() {
        example example = new example();

        assertEquals(2, example.solution("3141592", "271"));
    }
}
