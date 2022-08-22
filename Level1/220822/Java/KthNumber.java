import java.util.Arrays;

public class KthNumber {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i += 1) {
      int[] slicingArray = slice(array, commands[i]);

      Arrays.sort(slicingArray);

      answer[i] = slicingArray[commands[i][2] - 1];
    }

    return answer;
  }

  public int[] slice(int[] array, int[] commands) {
    int[] slicingArray;
    int startIndex = commands[0];
    int endIndex = commands[1];

    slicingArray = Arrays.copyOfRange(array, startIndex - 1, endIndex);
    return slicingArray;
  }
}
