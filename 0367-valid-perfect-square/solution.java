class Solution {
    public boolean isPerfectSquare(int num) {
        boolean result = true;
        for(long i =1; i*i<=num; i++){
            if( i*i ==num){
                return result;
            }
            
        }
        return false;


        
    }
}
