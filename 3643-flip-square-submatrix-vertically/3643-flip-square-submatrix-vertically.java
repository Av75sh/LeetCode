class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int col = y; col < y + k; col++) {
            int top = x, bottom = x + k - 1;
            while (top < bottom) {
                int temp = grid[top][col];
                grid[top][col] = grid[bottom][col];
                grid[bottom][col] = temp;
                top++;
                bottom--;
            }
        }
        return grid;
    }
}
