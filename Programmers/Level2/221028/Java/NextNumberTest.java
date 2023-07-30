import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextNumberTest {
  @Test
  void oneLength() {
    NextNumber nextNumber = new NextNumber();

    assertEquals(4, nextNumber.compute("1010011", '1'));
  }

  @Test
  void nextBinary() {
    NextNumber nextNumber = new NextNumber();

    assertEquals(83, nextNumber.nextBinary(78));
  }

  @Test
  void solution() {
    NextNumber nextNumber = new NextNumber();

    assertEquals(23, nextNumber.nextBinary(15));
  }
}
