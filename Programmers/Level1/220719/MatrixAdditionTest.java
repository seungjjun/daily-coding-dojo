import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixAdditionTest {
  @Test
  void matrixAdd() {
    MatrixAddition matrixAddition = new MatrixAddition();

    assertArrayEquals(new int[][]{{4},{6}},
        matrixAddition.solution(new int[][]{{1},{2}},new int[][]{{3},{4}}));
    assertArrayEquals(new int[][]{{4,6},{7,9}},
        matrixAddition.solution(new int[][] {{1,2},{2,3}},new int[][]{{3,4},{5,6}}));
  }
}
