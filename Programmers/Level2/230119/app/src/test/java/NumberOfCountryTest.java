import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfCountryTest {
    @Test
    void solution1() {
        NumberOfCountry numberOfCountry = new NumberOfCountry();

        assertEquals("11", numberOfCountry.solution(4));
    }

    @Test
    void solution2() {
        NumberOfCountry numberOfCountry = new NumberOfCountry();

        assertEquals("21", numberOfCountry.solution(7));
    }

    @Test
    void solution3() {
        NumberOfCountry numberOfCountry = new NumberOfCountry();

        assertEquals("41", numberOfCountry.solution(10));
    }

    @Test
    void solution4() {
        NumberOfCountry numberOfCountry = new NumberOfCountry();

        assertEquals("112", numberOfCountry.solution(14));
    }

    @Test
    void solution5() {
        NumberOfCountry numberOfCountry = new NumberOfCountry();

        assertEquals("114", numberOfCountry.solution(15));
    }
}
