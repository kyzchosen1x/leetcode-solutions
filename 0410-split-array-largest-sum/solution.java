class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        for(int i =1; i<n ; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int answer =0;
        int start = max ;
        int sum =0;
        for(int i =0; i<n; i++){
            sum+= nums[i];
        }
        int end = sum;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(ispossible(nums, k, mid)){
                answer = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return answer;
    }
    static boolean ispossible(int [ ] nums, int k, int mid){
        int j =1;
        int sum1=0;
        for(int i =0; i<nums.length; i++){
            if (sum1 + nums[i] <= mid) {
                    sum1 += nums[i];
                } else {
                    j++;
                    sum1 = nums[i];
                }
            }
            return j<=k;
        
    }
}
