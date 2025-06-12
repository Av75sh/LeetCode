class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        helper(root, targetSum, path, result);
        return result;
    }
    private void helper(TreeNode node, int target, List<Integer> path, List<List<Integer>> result){
        if(node == null) return;

        path.add(node.val);

        if(node.left == null && node.right == null && node.val == target){
            result.add(new ArrayList<>(path));
        }

        helper(node.left, target - node.val, path, result);
        helper(node.right, target - node.val, path, result);

        path.remove(path.size() - 1);
    }
}