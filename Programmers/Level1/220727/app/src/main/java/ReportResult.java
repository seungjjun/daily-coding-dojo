import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReportResult {
  public List<String> solution(String[] id_list, String[] report, int k) {
    int[] answer = {};
    String[] pairs = {};

    HashMap<String, String> reporterAndReported = new HashMap<>();

    List<String> reportedPerson = new ArrayList<>();

    for(int i = 0; i < report.length; i += 1) {
      pairs = report[i].split(" ");
      reporterAndReported.put(pairs[0], pairs[1]);
    }

    for(int i = 0; i < id_list.length; i += 1) {
      reportedPerson.add(reporterAndReported.get(id_list[i]));
    }

    return reportedPerson;
  }
}
