import java.util.ArrayList;
import java.util.List;


public class BinaryTreePostorderTraversal {
 
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
            return  helper(arr, root);
    }
    public static List<Integer> helper(List<Integer> arr,TreeNode root) {

            if (root==null) {
                return arr;
            }
            helper(arr, root.left);
            helper(arr, root.right);
            arr.add(root.val);
    
            return arr;
        }


}
}
