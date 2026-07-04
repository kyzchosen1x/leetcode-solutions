class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = weights[0];
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
            sum += weights[i];
        }

        int start = max;
        int end = sum;
        int answer = max;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (minCapacity(weights, days, mid)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    public boolean minCapacity(int[] weights, int days, int capacity) {

        int daysUsed = 1;
        int currentLoad = 0;

        for (int i = 0; i < weights.length; i++) {

            if (currentLoad + weights[i] <= capacity) {
                currentLoad += weights[i];
            } else {
                daysUsed++;
                currentLoad = weights[i];
            }
        }

        return daysUsed <= days;
    }
}
