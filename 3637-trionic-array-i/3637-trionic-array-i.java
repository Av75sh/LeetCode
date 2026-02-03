class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false; 

        int i = 0;
        while (i < n - 2 && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;

        int j = i;
        while (j < n - 1 && nums[j] > nums[j + 1]) {
            j++;
        }
        if (j == i || j == n - 1) return false;

        for (int k = j; k < n - 1; k++) {
            if (nums[k] >= nums[k + 1]) {
                return false;
            }
        }

        return true;
    }
}
