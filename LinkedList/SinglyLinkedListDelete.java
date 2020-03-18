

import java.io.*;
import java.util.*;

class SinglyLinkedListDelete{

Node head;

class Node{

int data;
Node next;

Node(int data){
this.data=data;
}

}



public void Start(int data){

Node node =  new Node(data);

node.next =head;
head=node;



}

public void AnyWhere(int index,int data){

Node node = new Node(data);

if(index==0){
Start(data);
}

Node pos=head;
for(int i=1;i<index;i++){

pos=pos.next;

}


node.next=pos.next;
pos.next=node;

}

public  void  End(int data){

Node node = new Node(data);


if(head==null){

head  = new Node(data);

}
else
{
Node n =head;


while(n.next!=null){

n=n.next;

}

n.next=node;


}

}

public  void Delete(int data){


Node temp=head,pre=null;

if(temp==null){
System.out.println("There is no Element in the List");
}

if(temp!=null && temp.data==data){
head = temp.next;
}

while(temp!=null &&temp.data!=data ){

pre=temp;

temp=temp.next;

}
pre.next=temp.next;

}

public  void printList(){


Node n=head;
 
while(n!=null){
 
  System.out.print(n.data +"  ");
   n=n.next;
}



}

public static void main(String args[])
{
SinglyLinkedListDelete obj = new SinglyLinkedListDelete();

Scanner scan = new Scanner(System.in);

char ch;

try{

do{

  System.out.println("Press 1 to insert element at start ");
  System.out.println("Press 2 to insert element at Anywhere ");
  System.out.println("Press 3 to insert element at End ");
  System.out.println("Press 4 for Delete an element");
  System.out.println("Press 5 for print all the elements");


  System.out.println("\n Please Enter Your Choice  ");
  int choice = scan.nextInt();

  switch(choice){
              
            case 1:System.out.println("Enter number you want to insert at start");
                   int num = scan.nextInt();
                   obj.Start(num);  
                   break;
            case 2:System.out.println("Enter index number you want to insert ");
                   int num1= scan.nextInt();
                   System.out.println("Enter  number you want to insert ");
                   int num2 = scan.nextInt();
                   obj.AnyWhere(num1,num2);
                   break;
            case 3:System.out.println("Enter number you want to insert at End ");
                   int num3 = scan.nextInt();
                   obj.End(num3);
                   break;
            case 4:System.out.println("Enter number you want to Delete");
                   int num4 = scan.nextInt();
                   obj.Delete(num4);
                   break;
            case 5:System.out.println("The List of Elements :");
                   obj.printList();
                   break;
            default:System.out.println("You invalid choice");
                     break;
 
 }
System.out.println("Enter the Y or y to continue");
ch = scan.next().charAt(0);

}while(ch=='Y' || ch=='y');

}
catch(Exception e )
{

e.printStackTrace();

System.out.println("You Enter a Invalid Choice");

}

}

}