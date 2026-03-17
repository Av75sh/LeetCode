class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] h = new int[n];
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                h[j] = matrix[i][j] == 0 ? 0 : h[j] + 1;
            }
            int[] sorted = h.clone();
            java.util.Arrays.sort(sorted);
            for (int j = 0; j < n; j++) {
                res = Math.max(res, sorted[j] * (n - j));
            }
        }
        return res;
    }
}
