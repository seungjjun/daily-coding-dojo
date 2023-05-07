import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        Map<Integer, Integer> numbersA = new HashMap<>();
        Map<Integer, Integer> numbersB = new HashMap<>();

        for (int i = 0; i < A; i += 1) {
            int number = scanner.nextInt();
            numbersA.put(number, number);
        }

        for (int i = 0; i < B; i += 1) {
            int number = scanner.nextInt();
            numbersB.put(number, number);
        }

        int answer = numbersA.size() + numbersB.size();

        for (Integer number : numbersA.values()) {
            if (numbersB.containsKey(number)) {
                answer -= 1;
            }
        }

        for (Integer number : numbersB.values()) {
            if (numbersA.containsKey(number)) {
                answer -= 1;
            }
        }

        System.out.println(answer);
    }
}
