import java.util.Scanner;

public class LandGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            System.out.println("*".repeat(i));
        }
    }
}
