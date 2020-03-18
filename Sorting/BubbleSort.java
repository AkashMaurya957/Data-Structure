

// The worst case time complexcity is O(n*n) when list is in reverse order
// Best Case Time complexcity is O(n) when list is sorted

import java.util.*;
import java.io.*;


class BubbleSort{

static void bubbleSort(int arr[]){

 int len=arr.length;
  boolean swapped;
for(int i=0;i<len;i++){
    
   swapped=false;
 
   for(int j=0;j<len-i-1;j++){
    
     if(arr[j]>arr[j+1]){
      
       int temp=arr[j];
       arr[j]=arr[j+1];
       arr[j+1]=temp; 
       swapped=true;
     }
    
  }

    if(swapped==false)
     break;
  
}  


}


static void bubbleprint(int arr[])
{

int len = arr.length;

for(int i=0;i<len;i++){
System.out.print(arr[i] +" " );

}
}


public static void main(String args[]){


Scanner scan = new Scanner(System.in);


System.out.println("Enter the number of element you want to enter");
int n = scan.nextInt();

int[] arr = new int[n];

System.out.println("Enter your Elements");
for(int i=0;i<n;i++){
  
arr[i]=scan.nextInt();

}

bubbleSort(arr);
System.out.println("Sorted Array");
bubbleprint(arr);
} 


}