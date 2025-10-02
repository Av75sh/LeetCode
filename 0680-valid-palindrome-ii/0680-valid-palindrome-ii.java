class Solution {
    public static boolean Palindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return Palindrome(s, left+1, right) || Palindrome(s, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }
}