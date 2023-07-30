public class MatrixAddition {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int column = arr1.length;
    int row = arr1[0].length;

    int[][] answer = new int[column][row];

    for(int i = 0; i < column; i += 1) {
      for (int j = 0; j < row; j += 1) {
        answer[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    return answer;
  }
}
