import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewIdRecommendationTest {
    @Test
    void idReplace() {
        NewIdRecommendation newIdRecommendation = new NewIdRecommendation();

        assertEquals("ab.c", newIdRecommendation.replace("a%b....@c()()."));
    }

    @Test
    void convertBlankToA() {
        NewIdRecommendation newIdRecommendation = new NewIdRecommendation();

        assertEquals("a", newIdRecommendation.convertBlankString(""));
    }

    @Test
    void substring() {
        NewIdRecommendation newIdRecommendation = new NewIdRecommendation();

        assertEquals("aaaabbbbccccdd", newIdRecommendation.substring("aaaabbbbccccdd.dde"));
    }

    @Test
    void solution() {
        NewIdRecommendation newIdRecommendation = new NewIdRecommendation();

        assertEquals("bat.y.abcdefghi", newIdRecommendation.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
