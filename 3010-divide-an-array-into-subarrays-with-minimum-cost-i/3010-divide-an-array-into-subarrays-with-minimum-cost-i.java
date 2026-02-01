class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int score = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i] < firstMin){
                secondMin = firstMin;
                firstMin = nums[i];
            } else if(nums[i] < secondMin){
                secondMin = nums[i];
            }
        }
        
        return score + firstMin + secondMin;
    }
}