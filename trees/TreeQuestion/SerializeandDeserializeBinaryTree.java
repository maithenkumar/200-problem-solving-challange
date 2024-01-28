public class SerializeandDeserializeBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String ans = "";
        serialize(root, ans);
        return ans;

    }

    private void serialize(SerializeandDeserializeBinaryTree.TreeNode root, String ans) {
        if (root == null) {
            ans += "n";
            return;

        }
        ans += root.val;
        serialize(root.left);
        serialize(root.right);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length()==0) {
            return null;
        }
        if (data.charAt(0)=='n') {
            return null;
        }
        TreeNode root = new TreeNode(data.charAt(0)-'0');
        root.left=deserialize(data.substring( 1,data.length()-1));
        root.right=deserialize(data.substring( 1,data.length()-1));
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
