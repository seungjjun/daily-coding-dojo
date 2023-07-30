import java.util.Stack;

public class Shiritori {
  public int[] solution(int n, String[] words) {
    int[] answer = new int[2];
    Stack<String> stack = new Stack<>();

    boolean isKeep = true;

    int step = 0;
    int turn = 1;
    int index = 0;

    while (isKeep) {
      if(index >= words.length) {
        isKeep = false;
        break;
      }

      if (index % n == 0) {
        step += 1;
        turn = 1;
      }

      if(stack.contains(words[index])) {
        break;
      }

      if (index > 0) {
        if (words[index - 1].charAt(words[index - 1].length() - 1)
            != words[index].charAt(0)) {
          break;
        }
      }

      stack.push(words[index]);

      index += 1;
      turn += 1;
    }

    if (!isKeep) {
      answer[0] = 0;
      answer[1] = 0;
    }

    if(isKeep) {
      answer[0] = turn;
      answer[1] = step;
    }

    return answer;
  }
}
