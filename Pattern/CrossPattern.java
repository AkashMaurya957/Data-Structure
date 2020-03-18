
import java.util.*;
import java.io.*;

class CrossPattern{

static int val; 


static void pattern(String str,char[] patstr){


int h = str.length()-1;

System.out.println("----------Pattern-----------\n");

  for(int j=0;j<str.length();j++){

  
    if(j<h){
       
       for(int t=0;t<j;t++){
         System.out.print(" ");
         }        

       System.out.print(patstr[j]); 
       for(int s=0;s<str.length()-j*2-2;s++){
         System.out.print(" ");
         }      
       
          System.out.println(patstr[h]); 
       h--;
     }     
    
    if(j==h){
    
      for(int t=0;t<j;t++){
         System.out.print(" ");
         }        

       System.out.println(patstr[j]);


     
     }
    
  
   

if(j>h){
      
       for(int t=0;t<str.length()-j-1;t++){
         System.out.print(" ");
         }        
          
            h--;

       System.out.print(patstr[h]); 

       for(int s=0;s<j*2 - str.length();s++){
         System.out.print(" ");
         }      
       
          System.out.println(patstr[j]); 


       
     }     
   

   
   }


}


public static void main(String args[]){

Scanner scan = new Scanner(System.in);

System.out.println("Enter String for Draw Pattern : ");
String str = scan.nextLine();

System.out.println();

char[] patstr = new char[str.length()];


for(int i=0;i<str.length();i++){
 
 patstr[i] = str.charAt(i);


}

int num=str.length();
if(num%2!=0){

pattern(str,patstr);

}else{

System.out.println("Please Enter a Odd Number String");
}

}

}