public class Lotto {
  public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer;

    int highestRankCount = hopeRaffle(lottos, win_nums);
    int lowestRankCount = despairRaffle(lottos, win_nums);

    answer = rank(highestRankCount, lowestRankCount);

    return answer;
  }

  public int hopeRaffle(int[] lottos, int[] win_nums) {
    int rankCount = 0;

    for (int i = 0; i < lottos.length; i += 1) {
      for (int j = 0; j < win_nums.length; j += 1) {
        if (lottos[i] == 0) {
          rankCount += 1;
          break;
        }

        if (lottos[i] == win_nums[j]) {
          rankCount += 1;
        }
      }
    }
    return rankCount;
  }

  public int despairRaffle(int[] lottos, int[] win_nums) {
    int rankCount = 0;

    for (int i = 0; i < lottos.length; i += 1) {
      for (int j = 0; j < win_nums.length; j += 1) {
        if (lottos[i] == win_nums[j]) {
          rankCount += 1;
        }
      }
    }

    return rankCount;
  }

  public int[] rank(int highestRankCount, int lowestRankCount) {
    int rank[] = new int[2];

    switch (highestRankCount) {
      case 6 -> rank[0] = 1;
      case 5 -> rank[0] = 2;
      case 4 -> rank[0] = 3;
      case 3 -> rank[0] = 4;
      case 2 -> rank[0] = 5;
      default -> rank[0] = 6;
    }

    switch (lowestRankCount) {
      case 6 -> rank[1] = 1;
      case 5 -> rank[1] = 2;
      case 4 -> rank[1] = 3;
      case 3 -> rank[1] = 4;
      case 2 -> rank[1] = 5;
      default -> rank[1] = 6;
    }

    return rank;
  }
}
