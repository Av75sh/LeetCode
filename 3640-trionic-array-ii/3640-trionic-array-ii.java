class Solution {
    public long maxSumTrionic(int[] nums) {
        int n = nums.length;
        long maxSum = Long.MIN_VALUE;
        
        for (int l = 0; l < n - 3; l++) {
            for (int p = l + 1; p < n - 2; p++) {
                boolean isIncreasing = true;
                for (int i = l; i < p; i++) {
                    if (nums[i] >= nums[i + 1]) {
                        isIncreasing = false;
                        break;
                    }
                }
                if (!isIncreasing) continue;
                
                for (int q = p + 1; q < n - 1; q++) {
                    boolean isDecreasing = true;
                    for (int i = p; i < q; i++) {
                        if (nums[i] <= nums[i + 1]) {
                            isDecreasing = false;
                            break;
                        }
                    }
                    if (!isDecreasing) continue;
                    
                    for (int r = q + 1; r < n; r++) {
                        boolean isIncreasingEnd = true;
                        for (int i = q; i < r; i++) {
                            if (nums[i] >= nums[i + 1]) {
                                isIncreasingEnd = false;
                                break;
                            }
                        }
                        if (!isIncreasingEnd) continue;
                        
                        long sum = 0;
                        for (int i = l; i <= r; i++) {
                            sum += nums[i];
                        }
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
        
        return maxSum;
    }
}
