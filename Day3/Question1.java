/* 345 reverse vowels of a string  */

public class Question1 {
    class Solution {
        public String reverseVowels(String s) {
            String vowels = "aeiouAEIOU";
            List<Character> vowelList = new ArrayList<>();
    
            for (char c : s.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    vowelList.add(c);
                }
            }
    
            StringBuilder result = new StringBuilder();
            int vowelIndex = vowelList.size() - 1; 
    
            for (char c : s.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    result.append(vowelList.get(vowelIndex--)); 
                } else {
                    result.append(c); 
                }
            }
    
            return result.toString();
        
        }
    }
}
