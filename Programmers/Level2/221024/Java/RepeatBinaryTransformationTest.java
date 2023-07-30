import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatBinaryTransformationTest {
  @Test
  void solution1() {
    RepeatBinaryTransformation repeatBinaryTransformation =
        new RepeatBinaryTransformation();

    assertArrayEquals(new int[]{3, 8},
        repeatBinaryTransformation.solution("110010101001"));
  }

  @Test
  void solution2() {
    RepeatBinaryTransformation repeatBinaryTransformation =
        new RepeatBinaryTransformation();

    assertArrayEquals(new int[]{3, 3},
        repeatBinaryTransformation.solution("01110"));
  }

  @Test
  void solution3() {
    RepeatBinaryTransformation repeatBinaryTransformation =
        new RepeatBinaryTransformation();

    assertArrayEquals(new int[]{4, 1},
        repeatBinaryTransformation.solution("1111111"));
  }
}
