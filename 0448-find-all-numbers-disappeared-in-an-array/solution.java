class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        

        int n = nums.length;
        int i =0;
        while(i<n){
            int index = nums[i] -1;
            if(nums[index]!= nums[i] ){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }
       ArrayList<Integer> result = new ArrayList<>();
        for(int j =0 ; j<nums.length; j++){
            int index = j+1;
            if(nums[j]!= index){
            result.add(index);
        }
        }
        return result;
       }
        
        

    
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
       
        
    }



