class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        int count = 1;
        int ans = nums[0];

        for(int i=0; i<nums.length; i++){
            if(ans + k < nums[i]){
                count++;
                ans = nums[i];
            }
        }
        return count;
    }
}