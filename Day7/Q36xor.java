public class Q36xor {
    class Solution {
        public int singleNumber(int[] nums) {
            int avinash = 0;
    
            for(int num : nums){
                avinash ^= num;
            }
            return avinash;
        }
    }
}

// XOR removes the duplicate value 
