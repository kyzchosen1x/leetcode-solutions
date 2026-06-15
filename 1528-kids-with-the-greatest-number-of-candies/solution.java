class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extracandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int j =0; j<candies.length;j++){
            if(candies[j] > max){
                max = candies[j];
            }
        }
        for(int candy : candies){
            
            result.add(candy + extracandies >= max);
            
        }
        return result;

        
    }
}
