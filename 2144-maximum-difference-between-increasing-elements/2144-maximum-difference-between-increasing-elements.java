class Solution {
    public int maximumDifference(int[] nums) {
        int diff = nums[0], maxdiff = -1;

        for(int i=1; i<nums.length; i++){
            if(diff < nums[i]){
                maxdiff = Math.max(maxdiff, nums[i] - diff); 
            }else{
                diff = nums[i];
            }
        }
        return maxdiff;
    }
}