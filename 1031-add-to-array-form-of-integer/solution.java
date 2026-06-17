class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int[] arr = new int[n + 10];
        int idx = arr.length - 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + k;
            arr[idx--] = sum % 10;
            k = sum / 10;
        }

        while (k > 0) {
            arr[idx--] = k % 10;
            k /= 10;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = idx + 1; i < arr.length; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
