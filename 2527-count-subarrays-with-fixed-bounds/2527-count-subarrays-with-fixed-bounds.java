class Solution {

    public long countSubarrays(int[] nums, int mink, int maxk) {
        long count = 0;
        int mini = -1, maxi = -1, badi = -1, n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] < mink || nums[i] > maxk) badi = i;
            if(nums[i] == mink) mini = i;
            if(nums[i] == maxk) maxi = i;
            count += Math.max(0, Math.min(mini, maxi) - badi);
        }
        return count;
    }
}