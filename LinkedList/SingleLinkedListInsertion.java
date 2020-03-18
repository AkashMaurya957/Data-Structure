
import java.io.*;
import java.util.*;


class SingleLinkedListInsertion{

Node head;

class Node{
int data;
Node next;

Node(int data){
this.data = data;
}

}


public void StartInsert(int data){

Node node = new Node(data);

node.next =head;
head = node; 
}



public void EndInsert(int data){

Node node = new Node(data);


if(head==null){

head  = new Node(data);
}
else{

Node last = head;

while(last.next!=null){
 last=last.next;
}

last.next=node;

}



}


public void InsertAnyWhere(int index,int data){


if(index==0){

StartInsert(data);


}
Node node =  new Node(data);

Node n =head;

for(int i=1;i<index;i++){

n=n.next;
}

node.next=n.next;
n.next=node;



}

  
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
  
public static void main(String args[])
{

SingleLinkedListInsertion obj = new SingleLinkedListInsertion();

Scanner scan = new Scanner(System.in);
char ch;

try{
do{
      
System.out.println("Enter 1 for Insertion at Start of the List");
System.out.println("Enter 2 for Insertion at End of the List");
System.out.println("Enter 3 for Insertion at anywhere of the List");
System.out.println("Enter 4 for Print List");

int choice =  scan.nextInt();

   switch(choice){
              
         case 1:System.out.println("Enter the number you Want to insert at Start");
                int num1=scan.nextInt();
                obj.StartInsert(num1);
                break;

         case 2:System.out.println("Enter the number you want to enter at the end");
                int num2=scan.nextInt();
                 obj.EndInsert(num2);
                break;

         case 3:System.out.println("Enter the Index Number where you want to insert");
                int index=scan.nextInt();
                System.out.println("Enter the number you want to insert");
                int num3=scan.nextInt();
                obj.InsertAnyWhere(index,num3);
                break;
         case 4:obj.printList();
                  break;
         default:System.out.println("Invalid Choice");
                break;


 
   }

System.out.println("To Continue Insertion Please Click Y");

 ch=scan.next().charAt(0);

}while(ch=='Y' || ch=='y');

}catch(Exception e){

System.out.println("You Enter a Invalid data");
}

}

}