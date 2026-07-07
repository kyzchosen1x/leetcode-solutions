class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < n) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                result.add(nums[index]);
            }
        }

        return result;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
