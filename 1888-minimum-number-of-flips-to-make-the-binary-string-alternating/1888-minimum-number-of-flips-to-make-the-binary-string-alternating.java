class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String t = s + s;
        int res = Integer.MAX_VALUE;
        int diff1 = 0, diff2 = 0;
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c != (i % 2 == 0 ? '0' : '1')) diff1++;
            if (c != (i % 2 == 0 ? '1' : '0')) diff2++;
            
            if (i >= n) {
                char prev = t.charAt(i - n);
                if (prev != ((i - n) % 2 == 0 ? '0' : '1')) diff1--;
                if (prev != ((i - n) % 2 == 0 ? '1' : '0')) diff2--;
            }
            
            if (i >= n - 1) res = Math.min(res, Math.min(diff1, diff2));
        }
        
        return res;
    }
}
