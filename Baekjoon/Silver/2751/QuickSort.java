import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i += 1) {
            numbers[i] = scanner.nextInt();
        }

        quickSort(numbers, 0, N - 1);
        for (int i = 0; i < N; i += 1) {
            System.out.println(numbers[i]);
        }
    }

    private static void quickSort(int[] numbers, int left, int right) {
        if(left >= right) {
            return;
        }

        int pivot = numbers[(left + right) / 2];
        int i = left - 1;
        int j = right + 1;

        while (i < j) {
            i += 1;
            while (numbers[i] < pivot) {
                i += 1;
            }

            j -= 1;
            while (numbers[j] > pivot) {
                j -= 1;
            }

            if(i >= j) {
                break;
            }

            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        quickSort(numbers, left, j);
        quickSort(numbers, j + 1, right);
    }
}
