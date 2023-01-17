import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkillTreesTest {
    @Test
    void solution() {
        SkillTrees skillTrees = new SkillTrees();

        assertEquals(2, skillTrees.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }

    @Test
    void solution1() {
        SkillTrees skillTrees = new SkillTrees();

        assertEquals(3, skillTrees.solution("AEF", new String[]{"XVQW", "GZC", "HJKL"}));
    }
}
