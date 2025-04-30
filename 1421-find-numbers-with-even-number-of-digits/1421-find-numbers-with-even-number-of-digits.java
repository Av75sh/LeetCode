class Solution {
    static boolean even(int num){
        int value = 0;
        while(num > 0){
            value++;
            num = num / 10;
        }
        return value % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(even(nums[i])) count++;
        }
        return count;
    }
}