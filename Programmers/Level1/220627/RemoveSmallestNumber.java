public class RemoveSmallestNumber {
  public int[] solution(int[] numberArray) {
    int[] answer = {};

    int smallestNumber = numberArray[0];

    for (int i = 0; i < numberArray.length; i += 1) {
      if (numberArray[i] < smallestNumber) {
        smallestNumber = numberArray[i];
      }
    }

    answer = new int[numberArray.length - 1];

    int count = 0;
    for (int i = 0; i < numberArray.length; i += 1) {
      if (numberArray[i] != smallestNumber) {
        answer[count] = numberArray[i];
        count += 1;
      }
    }


    if (numberArray.length <= 1) {
      answer = new int[numberArray.length];
      answer[0] = -1;
    }

    return answer;
  }
}
