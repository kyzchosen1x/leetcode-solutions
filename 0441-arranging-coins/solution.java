class Solution {
    public int arrangeCoins(int n) {

        int complete = 0;
        long count = 0;

        for (int i = 0; i < n; i++) {

            count += i + 1;

            if (count <= n) {
                complete++;
            } else {
                break;
            }
        }

        return complete;
    }
}
