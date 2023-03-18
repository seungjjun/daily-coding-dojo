import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i += 1) {
            int number = scanner.nextInt();
            if(number == 0) {
                stack.pop();
                continue;
            }

            stack.push(number);
        }

        int count = 0;
        for (int i = 0; i < stack.size(); i += 1) {
            count += stack.get(i);
        }

        System.out.println(count);
    }
}
