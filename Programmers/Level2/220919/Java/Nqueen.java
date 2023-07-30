import java.util.Arrays;

public class Nqueen {
  public int solution(int n) {
    int answer = 0;

    int[] board = makeBoard(n);
    for(int i = 0; i < n; i += 1) {
      board[0] = i;

      answer += putQueen(board, n, 1);
    }

    return answer;
  }

  public int putQueen(int[] board, int n, int row) {
    if(row == n) {
      return 1;
    }

    int count = 0;

    for(int column = 0; column < n; column += 1) {
      boolean isPut = true;
      for(int i = 0; i < row; i += 1) {
        if(column == board[i] || row - i == Math.abs(column - board[i])) {
          isPut = false;
          break;
        }
      }

      if(isPut) {
        board[row] = column;
        count += putQueen(board, n, row + 1);
      }
    }

    return count;
  }

  public int[] makeBoard(int n) {
    int[] board = new int[n];

    for(int i = 0; i < n; i +=1 ){
      Arrays.fill(board, -1);
    }
    return board;
  }
}
