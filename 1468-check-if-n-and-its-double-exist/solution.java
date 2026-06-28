class Solution {
    public boolean checkIfExist(int[] array) {
        boolean faah = false;
        for(int i =0; i<array.length;i++){
            for(int j =0; j<array.length; j++){
                if(i!=j){
                    if(2*array[j]==array[i]){
                        faah = true;
                    }
                }
            }
        }
        return faah;
        
    }
}
