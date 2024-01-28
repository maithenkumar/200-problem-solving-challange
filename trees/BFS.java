import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class BFS {

	Node root;

	public BFS() { root = null; }

	// Function to print level order traversal of tree
	// void printLevelOrder()
	// {
	// 	int h = height(root);
	// 	int i;
	// 	for (i = 1; i <= h; i++)
	// 		printCurrentLevel(root, i);
	// }

	// // Compute the "height" of a tree -- the number of
	// // nodes along the longest path from the root node
	// // down to the farthest leaf node.
	// int height(Node root)
	// {
	// 	if (root == null)
	// 		return 0;
	// 	else {
			
	// 		// Compute height of each subtree
	// 		int lheight = height(root.left);
	// 		int rheight = height(root.right);

	// 		// use the larger one
	// 		if (lheight > rheight)
	// 			return (lheight + 1);
	// 		else
	// 			return (rheight + 1);
	// 	}
	// }

	// // Print nodes at the current level
	// void printCurrentLevel(Node root, int level)
	// {
	// 	if (root == null)
	// 		return;
	// 	if (level == 1)
	// 		System.out.print(root.data + " ");
	// 	else if (level > 1) {
	// 		printCurrentLevel(root.left, level - 1);
	// 		printCurrentLevel(root.right, level - 1);
	// 	}
	// }

	// Driver program to test above functions
	public static void main(String args[])
	{
		BFS tree = new BFS();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("Level order traversal of"
						+ "binary tree is ");
		// tree.printLevelOrder();
		tree.printWithQueueLevelOrder();

	}
    private void printWithQueueLevelOrder() {
        Queue<Node> queue =new LinkedList<>() ;
        queue.add(root);
        while (!queue.isEmpty()) {
            
            Node tempNode=queue.poll();
            System.out.print(tempNode.data +" ");
            if (tempNode.left!=null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right!=null) {
                queue.add(tempNode.right);
            }
        }
    }

    static int height(Node root){
        if (root==null) {
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return( 1+Math.max(left,right));
    }
    private void printLevelOrder() {
        int h=height(root);
        for (int i=1;i<=h;i++) {
            printCurrentLevelOrder(root , i );

        }
    }

    private void printCurrentLevelOrder(Node root, int level) {
        if (root==null) {
            return ;
        }
        if (level==1) {
            System.out.print(root.data+" ");
        }
        if (level>1) {
            printCurrentLevelOrder(root.left, level-1);
            printCurrentLevelOrder(root.right, level-1);
        }
    }
}
