
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/solutions/2404676/java-solution-recursion-0ms-100-faster-beginner-friendly/
public class ConvertSortedArraytoBinarySearchTree {
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
    
     public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums ,0,nums.length-1);
    }

    private static TreeNode helper(int[] nums, int l, int r) {
        if (l>r) {
            return null;
        }
        int mid= l+(r-l)/2;
        TreeNode root=new TreeNode( nums[mid] );
        root.right=helper(nums, mid+1, r);
        root.left=helper(nums, l, mid-1);
        return root;

    }
}
