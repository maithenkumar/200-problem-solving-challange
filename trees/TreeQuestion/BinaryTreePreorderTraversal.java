import java.util.ArrayList;
import java.util.List;

class BinaryTreePreorderTraversal{
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        return helper( arr,root);
    }
    List<Integer> helper(List<Integer> arr,TreeNode root){
        if (root==null) {
                
        }
        arr.add(root.val);
        helper(arr, root.left);
        helper(arr, root.right);
        return arr;
    }
}         
}