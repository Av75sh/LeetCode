class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }

    public static void traversal(TreeNode node, List<Integer> result){
        if(node == null) return;
        traversal(node.left, result);
        traversal(node.right, result);
        result.add(node.val);
    }
}