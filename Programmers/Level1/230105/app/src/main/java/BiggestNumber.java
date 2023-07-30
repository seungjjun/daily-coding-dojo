import java.util.Arrays;
import java.util.Collections;

public class BiggestNumber {
    public String solution(int[] numbers) {
        String answer = "";

        String[] newNumber = new String[numbers.length];

        for(int i = 0; i < numbers.length; i += 1) {
            if(numbers[i] >= 10 && numbers[i] < 100) {
                newNumber[i] = String.valueOf((double) numbers[i] / 10);
                continue;
            }

            if(numbers[i] >= 100 && numbers[i] < 1000) {
                newNumber[i] = String.valueOf((double) numbers[i] / 100);
                continue;
            }

            newNumber[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(newNumber, Collections.reverseOrder());

        for (int i = 0; i < newNumber.length; i += 1) {
            answer += newNumber[i];
        }

        return answer.replaceAll("\\.", "");
    }
}
