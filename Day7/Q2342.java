public class Q2342 {
    class Solution {
        public static int sumOfDigits(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    
        public int maximumSum(int[] nums) {
            HashMap<Integer, Integer> avinash = new HashMap<>();
            int maxSum = -1;
    
            for (int num : nums) {
                int digitSum = sumOfDigits(num);
    
                if (avinash.containsKey(digitSum)) {
                    maxSum = Math.max(maxSum, avinash.get(digitSum) + num);
                    avinash.put(digitSum, Math.max(avinash.get(digitSum), num));
                } else {
                    avinash.put(digitSum, num);
                }
            }
    
            return maxSum;
        }
    }
}
