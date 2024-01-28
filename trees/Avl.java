package trees;

public class Avl {

	class Node{
		private int val;
		private Node left;
		private Node right;
		private int height;

		Node(int val){
			this.val=val;
			//		left=null;
			//		right=null;
			//		height=0;
		}		
		public int getValue() {
			return val;
		}
	}	
	private Node root;
	public Avl() {	
		 
	}
	public void insert(int value ) {
		insert(root, value);
	}
	public Node insert(Node node,int value) {
		if (node==null) {
			node=new Node(value);
			return node;
		}
		if (node.val>value) {
			node.left=insert(node.left, value);
			
		}if (node.val<value) {
			node.right=insert(node.right, value);
			
		}
		node.height=Math.max(height(node.left), height(node.right))+1;
		return rotate(node);
		
		}

	private Node rotate(Node node) {
        //left heavyweight trees
        if (height(node.left)-height(node.right)>1) {
            //left heavy
            if (height(node.left.left)-height(node.left.right)>0) {
                return righttRoutate(node);
            }
            //right heavy
            if (height(node.left.left)-height(node.left.right)<0) {
                    node.left=leftRotate(node.left);
                return righttRoutate(node);
            }
        }
        //Right heavyweight trees
        if (height(node.left)-height(node.right)<-1) {
            //left heavy
            if (height(node.right.right)-height(node.right.left)>0) {
                return righttRoutate(node);
            }
            //right heavy
            if (height(node.right.right)-height(node.right.left)<0) {
                    //
                    node.right=leftRotate(node.right);
                return righttRoutate(node);
            }
        }
        return node;
    }
    private Node leftRotate(Node node) {
        Node tempNode = node.right;
        node.right=tempNode.left;

        tempNode.left=node;
        return tempNode;   

    }
    private Node righttRoutate(Node node) {
        Node tempNode = node.left;
        node.left=tempNode.right;
        tempNode.right=node;
        return tempNode;

    }
    public int height (Node node) {
		if (node==null) {
			return -1;
		}
		return node.height;	
	}
	public	boolean isEmpty() {
		return root==null;	

	}
	void display() {
		display(root ,"RootNode");
	}
	private void display(Node root2, String string) {
		// TODO Auto-generated method stub
		if (root2==null) {
			return;
		}
		System.out.println(string+root2.getValue());
		display(root2.left,"Left Chld Of "+ root2.getValue()+" : ");
		display(root2.right,"Left Chld Of "+ root2.getValue()+" : ");
		
	}
	public boolean balanced(Node node) {
		if (node==null) {
			return true;
		}
		return Math.abs(height(node.left)-height(node.right))<=1 &&balanced(node.left)&&balanced(node.right);
	}
	void populate(int [] nums) {
		for (int i = 0; i < nums.length; i++) {
			this.insert(nums[i]);
		}
	}
}

    
