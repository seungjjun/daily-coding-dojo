import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeTest {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < survey.length; i += 1) {
            if (choices[i] < 4) {
                result.put(survey[i].charAt(0), result.getOrDefault(survey[i].charAt(0), 0) + (4 - choices[i]));
            }

            if (choices[i] > 4) {
                result.put(survey[i].charAt(1), result.getOrDefault(survey[i].charAt(1), 0) + (choices[i] - 4));
            }
        }

        answer = getPersonalityType('R', 'T', answer, result);
        answer = getPersonalityType('C', 'F', answer, result);
        answer = getPersonalityType('J', 'M', answer, result);
        answer = getPersonalityType('A', 'N', answer, result);

        return answer;
    }

    private String getPersonalityType(Character type1, Character type2, String answer, Map<Character, Integer> result) {
        if (result.getOrDefault(type1, 0) >= result.getOrDefault(type2, 0)) {
            answer += type1;
        } else {
            answer += type2;
        }
        return answer;
    }
}
