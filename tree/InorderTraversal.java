
import java.util.*;

class Node {

  int data;
  
  
  Node left , right;
  
  Node(int item){
  
  data = item;
  
  }


}


class InorderTraversal{

 Node root;
 
  void inorderTraversal(){
  
  inorderTraversal(root);
    
  }
  
  void inorderTraversal(Node root){
  
  if(root==null)
  return;
  
  Stack<Node> s = new Stack<Node>();  
  Node target = root;

   while(target != null || s.size()>0) {    
       
	   while(target!=null){		
		s.push(target);		
		target = target.left;		
		}
		
		target = s.pop();
		System.out.println(target.data+" ");
		target = target.right;
		} 
  }
    

 public static void main(String args[]){

  InorderTraversal tree = new InorderTraversal();
  
  
  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);


   tree.inorderTraversal();

}

}