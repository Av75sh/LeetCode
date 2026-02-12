class Solution {
    public boolean checkBalance(char[] freq){
        int common = 0;
        for(int i=0; i<26; i++){
            if(freq[i] == 0) continue;
            if(common == 0) common = freq[i];
            else if(freq[i] != common) return false;
        }
        return true;
    }

    public int longestBalanced(String s) {
        int n = s.length(), maxLen = 0;

        for(int i=0; i<n; i++){
            char[] freq = new char[26];
            for(int j=i; j<n; j++){
                freq[s.charAt(j) - 'a']++;

                if(checkBalance(freq)){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}