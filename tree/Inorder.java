
import java.util.*;

class Node{
	
	int data;
	
	Node left,right;
	
	Node(int item){
		
		data = item;
		
	}
	
	
}


class Inorder{
	
	Node root;
	
	void inorderTraversal(){
		
		traverseInorder(root);
		
	}
	
	void traverseInorder(Node root){
		
		
		if(root == null){
			
			return;
		}
		
		Stack<Node> s= new Stack<Node>();
		
		Node target = root;
		
		while(target!=null || s.size()>0){
			
             while(target!=null){
				 
				 
				 s.push(target);
				 target = target.left;
			 }
			 
			 
			 target = s.pop();
			 
			 System.out.print(target.data+" ");
			 target = target.right;
			
		}
		
		
		
	}
	
	public static void main(String args[]){
		
		Inorder tree = new Inorder();
		
       tree.root = new Node(1);
	   tree.root.left = new Node(2);
	   tree.root.right = new Node(3);
	   tree.root.left.left = new Node(4);
	   tree.root.left.right = new Node(5);
	   
	   
	   tree.inorderTraversal();

	}
	
}