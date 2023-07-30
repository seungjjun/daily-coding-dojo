import java.util.Arrays;

public class Lotto {
  public int[] solution(int[] lottos, int[] win_nums) {
    int highestRanking = 0;
    int lowestRanking = 0;

    int highestRankingCount = 0;
    int lowestRankingCount = 0;

    for (int i = 0; i < lottos.length; i += 1) {
      if (lottos[i] == 0) {
        highestRankingCount += 1;
      }
      for (int j = 0; j < lottos.length; j += 1) {
        if (lottos[i] == win_nums[j]) {
          highestRankingCount += 1;
        }
      }
    }

    for (int i = 0; i < lottos.length; i += 1) {
      for (int j = 0; j < lottos.length; j += 1) {
        if (lottos[i] == win_nums[j]) {
          lowestRankingCount += 1;
        }
      }
    }

    switch (highestRankingCount) {
      case 6 -> highestRanking = 1;
      case 5 -> highestRanking = 2;
      case 4 -> highestRanking = 3;
      case 3 -> highestRanking = 4;
      case 2 -> highestRanking = 5;
      default -> highestRanking = 6;
    }

    switch (lowestRankingCount) {
      case 6 -> lowestRanking = 1;
      case 5 -> lowestRanking = 2;
      case 4 -> lowestRanking = 3;
      case 3 -> lowestRanking = 4;
      case 2 -> lowestRanking = 5;
      default -> lowestRanking = 6;
    }

    int[] answer = {highestRanking, lowestRanking};

    return answer;
  }
}
