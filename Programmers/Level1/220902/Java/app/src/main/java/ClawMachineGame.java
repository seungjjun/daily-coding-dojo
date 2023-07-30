import java.util.LinkedList;

public class ClawMachineGame {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    LinkedList<Integer> dolls = new LinkedList<>();

    for (int i = 0; i < moves.length; i += 1) {
      for (int j = 0; j < board.length; j += 1) {
        if (dolls.size() > 0) {
          if (board[j][moves[i] - 1] == dolls.get(0)) {
            answer += 2;
            board[j][moves[i] - 1] = 0;
            dolls.pop();
            break;
          }
        }

        if (board[j][moves[i] - 1] != 0) {
          dolls.push(board[j][moves[i] - 1]);
          board[j][moves[i] - 1] = 0;
          break;
        }
      }
    }

    return answer;
  }
}
