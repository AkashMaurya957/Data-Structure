
import java.util.*;


class Node {

  int data ;
  
  Node left ,right;
  
  Node(int item){
  
    data = item;
  
  }

}

class Postorder{

   Node root;
   
   void iterativerPostorder(){
   
      PostorderTraversal(root);
   
   
   }
   
     // Method for traversing tree    
   void PostorderTraversal(Node root){
   
      if(root == null)
	  {
	     return;
	  }
	  
	  
	  Stack<Node> s1 = new Stack<Node>();
	  
	  Stack<Node> s2 = new Stack<Node>();
	  
	  s1.push(root);
	  
          // loop run until the firsr stack become empty
	  while(!s1.isEmpty()){

               //Start POP elements form first stack
               Node temp = s1.pop();
		 s2.push(temp);
		 

                 
		 if(temp.left!=null){
		 
		 s1.push(temp.left);
		 }
		 
		 if(temp.right!=null){
		 
		 s1.push(temp.right);
		 
		 }
		
	  
	  }
	  
	  System.out.println("Post Traversal: ");
	  
	  while(!s2.isEmpty()){
	  
	    Node temp2 = s2.pop();
		
		System.out.print(temp2.data+" ");
	  
	  }
   
   
   }

  public static void main(String args[]){
  
  
    Postorder tree = new Postorder();
	
        tree.root  =  new Node(1);
	tree.root.left = new Node(2);
	tree.root.right  = new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);
  
  
  tree.iterativerPostorder();
  
  }


}