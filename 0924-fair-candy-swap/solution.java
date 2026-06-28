class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int x : bobSizes) {
            sumB += x;
        }

        int target = (sumA + sumB) / 2;

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {

                int newAlice = sumA - aliceSizes[i] + bobSizes[j];

                if (newAlice == target) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }

        return new int[0];
    }
}
