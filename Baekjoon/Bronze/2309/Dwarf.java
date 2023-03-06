import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    static boolean[] find = new boolean[9];
    static int[] dwarfs = new int[9];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i += 1) {
            dwarfs[i] = scanner.nextInt();
        }

        Arrays.sort(dwarfs);

        dfs(0, 0, 0);

        for (int i = 0; i < 9; i += 1) {
            if (find[i]) {
                System.out.println(dwarfs[i]);
            }
        }

    }

    public static boolean dfs(int idx, int count, int sum) {
        if (sum > 100) {
            return false;
        }
        if (count == 7 && sum == 100) {
            return true;
        }

        for (int i = idx; i < 9; i += 1) {
            find[i] = true;

            if (dfs(i + 1, count + 1, sum + dwarfs[i])) {
                return true;
            }
            find[i] = false;
        }

        return false;
    }
}
