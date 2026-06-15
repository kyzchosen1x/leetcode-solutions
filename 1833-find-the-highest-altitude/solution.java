class Solution {
    public int largestAltitude(int[] gain) {
        int altitude =0 ;
        int maxHeight =0;
        for(int i =0; i<gain.length; i++){
            altitude += gain[i];
            if(altitude > maxHeight){
                maxHeight = altitude;
            }
        }
        return maxHeight;
        
    }
}
