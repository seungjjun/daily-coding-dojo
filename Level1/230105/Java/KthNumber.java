import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i += 1) {
            int[] copyArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

            Arrays.sort(copyArray);

            answer[i] = copyArray[commands[i][2] - 1];
        }

        return answer;
    }
}

/*
첫번째 풀이

        for (int i = 0; i < commands.length; i += 1) {
            List<Integer> slicedArray = new ArrayList<>();

            for (int j = commands[i][0]; j <= commands[i][1]; j += 1) {
                slicedArray.add(array[j - 1]);
            }

            Collections.sort(slicedArray);

            answer[i] = slicedArray.get(commands[i][2] - 1);
        }
 */