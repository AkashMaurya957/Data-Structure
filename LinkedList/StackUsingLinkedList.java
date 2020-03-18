import java.io.*;
import java.util.*;

class StackUsingLinkedList{

Node top;

class Node{
int data;

Node next;


}


StackUsingLinkedList(){
this.top=null;
}


public void Insert(int data){

Node node = new Node();

 if(node==null){

   System.out.println("Stack Overflow");
  }

node.data=x;
node.link = top;

top=node;

}

public void POP(){

}


public void Peek(){

}


public void Display(){


if(top==null){

System.out.println("Stack is UnderFlow");
}
else{ 
Node temp = top; 
            while (temp != null) { 
  
                // print node data 
                System.out.printf("%d->", temp.data); 
  
                // assign temp link to temp 
                temp = temp.link; 
            } 
}

}

public static void main(String args[]){

StackUsingLinkedList obj = new StackUsingLinkedList();

Scanner scan = new Scanner(System.in);

char ch;
try{
do{

System.out.println("Enter 1 for Insert into the stack");
System.out.println("Enter 2 for Pop from the stack");
System.out.println("Enter 3 for Peek from the stack");
System.out.println("Enter 4 for Display the stack");

System.out.println("Select from above choice");

int choice=scan.nextInt();

switch(){
        
           case 1:System.out.println("Enter the number you want to Insert");
                  int num = scan.nextInt();
                  obj.Insert(num);
                  break;
           case 2:obj.POP();
                  System.out.println("Pop operation perform Successfully");
                  break;
           case 3:System.out.println("The Top Element of the stack")
                  obj.Peek();
                  break;
           case 4:System.out.println("Stack Elements")
                  obj.Display();
                  break;
           default:System.out.println("You Enter a Invalid Choice")
                  break;

}

ch= scan.next().charAt(0);

}
while(ch=='Y' || ch=='y');

}catch(Exception e)
{

System.out.println("Something went wrong..");
}

}
}