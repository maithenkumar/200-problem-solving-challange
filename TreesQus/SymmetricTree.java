public class SymmetricTree {
    
    
//  Definition for a binary tree node.
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
 
    public boolean isSymmetric(TreeNode root) {
            
           return  root==null||helper(root.left,root.right); 
}

    private boolean helper(TreeNode left, TreeNode right) {
        if (left==null||right==null) {
            return right==left;
        }
        if (right.val!=left.val) {
            return false;
        }
        return helper(left.left, right.right)&&helper(left.right, right.left);
        }

}
