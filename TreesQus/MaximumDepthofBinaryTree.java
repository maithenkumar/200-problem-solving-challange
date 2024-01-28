public class MaximumDepthofBinaryTree {
    
// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

    public static int maxDepth(TreeNode root) {
        return helper(root,0,0);
}

    private static int helper(MaximumDepthofBinaryTree.TreeNode root, int conut, int max) {
        if(root==null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
