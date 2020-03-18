//Iterate Collection Through Iterator Interface


import java.util.*;

class IteratorArrayList{


public static void main(String args[]){

ArrayList<String> list = new ArrayList<String>(); 

list.add("Akash Maurya");
list.add("Naveen Saini");
list.add("Manoj Kumar");
list.add("Adarsh saini");
list.add("Rakhi Gupta");
list.add("Anshul Bansal");
list.add("Arpit Sharma ,Monti ");

Iterator itr=list.iterator();

while(itr.hasNext()){

System.out.println(itr.next());
}

}
}