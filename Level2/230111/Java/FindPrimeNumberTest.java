import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumberTest {
    @Test
    void solution() {
        FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

        assertEquals(3, findPrimeNumber.solution("17"));
    }
}
