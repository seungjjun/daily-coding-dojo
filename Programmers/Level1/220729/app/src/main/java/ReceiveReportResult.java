public class ReceiveReportResult {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];

    boolean[][] isMatchReporting = new boolean[id_list.length][id_list.length];
    int[] count = new int[id_list.length];

    for (int i = 0; i < report.length; i += 1) {
      int reporterIndex = indexNumber(id_list, report[i].split(" ")[0]);
      int reportedIndex = indexNumber(id_list, report[i].split(" ")[1]);

      isMatchReporting[reporterIndex][reportedIndex] = true;
    }

    for (int i = 0; i < id_list.length; i += 1) {
      for (int j = 0; j < id_list.length; j += 1) {
        if (isMatchReporting[i][j] == true) {
          count[j] += 1;
        }
      }
    }

    for (int i = 0; i < id_list.length; i += 1) {
      if (count[i] >= k) {
        for (int j = 0; j < id_list.length; j += 1) {
          if (isMatchReporting[j][i] == true) {
            answer[j] += 1;
          }
        }
      }
    }

    return answer;
  }

  private static int indexNumber(String[] id_list, String name) {
    for (int i = 0; i < id_list.length; i += 1) {
      if (id_list[i].equals(name)) {
        return i;
      }
    }
    return -1;
  }
}
