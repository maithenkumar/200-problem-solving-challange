public class SubtreeofAnotherTree {

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
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            boolean ans=false; 
            if (root==null) return false;
            if (root.val== subRoot.val) {
                ans=isSubtree(root, subRoot);
                if (ans) {
                    return true;
                }

            }else{
                 isSubtree(root.left, subRoot.left);
                 isSubtree(root.right, subRoot.right);
            }
            return ans;
        }       
        boolean isSame(TreeNode left, TreeNode right) {
            if (left==null&&right==null) return true ;
            if (left.val !=right.val||(left==null||right==null)) return false ;
            return isSame(left.left, right.left)&&isSame(left.right, right.right);
    
        }
    }

}
