class Solution {
    public int maximumProduct(int[] nums) {
        insertionsort(nums);
        int n = nums.length;
        int answer =Integer.MIN_VALUE;
        int i = n-1;
        int multiply = nums[i]*nums[i-1]*nums[i-2];
        int j = 0;
        answer = nums[j]*nums[j+1]*nums[j+n-1];

            
        if(multiply>answer){
            answer = multiply;
        }
       
       return answer;
    }
    static void insertionsort(int[] arr){
        int n = arr.length;
        for(int i =0; i<=n-2; i++){
            for(int j = i+1; j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

}
