class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }

    public static void traversal(TreeNode node, List<Integer> result){
        if(node == null) return;
        result.add(node.val);
        traversal(node.left, result);
        traversal(node.right, result);
    }
}