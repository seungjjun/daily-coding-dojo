import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void solution() {
        BinarySearch binarySearch = new BinarySearch();

        assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
