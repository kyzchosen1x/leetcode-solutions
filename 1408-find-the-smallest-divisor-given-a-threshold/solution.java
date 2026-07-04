class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int i =1; i<nums.length; i++){
                if(max<nums[i]){
                    max = nums[i];
                }
        }
        int start =1;
        int end = max;
        int answer =0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isless(nums, threshold, mid)){
                answer = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return answer;
    }
    static boolean isless(int [] nums, int jap, int mid){
        int div;
        int sum =0;
        for(int i=0; i<nums.length; i++){
            div = Math.ceilDiv(nums[i],mid);
            sum+= div;
        }
        return sum<=jap;
    }
}
