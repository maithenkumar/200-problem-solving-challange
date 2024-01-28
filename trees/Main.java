package trees;	

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		BinaryTree tree=new BinaryTree();
//		tree.populate(scanner);
//		tree.display();
		BinarySearchTree bst=new BinarySearchTree();
		int [] nums={5,2,7,1,4,6,9,8,3,10};
		bst.populate(nums);
		bst.display();

	}

}
