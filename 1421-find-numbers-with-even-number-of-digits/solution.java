class Solution {
    public int findNumbers(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            int count =0;
            int digits = nums[i];
            while(digits>0){
                digits = digits/10;
                count++;
            }
            if(count%2==0){
                sum++;
            }
        }
        return sum;
        
    }
}
