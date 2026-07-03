import java.util.Arrays;

class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD = 1_000_000_007;

        int[] sorted = nums1.clone();
        Arrays.sort(sorted);

        long total = 0;
        int bestReduction = 0;

        for (int i = 0; i < nums1.length; i++) {

            int original = Math.abs(nums1[i] - nums2[i]);
            total += original;

            int pos = Arrays.binarySearch(sorted, nums2[i]);

            if (pos < 0) {
                pos = -(pos + 1);   // insertion point
            }

            if (pos < sorted.length) {
                int newDiff = Math.abs(sorted[pos] - nums2[i]);
                bestReduction = Math.max(bestReduction, original - newDiff);
            }

            if (pos > 0) {
                int newDiff = Math.abs(sorted[pos - 1] - nums2[i]);
                bestReduction = Math.max(bestReduction, original - newDiff);
            }
        }

        return (int) ((total - bestReduction) % MOD);
    }
}
