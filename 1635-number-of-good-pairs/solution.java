class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int j =0; j<nums.length; j++){
            for(int k =j+1; k<nums.length; k++){
                if(nums[j]== nums[k]){
                    count ++;
                }
            }
        }
        return count;
        
    }
}
