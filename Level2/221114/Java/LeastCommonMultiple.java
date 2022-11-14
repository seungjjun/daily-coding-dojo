import java.util.Arrays;

public class LeastCommonMultiple {
    public int solution(int[] arr) {
        int[] sortedNumbers = sort(arr);

        int leastCommonMultiple = sortedNumbers[0];

        for (int i = 1; i < sortedNumbers.length; i += 1) {
            int maxNumber = 0;

            if (leastCommonMultiple >= sortedNumbers[i]) {
                maxNumber = leastCommonMultiple;
            }

            if (leastCommonMultiple < sortedNumbers[i]) {
                maxNumber = sortedNumbers[i];
            }

            for (int j = maxNumber; j >= maxNumber; j += 1) {
                if (j % leastCommonMultiple == 0 && j % sortedNumbers[i] == 0) {
                    leastCommonMultiple = j;
                    break;
                }
            }
        }

        return leastCommonMultiple;
    }

    public int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
