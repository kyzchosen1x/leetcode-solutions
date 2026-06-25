class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        int [] result = faah(numbers, target);
    

     return result;   
    }
    static int[] faah(int[] array, int sum){
        for(int i =0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]+ array[j]==sum){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[2];
    }
}
