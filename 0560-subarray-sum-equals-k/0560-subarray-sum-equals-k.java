class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        HashMap<Integer, Integer> avinash = new HashMap<>();
        avinash.put(0, 1);

        for(int i : nums){
            sum += i;
            result += avinash.getOrDefault(sum - k, 0);
            avinash.put(sum, avinash.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}