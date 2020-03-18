
import java.io.*;
import java.util.*;


class FindOccurenceOfCharacter{


static void CheckOccurence(String str){
   
 
  HashMap<Character,Integer>  val = new HashMap<>();

   char[]  arr = str.toCharArray();

   for(char c:arr){
     
      if(val.containsKey(c)){
        
         val.put(c,val.get(c)+1);

       }
       else{

           val.put(c,1);

       }
         
     }

   for(Map.Entry occu:val.entrySet()){
  
         System.out.println(occu.getKey() +" " +occu.getValue());

    }
   

  }



  public static void main(String args[]){

   
  Scanner scan = new Scanner(System.in);
  
  String occu = scan.nextLine();

  
  CheckOccurence(occu);

 
  }


}