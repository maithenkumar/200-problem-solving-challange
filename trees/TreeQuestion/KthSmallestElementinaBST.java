public class KthSmallestElementinaBST {

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

    class Solution {
        public int kthSmallest(TreeNode root, int k) {
            int ans=0;
            if (root == null)
                return 0;
            if (k == 1) {
                ans= root.val;
                return ans;

            }
            kthSmallest(root.left, k-1);
            kthSmallest(root.right, k-1);
            return ans;
        }
    }
}
