class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);

        return Math.max(solution(nums, 0, n-2), solution(nums, 1, n-1));
    }

    private int solution(int[] nums, int start, int end){
        int prev1 = 0, prev2 = 0;

        for(int i=start; i<=end; i++){
            int temp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp;
        }
        return prev1;
    }
}