import java.util.Stack;

public class RemovePair {
  public int solution(String s) {
    Stack<Character> stack = new Stack<>();

    for (char word : s.toCharArray()) {
      if(stack.isEmpty() || stack.peek() != word) {
        stack.add(word);
      }
      else {
        stack.pop();
      }
    }

    int answer = 0;

    if (stack.isEmpty()) {
      answer = 1;
    }
    return answer;
  }
}
