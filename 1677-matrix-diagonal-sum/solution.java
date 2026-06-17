class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i==j){
                    sum+= mat[i][j];
                    sum+= mat[i][n-1-j];

                }
                if(n%2!=0){
                    if(i==n/2 && j == n/2){
                        sum-= mat[i][j];
                    }
                }

            }
            
        }
        return sum;
        
    }
}
