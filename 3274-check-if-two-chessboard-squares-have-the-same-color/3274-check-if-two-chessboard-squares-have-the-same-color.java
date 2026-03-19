class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int sum1 = (c1.charAt(0) - 'a') + (c1.charAt(1) - '0');
        int sum2 = (c2.charAt(0) - 'a') + (c2.charAt(1) - '0');
        return (sum1 % 2) == (sum2 % 2);
    }
}