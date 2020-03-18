
import java.io.*;
import java.util.*;

class Substring{

static void checkSub(String str,String substr){

  boolean check = str.contains(substr);
   
  if(check){
   
   System.out.println("Found SubString");  
 
  }else{

   System.out.println("Not Found");   
 }

}


public static void main(String args[]){

Scanner scan  = new Scanner(System.in);

System.out.println("Enter the String");
String str = scan.nextLine();


System.out.println("Enter the String for substring");
String strsub = scan.nextLine();

checkSub(str,strsub);

}

}