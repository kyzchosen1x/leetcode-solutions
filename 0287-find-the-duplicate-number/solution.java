class Solution {
    public int findDuplicate(int[] nums) {
        int i =0;
        int y = nums.length;
        int n = nums.length-1;
        int answer =0;
        while(i<n+1){
        int index = nums[i] - 1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[index]){
            swap(nums, i, index);
            }
            else{
                answer =nums[i];
                i++;
            }
        }
        return answer;
        
    
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
