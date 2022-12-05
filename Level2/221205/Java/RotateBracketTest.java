import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateBracketTest {
    @Test
    void solution1() {
        RotateBracket rotateBracket = new RotateBracket();

        assertEquals(3, rotateBracket.solution("[](){}"));
    }

    @Test
    void solution2() {
        RotateBracket rotateBracket = new RotateBracket();

        assertEquals(2, rotateBracket.solution("}]()[{"));
    }

    @Test
    void solution3() {
        RotateBracket rotateBracket = new RotateBracket();

        assertEquals(0, rotateBracket.solution("}}}"));
    }
}
