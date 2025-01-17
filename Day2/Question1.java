/* 2683 Neighbouring XOR  */

public class Question1 {
    class Solution {
        public boolean doesValidArrayExist(int[] n) {
    
            if(xor(n, 0)){
                return true;
            }
            if(xor(n, 1)){
                return true;
            }
            return false;
        }
            private boolean xor(int[] derived, int start){
                int n = derived.length;
                int[] original = new int[n];
                original[0] = start;
    
            for (int i = 1; i < n; i++) {
                original[i] = derived[i - 1] ^ original[i - 1];
            }
            return derived[n - 1] == (original[n - 1] ^ original[0]);
            
        }
    }
}
