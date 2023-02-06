public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        // Two pointers
        int[] answer = new int[2];

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if(sum == target) {
                answer[0] = start + 1;
                answer[1] = end + 1;
                break;
            }

            if(sum > target) {
                end -= 1;
                continue;
            }

            start += 1;
        }

        return answer;
    }
}

/*
time out
시간 복잡도 O(n2)
public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int end = numbers.length - 1;

        for (int i = 0; i < numbers.length; i += 1) {
            while (i < end) {
                if(numbers[i] + numbers[end] == target) {
                    answer[0] = i + 1;
                    answer[1] = end + 1;
                    break;
                }

                end -= 1;
            }

            end = numbers.length - 1;
        }

        return answer;
    }
 */
