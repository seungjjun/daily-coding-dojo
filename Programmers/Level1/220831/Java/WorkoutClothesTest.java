import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkoutClothesTest {
  @Test
  void solution() {
    WorkoutClothes workoutClothes = new WorkoutClothes();

    assertEquals(5, workoutClothes.solution(
        5, new int[]{2, 4}, new int[]{1, 3, 5}));
  }

  @Test
  void lostAndReserve() {
    WorkoutClothes workoutClothes = new WorkoutClothes();

    assertEquals(9, workoutClothes.solution(
        10, new int[]{1, 2, 5, 6, 9}, new int[]{1, 3, 5, 6}));
  }

  @Test
  void sort() {
    WorkoutClothes workoutClothes = new WorkoutClothes();

    assertEquals(4, workoutClothes.solution(
        4, new int[]{4, 2}, new int[]{3, 5}));
  }

  @Test
  void exception() {
    WorkoutClothes workoutClothes = new WorkoutClothes();

    assertEquals(4, workoutClothes.solution(
        5, new int[]{1, 2, 4}, new int[]{2, 4, 5}));
  }
}
