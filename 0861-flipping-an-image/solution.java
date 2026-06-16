class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        int[][] revmatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                revmatrix[i][cols - 1 - j] = image[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                revmatrix[i][j] ^= 1;
            }
        }

        return revmatrix;
    }
}
