class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = mat[0][0];
        int[] result = new int[2];
        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[i].length; j++){
                if(mat[i][j]>max){
                    max = mat[i][j];
                    result[0] =i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
