  
import java.util.*; 

class IterativePostorder { 
  
    static class node { 
        int data; 
        node left, right; 
  
        public node(int data) 
        { 
            this.data = data; 
        } 
    } 
  
    // Two stacks as used in explanation 
    static Stack<node> s1, s2; 
  
    static void postOrderIterative(node root) 
    { 
        // Create two stacks 
        s1 = new Stack<>(); 
        s2 = new Stack<>(); 
  
        if (root == null) 
            return; 
  
        s1.push(root); 
  
        // Run while first stack is not empty 
        while (!s1.isEmpty()) { 
  
            node temp = s1.pop(); 
            s2.push(temp); 
  
            // Push left and right children of 
            // removed item to s1 
            if (temp.left != null) 
                s1.push(temp.left); 
            if (temp.right != null) 
                s1.push(temp.right); 
        } 
  
        // Print all elements of second stack 
        while (!s2.isEmpty()) { 
            node temp = s2.pop(); 
            System.out.print(temp.data + " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
      
        node root = null; 
        root = new node(1); 
        root.left = new node(2); 
        root.right = new node(3); 
        root.left.left = new node(4); 
        root.left.right = new node(5); 
       
        postOrderIterative(root); 
		
		
    } 
} 