import org.junit.jupiter.api.Test;

class MoveZeroesTest {
    @Test
    void solution() {
        MoveZeroes moveZeroes = new MoveZeroes();

        moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes.moveZeroes(new int[]{2, 1});
    }
}
