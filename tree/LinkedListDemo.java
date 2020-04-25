

class LinkedListDemo{

Node head;

class Node{

int data;
Node next;

 Node(int data){
  this.data = data;
  
   }
}


//Function for insert node at front of the list
public void insert(int data){

Node node = new Node(data);

node.next = head;
head = node;

}

public void addAnyWhere(int index,int data){

Node node = new Node(data);

if(index==0){

insert(data);


}

Node n = head;

for(int i=0;i<index;i++){
  
    
  n=n.next;

}

node.next = n.next;
n.next=node;

}


public void insertAtEnd(int data){

Node node = new Node(data);

if(head==null){

head = new Node(data);
}

node.next=null;	

Node last =head;

while(last.next!=null){
     
last = last.next;
}

last.next = node;

}



public void printList() 
    { 
        Node node = head; 
        while (node != null) 
        { 
            System.out.print(node.data+" "); 
            node = node.next; 
        } 
    } 

public static void main(String args[]){

LinkedListDemo list = new LinkedListDemo();

list.insert(5);
list.insert(3);
list.insert(4);
list.insert(7);
list.insertAtEnd(4);
list.addAnyWhere(2,45);

list.printList();

}
}