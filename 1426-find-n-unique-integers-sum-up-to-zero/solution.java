class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int value = 1;

        while (left < right) {
            ans[left] = -value;
            ans[right] = value;

            left++;
            right--;
            value++;
        }

        return ans;
    }
}
