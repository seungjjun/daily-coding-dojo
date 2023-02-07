import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {
    @Test
    void solution() {
        ReverseWords reverseWords = new ReverseWords();

        assertEquals("doG gniD", reverseWords.reverseWords("God Ding"));
    }
}
