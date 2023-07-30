import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Numberpairs {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        String[] xNumbers = X.split("");
        String[] yNumbers = Y.split("");

        Map<String, Integer> xMap = new HashMap<>();
        List<String> numbers = new ArrayList<>();

        for (String number: xNumbers) {
            xMap.put(number, xMap.getOrDefault(number, 0) + 1);
        }

        for (String yNumber : yNumbers) {
            if (xMap.containsKey(yNumber)) {
                numbers.add(yNumber);

                if (xMap.get(yNumber) > 1) {
                    xMap.replace(yNumber, xMap.get(yNumber) - 1);
                    continue;
                }

                xMap.remove(yNumber);
            }
        }

        if (numbers.isEmpty()) {
            return "-1";
        }

        Collections.sort(numbers);

        for (int i = numbers.size() - 1; i >= 0; i -= 1) {
            if (i == numbers.size() - 1 && numbers.get(i).equals("0")) {
                return "0";
            }
            answer.append(numbers.get(i));
        }

        return answer.toString();
    }
}