import java.util.Stack;

public class FindBigNumber {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i += 1) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        for (int index : stack) {
            answer[index] = -1;
        }

        return answer;
    }
}
