
//Worst case Time Complexcity  O(n*n)  when the element are in reverse order

//Best case Time Complexcity O(n) when the element are already sorted 


import java.io.*;
import java.util.*;

class InsertionSort{

// Function for sorting array

void sort(int arr[]){

int len = arr.length;

for(int i=1;i<len;i++){
    
  int key = arr[i];
  int j=i-1;
  
   while(j>=0 && arr[j]>key){
     
     arr[j+1] =arr[j];
     j=j-1;
    
   }
   
   arr[j+1]= key;
   
}

}

static void printArray(int arr[]){

  int len = arr.length;
  for(int i=0;i<len;i++){
   
   System.out.print(arr[i] + " ");
  }

}

public static void main(String args[]){


Scanner scan = new Scanner(System.in);

System.out.println("Enter the number you want to enter for sorting");
int num = scan.nextInt();

int[] arr = new int[num];

for(int u=0;u<num;u++){

arr[u] = scan.nextInt();
}

InsertionSort obj = new InsertionSort();

obj.sort(arr);

System.out.println("The Sorted Array Is :");

printArray(arr);

}

}