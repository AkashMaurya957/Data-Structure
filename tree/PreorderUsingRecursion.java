
//Every node consist of left , right and value so first create class for node
class Node{
	
	int data ;
	
	Node left , right;
	
	Node(int value){
		
		data = value;
	}
	
	
}


class PreorderUsingRecursion{
	
	//Node for the parent node of the tree
	Node root;
	
	//Method for Preorder traversal using Recursion
	void Preorder(Node node){
		
		if(node == null)
			return;
		
		//first step visit the node
		
		System.out.print(node.data + " ");
		
		//second step call left subtree
		Preorder(node.left);
		
		//third step call right subtree
		Preorder(node.right);
		
		
	}
	
	
	
	public static void main(String args[]){
		
		
		PreorderUsingRecursion tree = new PreorderUsingRecursion();
		
		//Lets go and declare a tree
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("\nPreorder Traversal using recursion");
		tree.Preorder(tree.root);
		
		
		
	}
	
}