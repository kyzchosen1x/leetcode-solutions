class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counter = new int[nums.length];
        for(int j =0; j<nums.length;j++){
            int count = 0;
            for(int k = nums.length-1; k>=0 ; k--){
                if(j!=k && nums[j]>nums[k]){
                    count ++;
                }
            }
            counter[j] = count;
        }
        return counter;
        
    }
}
