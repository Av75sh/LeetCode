class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 && j==0) continue;

                else if(i==0) grid[i][j] += grid[i][j-1];
                else if(j==0) grid[i][j] += grid[i-1][j];

                else grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }
}