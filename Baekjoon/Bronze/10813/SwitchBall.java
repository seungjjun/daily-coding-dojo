import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] numbers = new int[N + 1];

        for (int i = 1; i < numbers.length; i += 1) {
            numbers[i] = i;
        }

        for (int i = 0; i < M; i += 1) {
            int swap1 = scanner.nextInt();
            int swap2 = scanner.nextInt();

            swap(numbers, swap1, swap2);
        }

        for (int i = 1; i <= N; i += 1) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void swap(int[] numbers, int swap1, int swap2) {
        int temp = numbers[swap1];
        numbers[swap1] = numbers[swap2];
        numbers[swap2] = temp;
    }
}
