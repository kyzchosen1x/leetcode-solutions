class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;
        int answer = 0;
        while(i<n){
            if(nums[i]>0 && nums[i]<=n ){
                int index = nums[i] - 1;
                if( nums[i]!=nums[index]){
                swap(nums, i , index);
            }
            else{
                i++;
            }
            }
            else{
                i++;
            }
        }
        int min = 0;
        for(int j=0; j<n; j++ ){
            int in = j+ 1;
            if(nums[j] != in ){
                return in;
                
            }
        }
        return n+1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
