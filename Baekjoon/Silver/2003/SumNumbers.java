import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i += 1) {
            array[i] = scanner.nextInt();
        }

        int start = 0;
        int end = 0;
        int answer = 0;
        int sum = array[start];

        while (start <= array.length - 1) {
            if (sum == M) {
                answer += 1;
                start += 1;
                if (start == array.length) {
                    break;
                }
                end = start;
                sum = array[start];
                continue;
            }

            if (sum > M) {
                sum -= array[start];
                start += 1;
                if (start == end && end < array.length - 1 && sum != M) {
                    end += 1;
                    sum += array[end];
                }
                continue;
            }

            if (sum < M) {
                end += 1;
                if (end == array.length) {
                    break;
                }
                sum += array[end];
            }
        }

        System.out.println(answer);
    }
}

