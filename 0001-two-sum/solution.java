class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    sol[0] = i;
                    sol[1] = k;
                    return sol;
                }
            }
        }

        return sol;
    }
}
