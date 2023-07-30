import java.util.stream.IntStream;

public class FindDecimal {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(2, n).filter(this::isPrime).count();
    }

    private boolean isPrime(int number) {
        return IntStream.range(2, number).allMatch(i -> number % i != 0);
    }ㄴㅁ
}
