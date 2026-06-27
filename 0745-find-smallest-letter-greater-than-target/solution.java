class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char sum=0;
        for(int i =0; i<letters.length; i++){
            if(letters[i]>target){
                sum = letters[i];
                break;
            }
            sum = letters[0];
        }

        return sum;
        
    }
}
