public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pointer = 0;

        while (pointer <= right && left < right) {
            if (nums[pointer] == 0) {
                nums[pointer] = nums[left];
                nums[left] = 0;
                pointer += 1;
                left += 1;
                continue;
            }

            if (nums[pointer] == 2) {
                nums[pointer] = nums[right];
                nums[right] = 2;
                right -= 1;
                continue;
            }

            pointer += 1;
        }
    }
}
