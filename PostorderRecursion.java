

//Every node has left and right as well as value 
class Node{
	
	int data ;
	
	Node left ,right ; 
	
	Node(int value){
		
		data = value;
		
	}
	
}

class PostorderRecursion{
	
	//that is our parent node for the tree
	Node root;
	
	void Postorder(Node node){
		
		//if node is null return
		
		if(node==null)
			return;
		
		//first we need to traverse left of node using recursion
		Postorder(node.left);
		
		//Second we need to traverse right of the node using recursion
		Postorder(node.right);
		
		//After traverse left and right of the node we get node
		System.out.print(node.data+"  ");
		
	}
	
	
	public static void main(String args[]){
		
		PostorderRecursion tree = new PostorderRecursion();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(5);
		
		System.out.println("Postorder Traverse of the tree");
		//we call this method to recursively traverse the tree 
		tree.Postorder(tree.root);
		
		
	}
	
	
}

