class Solution {
    public String getHappyString(int n, int k) {
        int total = 3 * (1 << (n - 1));
        if (k > total) return "";
        StringBuilder res = new StringBuilder();
        char[] chars = {'a', 'b', 'c'};
        int prev = -1;
        k--;
        for (int i = 0; i < n; i++) {
            int block = 1 << (n - i - 1);
            for (int j = 0; j < 3; j++) {
                if (j == prev) continue;
                if (k >= block) {
                    k -= block;
                } else {
                    res.append(chars[j]);
                    prev = j;
                    break;
                }
            }
        }
        return res.toString();
    }
}
