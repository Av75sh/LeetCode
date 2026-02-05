class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                int target = (i + nums[i] % n + n) % n;
                result[i] = nums[target];
            }
        }
        return result;
    }
}
