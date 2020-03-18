import java.io.*;
import java.util.*;
class PatternTriangle{
static int value;
 static void  makePattern(int num){
 


  for(int i=1;i<=num;i++){
     
        
      

    if( i%2==0 ){
     
      int temp=value;
     for(int k=1;k<=i;k++){
        
       
       System.out.print( temp-- +"*");

       } 
       value=temp+i+1;
     System.out.println();
      }
     else{
       
        if(i==1){

            System.out.println(i);   
              value=i+2;
         }
         else{
                 
            int  temp=value;
        for(int j=1;j<=i;j++){
        
        
        System.out.print(temp++ +"*");


         } 
        value=temp+i;
        System.out.println();
         }
      } 



     }   
  



}

public static void main(String ags[])
{

Scanner scan = new Scanner(System.in);

System.out.println("Enter the number for Pattern");
int num = scan.nextInt();

makePattern(num);

}

}