import java.util.Arrays;

public class WorkoutClothes {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;

    // 전체 학생 - 잃어버린 학생 수
    n -= lost.length;

    Arrays.sort(lost);
    Arrays.sort(reserve);

    // 잃어버린 학생 == 여별의 옷 가져온 학생 중복 처리
    for (int i = 0; i < lost.length; i += 1) {
      for (int j = 0; j < reserve.length; j += 1) {
        if (lost[i] == reserve[j]) {
          lost[i] = reserve[j] = -1;
          n += 1;
          break;
        }
      }
    }

    // 전체 학생 + 여벌의 체육복을 받은 학생 수
    for (int i = 0; i < lost.length; i += 1) {
      for (int j = 0; j < reserve.length; j += 1) {
        if (reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
          n += 1;
          reserve[j] = -1;
          break;
        }
      }
    }

    answer += n;
    return answer;
  }
}
