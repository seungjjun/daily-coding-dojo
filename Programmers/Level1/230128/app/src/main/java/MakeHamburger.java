import java.util.Stack;

public class MakeHamburger {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> hamburgerStack = new Stack<>();

        for (int i = 0; i < ingredient.length; i += 1) {
            hamburgerStack.push(ingredient[i]);

            if(hamburgerStack.size() > 3) {
                if(hamburgerStack.get(hamburgerStack.size() - 1) == 1
                && hamburgerStack.get(hamburgerStack.size() - 2) == 3
                && hamburgerStack.get(hamburgerStack.size() - 3) == 2
                && hamburgerStack.get(hamburgerStack.size() - 4) == 1) {
                    answer += 1;

                    hamburgerStack.pop();
                    hamburgerStack.pop();
                    hamburgerStack.pop();
                    hamburgerStack.pop();
                }
            }
        }

        return answer;
    }
}
