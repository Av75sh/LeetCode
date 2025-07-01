class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] preIndex = new int[1];
        return solve(preorder, inorder, preIndex, 0, inorder.length - 1);        
    }

    static int find(int[] inorder, int element){
        for(int i=0; i<inorder.length; i++){
            if(inorder[i] == element) return i;
        }
        return -1;
    }

    public TreeNode solve(int[] preorder, int[] inorder, int[] preIndex, int left, int right){
        if(left > right) return null;

        int element = preorder[preIndex[0]++];
        int pos = find(inorder, element);

        TreeNode parent = new TreeNode(element);
        parent.left = solve(preorder, inorder, preIndex, left, pos - 1);
        parent.right = solve(preorder, inorder, preIndex, pos + 1, right);
        return parent;
    }
}