import java.util.ArrayList;

public class LeftViewOfBinaryTree {
    class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> arr= new ArrayList<>();
        return helper(arr,root);
    }

    private static  ArrayList<Integer> helper(ArrayList<Integer> arr, Node root) {
            if (root==null) {
                return arr;
            }
            arr.add(root.data);
            helper(arr, root.left);
            return arr;


    }

    ArrayList<Integer> leftView2(Node root)
    {
      // Your code here
      ArrayList<Integer> ans= new ArrayList<>();
      ln(root,1,ans);
      return ans;
    }
    static void ln(Node root, int lev,ArrayList<Integer>  ans){
        
        if(root==null) return;
        if(lev>ans.size()) ans.add(root.data);
        ln(root.left,lev+1,ans);
         ln(root.right,lev+1,ans);
    }
}

