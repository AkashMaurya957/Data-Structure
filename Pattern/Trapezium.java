
import java.util.*;
import java.io.*;


class Trapezium{

public static void main(String ags[]){

Scanner scan = new Scanner(System.in);

System.out.println("Enter the number :");
int num = scan.nextInt();

int first=1;
int second=num*num+1;

for(int i=num;i>0;i--){



   for (int space = num; space > i; space--)          
                System.out.print(" "); 
  


  for(int j=i;j<num;j++){
      
     System.out.print(first);
     System.out.print("*");
     first++; 
     
  }

  for(int j=i;j<num;j++){
      
     System.out.print(second);
     if(j<i){
      System.out.print("*");
     }
    second++; 
     
  }
  
  second=second -(i*2)-1;
System.out.println();


}

}

}