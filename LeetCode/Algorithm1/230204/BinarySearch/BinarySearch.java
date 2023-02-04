public class BinarySearch {
    public int search(int[] nums, int target) {
        // 시간복잡도 O(logN) -> 이진 탐색 풀이
        
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] > target) {
                right = mid - 1;
            }

            if(nums[mid] < target) {
                left = mid + 1;
            }
        }

        return -1;
    }
}

/*
시간 복잡도 O(N)
        int answer = -1;

        for(int i = 0; i < nums.length; i += 1) {
            if(nums[i] == target) {
                answer = i;
            }
        }

        return answer;
 */