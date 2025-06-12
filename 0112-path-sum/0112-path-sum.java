class Solution {
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return helper(root, 0);
    }

    private boolean helper(TreeNode node, int sum){
        if(node == null) return false;
        sum += node.val;

        if(node.left == null && node.right == null) return sum == target;
        boolean left = helper(node.left, sum);
        boolean right = helper(node.right, sum);

        return left || right;
    }
}