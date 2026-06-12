class Solution {
    public boolean isPalindrome(int x) {
    int b = palindrome(x);
    return b==x;
        
}
    static int palindrome(int a){
        int palindrome = 0;
        while(a>0){
            int rev= a%10;
            palindrome = palindrome*10 + rev;
            a = a/10;
        }
        return palindrome;
    }
}
