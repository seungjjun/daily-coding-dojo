import java.util.ArrayList;
import java.util.List;

public class LineUp {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        List<Integer> list = new ArrayList<>();

        int listIndex = 0;
        long factorial = 1;

        for (int i = 1; i <= n; i += 1) {
            list.add(i);
            factorial *= i;
        }

        k -= 1;

        while (n > 0) {
            factorial /= n;
            int index = (int) (k / factorial);

            answer[listIndex] = list.get(index);
            list.remove(index);

            k %= factorial;

            listIndex += 1;
            n -= 1;
        }

        return answer;
    }
}
