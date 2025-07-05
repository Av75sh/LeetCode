import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, 0, 0, target, new HashMap<>());
    }

    private int backtrack(int[] nums, int index, int currentSum, int target, Map<String, Integer> memo) {
        String key = index + "," + currentSum;
        if (memo.containsKey(key)) return memo.get(key);

        if (index == nums.length) {
            return currentSum == target ? 1 : 0;
        }

        int add = backtrack(nums, index + 1, currentSum + nums[index], target, memo);
        int subtract = backtrack(nums, index + 1, currentSum - nums[index], target, memo);
        
        memo.put(key, add + subtract);
        return add + subtract;
    }
}
