import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClawMachineGameTest {
  @Test
  void fiveSize() {
    ClawMachineGame clawMachineGame = new ClawMachineGame();

    assertEquals(4, clawMachineGame.solution(
        new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        }, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
  }

  @Test
  void sixSize() {
    ClawMachineGame clawMachineGame = new ClawMachineGame();

    assertEquals(4, clawMachineGame.solution(
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3, 0},
            {0, 2, 5, 0, 1, 2},
            {4, 2, 4, 4, 2, 3},
            {3, 5, 1, 3, 1, 1}
        }, new int[]{1, 3, 6, 2, 6, 1}));
  }

  @Test
  void full() {
    ClawMachineGame clawMachineGame = new ClawMachineGame();

    assertEquals(24, clawMachineGame.solution(
        new int[][]{
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}
        }, new int[]{
            1, 1, 1, 1, 1,
            2, 2, 2, 2, 2,
            3, 3, 3, 3, 3,
            4, 4, 4, 4, 4,
            5, 5, 5, 5, 5
        }));
  }

  @Test
  void simple() {
    ClawMachineGame clawMachineGame = new ClawMachineGame();

    assertEquals(0, clawMachineGame.solution(
        new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        }, new int[]{1, 1, 1, 1}));
  }

  @Test
  void simple2() {
    ClawMachineGame clawMachineGame = new ClawMachineGame();

    assertEquals(6, clawMachineGame.solution(
        new int[][]{
            {0, 0, 0, 0, 0},
            {0, 4, 1, 0, 3},
            {0, 4, 5, 0, 1},
            {4, 4, 4, 4, 2},
            {3, 4, 1, 3, 1}
        }, new int[]{2, 2, 2, 2, 2, 3, 4, 1}));
  }
}
