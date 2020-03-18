
//Time Complexcity is O(n*n)

// The best part of this algo it never make more than O(n) swaps


import java.io.*;
import java.util.*;

class SelectionSort{

static void selectionSort(int arr[]){

int len = arr.length;

for(int i=0;i<len;i++){
   
    int min_index=i;
    for(int j=i+1;j<len;j++){
      
         if(arr[j]<arr[min_index]){
             
             min_index=j;   

           }
      

     }

     int temp = arr[min_index];
     arr[min_index]=arr[i];
     arr[i]=temp;

}

}

static void printSort(int arr[]){

int len = arr.length;
for(int i=0;i<len;i++){

System.out.print(arr[i] + " ");
}

}


public static void main(String args[]){


Scanner scan = new Scanner(System.in);

System.out.println("Enter the number of element you want to enter for sorting");
int num = scan.nextInt();

int[] arr = new int[num];

for(int i=0;i<num;i++){

arr[i] = scan.nextInt();

}

selectionSort(arr);
System.out.println("Sorted ArrayList Is:");

printSort(arr);

}


}