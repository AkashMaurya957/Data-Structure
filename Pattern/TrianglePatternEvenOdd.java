
import java.io.*;
import java.util.*;

class TrianglePatternEvenOdd{


static void printPattern(int n){

System.out.println(n);

int count =0,temp=0;

for(int i=1;i<=n;i++){

     for(int j=1;j<=i;j++){
        
		if(j==1 || j==i){
			
			System.out.print(1);
	
     	}else{
			
	        	 
				 System.out.print(temp);
				
                if(i%2==0){
					
				    if(j<i/2){
						
						temp+=2;
						
					}else{
						
						if(j>=i/2+1){
							
							temp-=2;
						}
						
					}	
					
				}else{
					
					
					if(j<=i/2){
						
					 temp+=2;
					 
					}else{
						
						temp-=2;
					
					}
					
				}					
				 
			
		}
		
		
		
     }
	 
	 count++;
	 
	 temp=count;
	 
	 System.out.println();

  }

}




public static void main(String args[]){


Scanner scan = new Scanner(System.in);

System.out.println("Enter the number for Print Pattern");
int num=scan.nextInt();

printPattern(num);

 
 }


}