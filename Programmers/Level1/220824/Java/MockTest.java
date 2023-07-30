// 1번 수포자 : 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
// 2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5 ...
// 3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1 ...

public class MockTest {
  public int[] solution(int[] answers) {
    int[] answer = {};

    int[] firstAnswers = new int[]{1, 2, 3, 4, 5}; // 5
    int[] secondAnswers = new int[]{2, 1, 2, 3, 2, 4, 2, 5}; // 8
    int[] thirdAnswers = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10

    int firstCount = gradingFirstAnswers(answers, firstAnswers);
    int secondCount = gradingSecondAnswers(answers, secondAnswers);
    int thirdCount = gradingThirdAnswers(answers, thirdAnswers);


    if (firstCount > secondCount && firstCount > thirdCount) {
      return new int[]{1};
    }
    if (secondCount > firstCount && secondCount > thirdCount) {
      return new int[]{2};
    }
    if (thirdCount > secondCount && thirdCount > firstCount) {
      return new int[]{3};
    }

    if (firstCount == secondCount && firstCount > thirdCount) {
      return new int[]{1, 2};
    }

    if (firstCount == thirdCount && firstCount > secondCount) {
      return new int[]{1, 3};
    }

    if (secondCount == thirdCount && secondCount > firstCount) {
      return new int[]{2, 3};
    }

    if (firstCount == secondCount && firstCount == thirdCount) {
      return new int[]{1, 2, 3};
    }

    return answer;
  }


  public int gradingFirstAnswers(int[] answers, int[] firstAnswers) {
    int firstCount = 0;
    for (int i = 0; i < answers.length; i += 1) {
      if (firstAnswers[i % 5] == answers[i]) {
        firstCount += 1;
      }
    }
    return firstCount;
  }

  public int gradingSecondAnswers(int[] answers, int[] secondAnswers) {
    int secoundCount = 0;
    for (int i = 0; i < answers.length; i += 1) {
      if (secondAnswers[i % 8] == answers[i]) {
        secoundCount += 1;
      }
    }
    return secoundCount;
  }

  public int gradingThirdAnswers(int[] answers, int[] thirdAnswers) {
    int thirdCount = 0;
    for (int i = 0; i < answers.length; i += 1) {
      if (thirdAnswers[i % 10] == answers[i]) {
        thirdCount += 1;
      }
    }
    return thirdCount;
  }
}
