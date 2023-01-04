import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneBookTest {
    @Test
    void solution1() {
        PhoneBook phoneBook = new PhoneBook();

        assertFalse(phoneBook.solution(new String[]{"119", "97674223", "1195524421" }));
    }

    @Test
    void solution2() {
        PhoneBook phoneBook = new PhoneBook();

        assertTrue(phoneBook.solution(new String[]{"123","456","789"}));
    }
}
