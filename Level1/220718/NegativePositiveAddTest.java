import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativePositiveAddTest {
  @Test
  void plus(){
   NegativePositiveAdd negativePositiveAdd = new NegativePositiveAdd();

   assertEquals(23, negativePositiveAdd.solution(
       new int[]{4,7,12}, new boolean[]{true,false,true}));
  }

  @Test
  void solution() {
    NegativePositiveAdd negativePositiveAdd = new NegativePositiveAdd();

    assertEquals(9, negativePositiveAdd.solution(
        new int[]{4,7,12}, new boolean[]{true,false,true}));

    assertEquals(0, negativePositiveAdd.solution(
        new int[]{1,2,3}, new boolean[]{false,false,true}));
  }
}
