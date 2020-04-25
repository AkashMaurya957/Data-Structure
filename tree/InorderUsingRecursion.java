
//Every node of a tree contain left , right and value
class Node{
	
	int data;
	
	Node left , right;
	
	Node(int val){
		
		data = val;
		
	}
	
	
}


class InorderUsingRecursion{
	
	Node root;
	
	//Traverse tree in Inorder using recursion
	void Inorder(Node node){
		
		//if tree has no node return from their
		if(node == null)
			return;
		
		
		//first we need to traverse the left 
		Inorder(node.left);
		
		//visit the node
		System.out.print(node.data+"  ");
		
		//last traverse the right tree
		Inorder(node.right);
		
		
	}
	
	public static void main(String args[]){
		
		InorderUsingRecursion tree = new InorderUsingRecursion();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right  = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		
		System.out.println("\n Inorder Traversal of the tree");
		tree.Inorder(tree.root);
		
		
	}
	
	
}