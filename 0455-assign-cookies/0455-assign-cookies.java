class Solution {
    public int findContentChildren(int[] greed, int[] satisfy) {
        Arrays.sort(greed);
        Arrays.sort(satisfy);
        int left = 0, right = 0;
        while (left < greed.length && right < satisfy.length) {
            if (greed[left] <= satisfy[right]) {
                left++; 
            }
            right++; 
        }
        return left;
    }
}
