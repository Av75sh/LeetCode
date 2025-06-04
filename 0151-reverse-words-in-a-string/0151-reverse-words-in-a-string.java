class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");

        StringBuilder avinash = new StringBuilder();
        for(int i=words.length - 1; i>=0; i--){
            avinash.append(words[i]);
            if(i>0) avinash.append(" ");
        }
        return avinash.toString();
    }
}