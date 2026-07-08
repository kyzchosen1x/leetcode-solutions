class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        Arrays.sort(nums);
        int n = nums.length;
        int count =1;
        for(int i =0; i<n-1 ; i++){
            if(nums[i]==nums[i+1]){
                count++;
                answer = true;
                break;
            }
        }
      return answer;  
    }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
    static void insertionsort(int [] arr){
        int n = arr.length;
        for(int i =0; i<=n-2; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
}
