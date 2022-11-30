import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
    @Test
    void solution1() {
        Tuple tuple = new Tuple();

        assertArrayEquals(new Integer[]{2, 1, 3, 4},
            tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
    }

    @Test
    void solution2() {
        Tuple tuple = new Tuple();

        assertArrayEquals(new Integer[]{111, 20}, tuple.solution("{{20,111},{111}}"));
    }
}