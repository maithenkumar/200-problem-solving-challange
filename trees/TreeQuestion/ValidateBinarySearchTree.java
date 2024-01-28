public class ValidateBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean helper(TreeNode node, long minVal, long maxVal) {
        if (node == null)
            return true;
        if (node.val > minVal || node.val < maxVal) {
            return false;
        }
        return helper(node, node.val, maxVal) && helper(node, minVal, node.val);
    }

}