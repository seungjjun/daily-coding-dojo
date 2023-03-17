import java.util.Scanner;

public class KthNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i += 1) {
            numbers[i] = scanner.nextInt();
        }

        quickSort(numbers, 0, N - 1);
        System.out.println(numbers[K - 1]);
    }

    private static void quickSort(int[] numbers, int left, int right) {
        if(left >= right) {
            return;
        }

        int pivotIndex = getPivotIndex(numbers, left, right);
        int pivot = numbers[pivotIndex];
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

    private static int getPivotIndex(int[] numbers, int left, int right) {
        int mid = (left + right) / 2;

        if (numbers[left] > numbers[mid]) {
            int temp = numbers[left];
            numbers[left] = numbers[mid];
            numbers[mid] = temp;
        }

        if (numbers[mid] > numbers[right]) {
            int temp = numbers[mid];
            numbers[mid] = numbers[right];
            numbers[right] = temp;

            if (numbers[left] > numbers[mid]) {
                temp = numbers[left];
                numbers[left] = numbers[mid];
                numbers[mid] = temp;
            }
        }

        return mid;
    }
}
