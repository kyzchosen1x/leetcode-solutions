class Solution {
    public int searchInsert(int[] nums, int target) {
        int index  =0;
        int min= target;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==target){
                index =i;
                break;
            }
            else if(nums[i]>min){
                index =i;
                break;
            }
            else if(min>nums[i]){
                index = nums.length;
            }
        }
        return index;
        
    }
}
