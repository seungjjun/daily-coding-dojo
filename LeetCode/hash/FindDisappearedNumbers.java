import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answers = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i += 1) {
            Integer value = map.getOrDefault(i, 0);
            if (value == 0) {
                answers.add(i);
            }
        }

        return answers;
    }
}
