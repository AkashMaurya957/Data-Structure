
import java.util.*;
import java.io.*;


class BinaryTreeInsert{

class Node {
 
 int data;
 
 Node left,right;
 
 Node(int item){
 
  data = item;
 
 }

}


  Node root;

   BinaryTreeInsert(){
   
   root=null;
   
   }
   
   void insert(int value){
      
	  root = insertNode(root,value);
   
   }

  
   Node insertNode(Node root,int value){
	  
    if(root==null){
 
     root = new Node(value);
      
     return root;	  
		
	}	  
	
	
	if(value<root.data){
		
		root.left = insertNode(root.left,value);
		
	}else if(value>root.data){
		
		root.right = insertNode(root.right,value);
		
	}
	 
	 System.out.println(root.data);
return root;	 
   }
    
	
   

 public static void main(String args[]){
 
 BinaryTreeInsert tree = new BinaryTreeInsert();
 
 Scanner scan = new Scanner(System.in);
 
 char ch;
 int choice ;
 do{
	 
	 System.out.println("Enter 1 to insert node");
	 choice  = scan.nextInt();
 
  switch(choice){
  
        case 1:
		      System.out.println("Enter node to insert");
			  tree.insert(scan.nextInt());
			  break;
	     default:System.out.println("You enter invalid choice");
                break;		 
			  
  
  }
 
       System.out.println("Enter Y or y to continue"); 
       ch = scan.next().charAt(0);   

 
 }while(ch=='Y' || ch=='y');
  
 
 }

}