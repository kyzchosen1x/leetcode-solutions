class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        bubble(nums);
        int max =nums[0];
        for(int i =1; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0; i<n; i++){
            if(!result.contains(nums[i])){
                result.add(nums[i]);
                }
            }
        
        int answer =0;
        if(result.size()<3){
            answer = max;
        }
    
        else{
            int element =result.size() - 1 -2;
            answer =result.get(element);
        }
        return answer;
    }
    static void bubble(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            boolean swap = false;
            for(int j=1; j<n; j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    static void swap(int[]arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
