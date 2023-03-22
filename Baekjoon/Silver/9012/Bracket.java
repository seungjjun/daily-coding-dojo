import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < T; i += 1) {
            String bracket = scanner.next();
            char[] bracketChar =  bracket.toCharArray();

            for (int j = 0; j < bracketChar.length; j += 1) {
                stack.add(bracketChar[j]);
            }

            int count = 0;
            while (!stack.isEmpty()) {
                if(stack.peek() == '(' && count == 0) {
                    System.out.println("NO");
                    stack.clear();
                    break;
                }

                if(stack.peek() == ')') {
                    stack.pop();
                    count += 1;
                    continue;
                }

                if (stack.peek() == '(') {
                    stack.pop();
                    count -= 1;
                }

                if (count == 0 && stack.isEmpty()) {
                    System.out.println("YES");
                }
            }

            if (count != 0) {
                System.out.println("NO");
            }
        }
    }
}
