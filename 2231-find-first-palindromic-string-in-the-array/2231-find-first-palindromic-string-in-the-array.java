class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            int left = 0, right = word.length()-1;
            boolean isPalindrome = true;

            while(left < right){
                if(word.charAt(left) != word.charAt(right)){
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome) return word;
        }
        return "";
    }
}