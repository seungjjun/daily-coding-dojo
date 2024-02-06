import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> answers = new HashSet<>();

        int left = 0;
        int right = 0;

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                answers.add(nums1[left]);
                left += 1;
                right += 1;
                continue;
            }

            if (nums1[left] > nums2[right]) {
                right += 1;
                continue;
            }

            if (nums1[left] < nums2[right]) {
                left += 1;
            }
        }

        return answers.stream().mapToInt(number -> number).toArray();
    }
}
