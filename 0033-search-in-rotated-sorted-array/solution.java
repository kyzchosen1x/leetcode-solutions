class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int k = 0;
        int output = -1;
        int[] result = new int[n];

        // Find rotation point
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                k = i;
                break;
            }
        }

        // Left rotate
        for (int i = k; i < n; i++) {
            result[i - k] = nums[i];
        }

        for (int j = 0; j < k; j++) {
            result[j + n - k] = nums[j];
        }

        // Search
        for (int i = 0; i < n; i++) {
            if (result[i] == target) {
                output = (i + k) % n;   // Convert back to original index
                break;
            }
        }

        return output;
    }
}
