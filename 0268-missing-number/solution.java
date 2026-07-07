class Solution {
    public int missingNumber(int[] nums) {
        int a = cyclicsort(nums);
        return a;
    }
    static int cyclicsort(int[] arr){
        int n = arr.length;
        int i =0;
        while(i<n){
            int index = arr[i];
            if(arr[i]<n && arr[index]!= arr[i] ){
                swap(arr, i, index);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<n; j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
