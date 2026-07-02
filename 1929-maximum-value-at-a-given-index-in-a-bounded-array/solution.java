class Solution {

    public int maxValue(int n, int index, int maxSum) {

        int low = 1;
        int high = maxSum;
        int ans = 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(n, index, maxSum, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean isPossible(int n, int index, int maxSum, int mid) {

        long sum = mid;

        // Left side
        int left = index;
        if (mid > left) {
            long first = mid - 1;
            long last = mid - left;
            sum += (first + last) * left / 2;
        } else {
            long first = mid - 1;
            sum += (first + 1) * first / 2;
            sum += left - first;
        }

        // Right side
        int right = n - index - 1;
        if (mid > right) {
            long first = mid - 1;
            long last = mid - right;
            sum += (first + last) * right / 2;
        } else {
            long first = mid - 1;
            sum += (first + 1) * first / 2;
            sum += right - first;
        }

        return sum <= maxSum;
    }
}
