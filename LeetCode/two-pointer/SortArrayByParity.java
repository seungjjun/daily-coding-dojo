public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                continue;
            }

            if (nums[left] % 2 == 0) {
                left += 1;
                continue;
            }

            if (nums[right] % 2 != 0) {
                right -= 1;
            }
        }

        return nums;
    }
}
