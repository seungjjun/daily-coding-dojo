import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int N = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i += 1) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);

        for (int number: numbers) {
            stringBuilder.append(number).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
