

import java.io.*;
import java.util.*;

class FindOccureneceWithoutHashMap{



static void  checkForOccurence(String str){
   
   
      
	 char[] key = new char[str.length()];
    
     char[] strArray = str.toCharArray();
	
	int count =0;
	
	for(int i=0;i<str.length();i++){
	
	   Character demo=  strArray[i];
	
	
	     for(int j=0;j<str.length();j++){
			 
			 
			if(demo==key[i]){
				
				
				System.out.print("found");
				break;
			} 
			 
		 }
		 
		 
		 key[i]=demo;
		 
		 
		 for(int k=0;k<str.length();k++){
			 
			 if(strArray[k]==demo)
			 {
				 
				  count++;
			 }
			 
		 }
		 
		 
		 System.out.println("Occurence of" + demo +" " +count);
		 
		 count=0;
	
	}



}

public static void main(String args[]){


 Scanner scan = new Scanner(System.in);
 
 String str = scan.nextLine();
 
 checkForOccurence(str);

}


}