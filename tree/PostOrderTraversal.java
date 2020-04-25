

import java.util.*;

class Node{

  int  data;
  
  Node left,right;
  
    Node(int item){
	
	data = item;
	
	}

}

class  PostOrderTraversal{


    Node root;
 
    void iterativerPostorder(){
	
	 PostOrder(root);
	
	}
	
	
	
	void PostOrder(Node root){
	
	if(root == null){
	return;
	}
	
	Stack<Node> s1 =  new Stack<>();
	
	Stack<Node> s2 = new Stack<>();
	
	
	s1.push(root);
	
	while(!s1.isEmpty()){	
	Node temp = s1.pop();
	s2.push(temp);
	
	if (temp.left != null) 	
	s1.push(temp.left); 
	            
    if (temp.right != null)
	s1.push(temp.right); 
	
	}
	
	
	 while (!s2.isEmpty()) { 
            Node temp2 = s2.pop(); 
            System.out.print(temp2.data + " "); 
        }			
				
				
	}
 
  
    public static void main(String args[]){
	
	
	PostOrderTraversal tree = new PostOrderTraversal();
	
	tree.root = new Node(1);
	tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5); 
    

   tree.iterativerPostorder();    
	
	
	
	
	
	}

}