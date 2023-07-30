import java.util.HashMap;
import java.util.Map;

public class UnFinishedRunner {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hashMap = new HashMap<>();

        for (String runner : participant) {
            hashMap.put(runner, hashMap.getOrDefault(runner, 0) + 1);
        }

        for (String finishedRunner : completion) {
            hashMap.put(finishedRunner, hashMap.get(finishedRunner) - 1);
        }

        for (String unFinishedRunner : hashMap.keySet()) {
            if (hashMap.get(unFinishedRunner) != 0) {
                return unFinishedRunner;
            }
        }

        return "";
    }
}
