class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] ans = new int[2*nums.length];
       for(int j = 0; j<nums.length; j++){
        ans[j] = nums[j];
       }
       int i =0;
       int k = nums.length;
       while(k<2*nums.length){
        while(i<nums.length){
            ans[k]= nums[i];
            i++;
            k++;
        }
        
       }
       return ans;

        
    }
}
