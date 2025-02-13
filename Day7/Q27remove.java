public class Q27remove {
    class Solution {

        public static void main(String[] args){
            int[] nums = {3,2,2,3};
            removeElement(nums, 3);
        }

        static int removeElement(int[] nums, int val) {
           int start = 0, end = nums.length - 1, count = 0;
           while(start <= end){
            if(nums[start] != val && nums[end] !=  val){
                count++;
                start++;
                end--;
            }
           }
           return count;
        }
    }
}
