class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, next = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while(next < s.length()){
            if(!set.contains(s.charAt(next))){
                set.add(s.charAt(next));
                next++;
            } else{
                set.remove(s.charAt(start));
                start++;
            }
            max = Math.max(max, next-start);
        }
        return max;
    }
}