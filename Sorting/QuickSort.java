

import java.io.*;
import java.util.*;


class QuickSort{


int Partition(int arr[],int low,int high){

   int pivot =  arr[high];
   int i=low-1;
   for(int j=low;j<=high;j++){

           if(arr[j]<arr[pivot]){
       
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                    
    
            }
 
    }
  
          int temp = arr[i+1];
          arr[i+1] = arr[high];
          arr[high] = temp;
   
      return i+1;            
}

void sort(int arr[],int low,int high){

   if(low<high){
     
     int partIndex=Partition(arr,low,high);
   
      sort(arr,low,partIndex-1);
      sort(arr,partIndex+1,high);
   }

}


static void PrintArray(int arr[]){

int len =  arr.length;
for(int i=0;i<len;i++){
  
System.out.print(arr[i] + " ");

 }

}


public static void main(String args[]){

Scanner scan = new Scanner(System.in);

System.out.println("Enter the number of element yout want to Sort : ");

int num = scan.nextInt();

int[] arr = new int[num];

for(int i=0;i<num;i++){
 
  arr[i]=scan.nextInt();
  

  }

QuickSort ob = new QuickSort();

ob.sort(arr,0,num-1);
System.out.println("Sorted Array : ");
PrintArray(arr);

}

}