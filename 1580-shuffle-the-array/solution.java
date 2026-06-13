class Solution {
    public int[] shuffle(int[] nums, int n) {
        int h =n;
        int[] arr1 = new int[h];
        int[] arr2 = new int[h];
        for(int i =0; i<h; i++){
            arr1[i] = nums[i];
            arr2[i] = nums[i+h];

        }
        int [] ark = new int[2*n];
        for(int kk =0;kk<h; kk++){
            ark[kk*2] = arr1[kk];
            ark[kk*2+1] = arr2[kk];
        }
        return ark;
    }
}
