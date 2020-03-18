

import java.util.*;

class Book{

int id;
String name,author;
int quantity;

public Book(int id ,String name,String author,int quantity){

this.id=id;
this.name = name ;
this.author=author ;
this.quantity=quantity;

}
}

public class LinkedListExample{

public static void main(String args[]){

List<Book> list = new LinkedList<Book>();

Book b1 =  new Book(101,"Akash","Hacker",1254);
Book b2 =  new Book(102,"Rakhi","Hacker",1254);
Book b3 =  new Book(103,"Adarsh","Hacker",1254);
Book b4 =  new Book(104,"Naveen","Hacker",1254);

list.add(b1);
list.add(b2);
list.add(b3);
list.add(b4);

System.out.println("  "+list.getFirst());

for(Book s:list){

System.out.println(s.id +" " +s.name +" " +s.author +" " +s.quantity  );
}

}


}