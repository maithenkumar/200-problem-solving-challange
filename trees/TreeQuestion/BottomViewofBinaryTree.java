import java.util.ArrayList;

import org.w3c.dom.Node;

public class BottomViewofBinaryTree {
      public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList <Integer> arr=new ArrayList<>();
        return helper(arr, root);

        }

    private ArrayList<Integer> helper(ArrayList<Integer> arr, Node root) {
        if (root.left==null||root.right) {
            arr.add(root.data);
        }
        helper(arr, root.left);
        helper(arr, root.right);
     return arr;   
    }
}
//