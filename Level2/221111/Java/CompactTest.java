import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompactTest {
    @Test
    void solution() {
        Compact compact = new Compact();

        assertArrayEquals(new int[]{11, 1, 27, 15}, compact.solution("KAKAO"));

        assertArrayEquals(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34},
            compact.solution("TOBEORNOTTOBEORTOBEORNOT"));

        assertArrayEquals(new int[]{1, 2, 27, 29, 28, 31, 30}, compact.solution("ABABABABABABABAB"));
    }
}
