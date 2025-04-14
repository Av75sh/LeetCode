class Solution {
    public int strStr(String hay, String needle) {
        int n = needle.length(), m = hay.length();
        if(n == 0) return 0;
        if(n > m) return -1;

        for(int i=0; i<=m-n; i++){
            if(hay.substring(i, i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}