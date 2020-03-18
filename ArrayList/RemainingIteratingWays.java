
import java.util.*;

class RemainingIteratingWays{

public static void main(String args[])
{
ArrayList<String> list = new ArrayList<String>();


list.add("Ravi");
list.add("Akash");
list.add("Raju");


System.out.println("Traverse Through List Iterator");

ListIterator list1 = list.listIterator(list.size());

while(list1.hasPrevious()){

System.out.println(list1.previous());
}


//***************

System.out.println("Traverse Through Loop");
for(int i=0;i<list.size();i++){

System.out.println(list.get(i));
}

//***************

System.out.println("Traverse List throught ForEach Loop");


list.forEach(a->{

System.out.println(a);});


System.out.println("Traverse List Using forEachRemaining");

Iterator itr=list.iterator();
itr.forEachRemaining(a->{

System.out.println(a);
});


}
}