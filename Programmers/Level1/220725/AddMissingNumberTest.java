import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddMissingNumberTest {
  private void assertArrayEquals(int[] ints, List<Integer> solution) {
  }

  @Test
  void missingNumber() {
    AddMissingNumber addMissingNumber = new AddMissingNumber();

    List<Integer> number = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    assertArrayEquals(new int[]{5,9}, addMissingNumber.findMissingNumber(
        new int[]{1,2,3,4,6,7,8,0},
        number));
  }

  @Test
  void addMissingNumber() {
    AddMissingNumber addMissingNumber = new AddMissingNumber();

    assertEquals(14, addMissingNumber.solution(new int[]{1,2,3,4,6,7,8,0}));
    assertEquals(6, addMissingNumber.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
  }
}
