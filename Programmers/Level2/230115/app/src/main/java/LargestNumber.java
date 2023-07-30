import java.util.Arrays;

public class LargestNumber {
    public String solution(int[] numbers) {
        String answer = "";

        String[] stringNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i += 1) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(stringNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for(String number : stringNumbers) {
            answer += number;
        }

        if(answer.startsWith("0")) {
            return "0";
        }


        return answer;
    }
}
