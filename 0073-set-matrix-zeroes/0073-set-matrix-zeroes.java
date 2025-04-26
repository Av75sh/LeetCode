class Solution {
    public void setZeroes(int[][] matrix2) {
       
        int row = matrix2.length;
        int col = matrix2[0].length;
         boolean[][] mark = new boolean[row][col];


        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix2[i][j] == 0){
                    mark[i][j] = true;
                }
            }
        }

         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(mark[i][j]){

                    for(int k=0; k<col; k++){
                        matrix2[i][k] = 0;
                    }
                    for(int k=0; k<row; k++){
                        matrix2[k][j] = 0;
                    }
                }
            }
         }
    }
}