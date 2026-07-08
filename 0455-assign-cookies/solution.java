class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int answer =0;
        bubblesort(g);
        bubblesort(s);
        int i = 0; 
        int j = 0; 

    while(i < n && j < m){
        if(s[j] >= g[i]){
            answer++;
            i++;    
            j++;
    }   else{
            j++;
    }
}
        return answer;
    }
    static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            boolean swapped = false;
            for(int j = 1; j<n-i; j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
