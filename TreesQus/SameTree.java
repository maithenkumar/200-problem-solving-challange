
public class SameTree {

    // Definition for a binary tree node
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        return cheaker(p, q);

    }

    private static boolean cheaker(TreeNode p, TreeNode q) {
        if (p==null&&q==null) {
            return true;
           }
           if (p==null||q==null||q.val!=p.val) {
            return false;
            
           }
        return cheaker(p.left, q.left)&&cheaker(q.right, p.right);

       
    }
}