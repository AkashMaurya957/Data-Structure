
import java.io.*;
import java.util.*;

class subStringWithoutContain{

public static void checkSub(String str,String substr){

int M=substr.length();

int res = 0;

for(int i=0;i<str.length();i++){
    
    int j;
    for(j=0;j<substr.length();j++){
       
        if(str.charAt(i+j)!=substr.charAt(j)){
           
           break;
         }   
   
    }
     
   if(j==M){
      res++;
     j=0;
    }

}

if(res>0){
System.out.println("Sub String found");

System.out.println("Count : "+res);

}
else{
System.out.println("Sub String Not found !!!");
}

}

public static void main(String args[]){

Scanner scan = new Scanner(System.in);

System.out.println("Enter the string");
String str = scan.nextLine();

System.out.println("Enter the string for check subString");
String substr = scan.nextLine();

checkSub(str,substr);

}

}