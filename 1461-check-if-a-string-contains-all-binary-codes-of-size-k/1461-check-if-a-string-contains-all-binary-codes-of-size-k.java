class Solution {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        boolean[] seen = new boolean[need];
        int count = 0, num = 0, mask = need - 1;

        for (int i = 0; i < s.length(); i++) {
            num = ((num << 1) & mask) | (s.charAt(i) - '0');
            if (i >= k - 1 && !seen[num]) {
                seen[num] = true;
                count++;
                if (count == need) return true;
            }
        }
        return false;
    }
}
