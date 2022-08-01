import java.util.ArrayList;

public class MockTest {
  public ArrayList<Integer> solution(int[] answers) {
    ArrayList<Integer> answer = new ArrayList<>();

    int[] studentOne = new int[]{1, 2, 3, 4, 5};
    int[] studentTwo = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    int[] studentThree = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int answerCountOne = 0;
    int answerCountTwo = 0;
    int answerCountThree = 0;

    for (int i = 0; i < answers.length; i += 1) {
      if (answers[i] == studentOne[i % 5]) {
        answerCountOne += 1;
      }

      if (answers[i] == studentTwo[i % 8]) {
        answerCountTwo += 1;
      }

      if (answers[i] == studentThree[i % 10]) {
        answerCountThree += 1;
      }
    }
    int maximumNumber = Math.max(Math.max(
            answerCountOne, answerCountTwo),
        answerCountThree);

    if (maximumNumber == answerCountOne) {
      answer.add(1);
    }

    if (maximumNumber == answerCountTwo) {
      answer.add(2);
    }

    if (maximumNumber == answerCountThree) {
      answer.add(3);
    }

    return answer;
  }
}
