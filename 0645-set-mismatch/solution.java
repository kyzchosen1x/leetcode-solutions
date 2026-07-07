class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int j=0;
        while(j<n){
            int correct = nums[j] -1;
            if(nums[j]!=nums[correct]){
                swap(nums, j, correct);
            }
            else{
                j++;
            }
        }
        
        int[] result = new int[2];
        for(int i =0; i<n; i++){
            int index = nums[i] -1;
            if(i!=index){
                result[0] = nums[i];
                result[1] = i+1;
            }
        }
      return result;  
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
