class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> result = new ArrayList<>();
        result.add(words[0]);

        if(words == null || groups == null || words.length == 0 || groups.length == 0) return result;

        for(int i=1; i<groups.length; i++){
            if(groups[i-1] != groups[i]) result.add(words[i]);
        }
        return result;
    }
}