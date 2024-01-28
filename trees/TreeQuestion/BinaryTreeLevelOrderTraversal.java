import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            List<Integer> temp = new ArrayList<>();
            getCurrentLevel(root, i, temp);
            list.add(temp);

        }
        return list;
    }

    private void getCurrentLevel(TreeNode root, int i, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (i == 1) {
            list.add(root.val);
        }
        if (i > 1) {
            getCurrentLevel(root.left, i - 1, list);
            getCurrentLevel(root.right, i - 1, list);
        }

    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return (Math.max(left, right) + 1);
    }

    // ---------------------------------------------------------------------------------
    // optimal
    public List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue1.add(root);
        while (!queue1.isEmpty()) {

            Queue<TreeNode> queue2 = new LinkedList<>();
            List<Integer> temp = new ArrayList<>();
            while (!queue1.isEmpty()) {
                TreeNode temNode=queue1.poll();
                temp.add(temNode.val);
                if (temNode.left!=null) queue2.add(temNode.left);
                if (temNode.right!=null) queue2.add(temNode.right);
            }

            ans.add(temp);
            queue1=queue2;
        }
        return ans;
    }
}
