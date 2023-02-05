public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        int index = nums.length - 1;

        while (start <= end) {
            if (Math.abs(nums[start]) <= Math.abs(nums[end])) {
                result[index] = (int) Math.pow(nums[end], 2);

                end -= 1;
                index -= 1;
                continue;
            }

            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[index] = (int) Math.pow(nums[start], 2);

                start += 1;
                index -= 1;
            }
        }

        return result;
    }
}


/*
Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

- Sort를 이용한 풀이

public int[] sortedSquares(int[] nums) {
    for(int i = 0; i < nums.length; i += 1) {
        nums[i] = (int) Math.pow(nums[i], 2);
    }

    Arrays.sort(nums);

    return nums;
}
 */