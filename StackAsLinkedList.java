
import java.io.*;

class StackAsLinkedList{

Node top;

class Node{

   int data 
   Node link;

 }

StackAsLinkedList(){

this.top = null;

}
public void push(int x)
{
   Node temp =new Node();

   if(temp==null){

      System.out.print("\nHeap Overflow"); 

    }

 temp.data = x;
 

}

public static void main(String args[]){

Scanner scan = new Scanner(System.in);

StackAsLinkedList obj = new StackAsLinkedList();

char ch;

do{


System.out.println("\nLinked List Stack Operation");
System.out.println("1.Push");
System.out.println("2.Pop");
System.out.println("3.Peek");
System.out.println("4.Check Empty");
System.out.println("5.Size");

int choice = scan.nextInt();

switch (choice) 
            {
            case 1 :
                System.out.println("Enter integer element to push");
                ls.push( scan.nextInt() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = "+ ls.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ ls.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ ls.isEmpty());
                break;                
            case 5 : 
                System.out.println("Size = "+ ls.getSize()); 
                break;                
            case 6 : 
                System.out.println("Stack = "); 
                ls.display();
                break;                        
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           
               
            ls.display();            
            System.out.println("\nDo you want to continue (Type y or Y) \n");
            ch = scan.next().charAt(0);   

}while(ch=='Y' || ch=='y')

}

}