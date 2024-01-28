

public class BinaryTreeMaximumPathSum {

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
 
class Solution {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        return helper(root, 0,0);
    }

    private int helper(TreeNode root, int sum, int max) {
        if (root==null) {
            return 0;
        }
        helper(root.left, sum, max)
                    
         sum= root.val+helper(root.left, sum, max)+helper(root.right, sum, max);
        res=Math.max(sum,res);

        return root.val + Math.max(, right);


    }
    private int helper2(TreeNode root, int sum, int max) {
            if (root==null) {
                return 0;
            }
            sum+=root.val;
            max=Math.max(max,sum);
                        
            helper(root.left, sum, max);
            helper(root.right, sum, max);
            max=Math.max(max,sum);
            return max;


    }


}
}
