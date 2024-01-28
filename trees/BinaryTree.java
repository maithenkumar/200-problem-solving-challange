package trees;

import java.util.Scanner;

public class BinaryTree {
	public static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int val){
			this.val=val;
		}
	}
private Node root;
//insert elment
public void populate(Scanner scanner) {
System.out.println("Enter the root node");
int value=scanner.nextInt();
root=new Node(value);
populate(scanner,root);
	
}
private void populate(Scanner scanner, Node node) {
	// TODO Auto-generated method stub
	
	System.out.println("Do you want enter left of  "+node.val);
	boolean left=scanner.nextBoolean();
	if (left) {
	System.out.println("Enter the value of left of "+ node.val);
		int value=scanner.nextInt();
		node.left=new Node(value);
		populate(scanner,node.left);	
}
	System.out.println("Do you want enter right of  "+node.val);
	boolean right=scanner.nextBoolean();
	if (right) {
	System.out.println("Enter the value of right of "+ node.val);
		int value=scanner.nextInt();
		node.right=new Node(value);
		populate(scanner,node.right);
}
	
	
}	
public void display() {
	display(root,"");
}
private void display(Node root, String string) {
	// TODO Auto-generated method stub
	if (root==null) {
		return;
	}
	System.out.println(string+root.val);
	display(root.left,string+"\t");
	display(root.right,string+"\t");

	
}

}