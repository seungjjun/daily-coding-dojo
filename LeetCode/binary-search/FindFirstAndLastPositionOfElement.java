package com.study.springadvanced;

public class FindFirstAndLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        int x = -1;
        int y = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == nums[mid]) {
                x = mid;
                right = mid - 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == nums[mid]) {
                y = mid;
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        return new int[]{x, y};
    }
}
