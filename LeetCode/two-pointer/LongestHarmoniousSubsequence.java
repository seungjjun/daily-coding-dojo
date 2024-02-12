import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = 1;
        int maxLength = 0;
        int length = 0;

        while (right < nums.length) {
            int diffNumber = nums[right] - nums[left];

            while (diffNumber > 1 && right > left) {
                left += 1;
                diffNumber = nums[right] - nums[left];
            }

            if (nums[right] != nums[left]) {
                length = right - left + 1;
            }

            maxLength = Math.max(maxLength, length);
            right += 1;
        }

        return maxLength;
    }
}
