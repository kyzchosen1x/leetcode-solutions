class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] ans = new int[nums.length];
        for(int j = 0; j< nums.length; j++){
            sum += nums[j];
            ans[j] = sum;
        }
        return ans;
        
    }
}
