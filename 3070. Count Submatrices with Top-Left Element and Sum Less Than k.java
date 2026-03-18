class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        long[][] mat = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                long currentSum = grid[i][j];
                if (i > 0) 
                currentSum += mat[i - 1][j];
                if (j > 0) 
                currentSum += mat[i][j - 1];
                if (i > 0 && j > 0) 
                currentSum -= mat[i - 1][j - 1];
                mat[i][j] = currentSum;
                if (currentSum <= k) {
                    count++;
                } else {
                    break; 
                }
            }
        }
        return count;
    }
}
