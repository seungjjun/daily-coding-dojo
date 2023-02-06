public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointer = 0;

        for (int i = 0; i < nums.length; i += 1) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;

                pointer += 1;
            }
        }
    }
}
