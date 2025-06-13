class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode node){
        if(node == null) return 0;

        int leftGain = Math.max(0, maxGain(node.left));
        int rightGain = Math.max(0, maxGain(node.right));
        int newPath = node.val + leftGain + rightGain;

        maxSum = Math.max(maxSum, newPath);
        return node.val + Math.max(leftGain, rightGain);
    }
}