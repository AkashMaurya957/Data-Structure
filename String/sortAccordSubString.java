

import java.io.*;
import java.util.*;

class sortAccordSubString{

public static void sortString(String str[],int count){

Arrays.sort(str,new Comparator<String>z{

   public int compare(String s1 , String s2){

   return Integer.compare(s1.length(),s2.length());
   } 

 });


for (int i = 0; i < count; i++) { 
      if (!str[i + 1].contains(str[i])) { 
  
        
            if(str[i].compareTo(str[j])>0) {
               String temp = str[i];
               str[i] = str[j];
               str[j] = temp;
            }

        } 


}


public static void main(String args[]){

Scanner scan = new Scanner(System.in);

System.out.println("Number of String you want to enter");
int count  = scan.nextInt();

System.out.println("Enter the string one by one : ");
String str[] = new String[count]; 

for(int i=0;i<count;i++){

str[i] = scan.nextLine();

}


sortString(str,count);

}

}