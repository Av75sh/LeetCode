class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int maxProfit = 0, profit = 0, day = 0;

        for(int i=1; i<n; i++){
            if(nums[i-1] < nums[i]){
                profit = nums[i] - nums[i-1];
                day += profit;
            }
            maxProfit = Math.max(maxProfit, day);
        }
        return maxProfit;
    }
}