import java.util.Arrays;
import java.util.Scanner;

public class RepresentativeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[5];

        for (int i = 0; i < values.length; i += 1) {
            values[i] = scanner.nextInt();
        }

        Arrays.sort(values);

        int sum = 0;
        for (int i = 0; i < values.length; i += 1) {
            sum += values[i];
        }

        System.out.println(sum / 5);
        System.out.println(values[2]);
    }
}
