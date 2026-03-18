class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ps = new int[m + 1][n + 1];
        int count = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                ps[i][j] = grid[i - 1][j - 1] 
                         + ps[i - 1][j] 
                         + ps[i][j - 1] 
                         - ps[i - 1][j - 1];
                if (ps[i][j] <= k) count++;
            }
        }

        return count;
    }
}
