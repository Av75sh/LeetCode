class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0, n = nums.length;
        
        for(int i=0; i<n; i++){
            HashSet<Integer> odd = new HashSet<>();
            HashSet<Integer> even = new HashSet<>();

            for(int j=i; j<n; j++){
                if(nums[j] % 2 == 0) even.add(nums[j]);
                else odd.add(nums[j]);

                if(even.size() == odd.size()){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}