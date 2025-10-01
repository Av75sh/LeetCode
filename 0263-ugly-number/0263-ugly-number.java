class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        int[] ans = {2,3,5};
        for(int a : ans){
            while(n % a == 0){
                n /= a;
            }
        }
        return n == 1;
    }
}