class Solution {
    public int findKthPositive(int[] arr, int k) {

        int[] main = new int[arr.length + k + 1];

        for (int i = 0; i < main.length; i++) {
            main[i] = i + 1;
        }

        int[] result = new int[main.length];
        int index = 0;

        for (int i = 0; i < main.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (main[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[index] = main[i];
                index++;
            }
        }

        return result[k - 1];
    }
}
