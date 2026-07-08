class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int y = m+n;
        for(int i =0; i<n; i++){
            nums1[i+m] = nums2[i];
        }
        bubbles(nums1, y);
    }
    static void bubbles(int[] arr, int y){
    for(int i=0; i<y; i++){
        boolean bbg= false;
        for(int j =1; j<y-i; j++){
            if(arr[j-1]>arr[j]){
                swap(arr, j-1, j);
                bbg= true;
            }
        }
        if(!bbg){
            break;
        }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

