// 신고 횟수에 제한 x 서로 다른 유저를 계속해서 신고할 수 있다.
// 한 유저를 여러번 신고 가능 -> 동일한 유저에 대한 신고는 1회로 처리
// k번 이상 신고된 유저는 정지되고 정지 사실을 해당 유저를 신고한 사람에게 모두 발송

// 구해야 하는 것 -> 정지된 결과 메일 받은 횟수를 담은 배열

// HashMap -> key : 신고한 사람, value : 신고받은사람(중복 x)(HashSet)

import java.util.HashMap;
import java.util.HashSet;

public class ReportResult {
  public int[] solution(String[] id_List, String[] reports, int k) {
    int[] answer = new int[id_List.length];

    HashMap<String, HashSet<String>> reportMap = removeSameReporter(reports);

    HashMap<String, HashSet<String>> resultMap = removeSameReportee(reports);

    for(int i = 0; i < answer.length; i += 1) {
      String user = id_List[i];

      if(!reportMap.containsKey(user)) {
        continue;
      }

      for (String banUser : reportMap.get(user)) {
        if (resultMap.get(banUser).size() >= k) {
          answer[i] += 1;
        }
      }
    }

    return answer;
  }

  public HashMap<String, HashSet<String>> removeSameReporter(String[] reports) {
    HashMap<String, HashSet<String>> reportMap = new HashMap<>();

    for(String report : reports) {
      String[] list = report.split(" ");

      if (!reportMap.containsKey(list[0])) {
        reportMap.put(list[0], new HashSet<>());
      }
      reportMap.get(list[0]).add(list[1]);
    }

    return reportMap;
  }

  public HashMap<String, HashSet<String>> removeSameReportee(String[] reports) {
    HashMap<String, HashSet<String>> resultMap = new HashMap<>();

    for(String report : reports) {
      String[] list = report.split(" ");

      if(!resultMap.containsKey(list[1])) {
        resultMap.put(list[1], new HashSet<>());
      }
      resultMap.get(list[1]).add(list[0]);
    }
    return resultMap;
  }
}
