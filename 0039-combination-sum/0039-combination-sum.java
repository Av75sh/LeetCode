class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), arr);
        return arr;
    }

    private void backtrack(int[] candidates, int index, int target, List<Integer> curr, List<List<Integer>> arr){
        if(target == 0){
            arr.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0 || index == candidates.length) return;

        curr.add(candidates[index]);
        backtrack(candidates, index, target - candidates[index], curr, arr);
        curr.remove(curr.size() - 1);

        backtrack(candidates, index+1, target, curr, arr);

    }
}