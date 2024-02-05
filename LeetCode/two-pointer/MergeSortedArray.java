import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = 0;
        int point2 = 0;

        List<Integer> answers = new ArrayList<>();

        while (point1 < m && point2 < n) {
            if (nums1[point1] < nums2[point2]) {
                answers.add(nums1[point1]);
                point1 += 1;
            }

            if (nums1[point1] >= nums2[point2]) {
                answers.add(nums2[point2]);
                point2 += 1;
            }
        }

        while (point1 < m) {
            answers.add(nums1[point1]);
            point1 += 1;
        }
        while (point2 < n) {
            answers.add(nums2[point2]);
            point2 += 1;
        }

        for (int i = 0; i < nums1.length; i += 1) {
            nums1[i] = answers.get(i);
        }
    }
}
