class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int evenIndex = 0;
        int oddIndex = count;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex++] = nums[i];
            } else {
                result[oddIndex++] = nums[i];
            }
        }

        return result;
    }
}
