import java.io.*;
class Insertion{
 private int num; //number of elements
 private int[] arr; //stores array of elements
 public static void main(String[] args){
 Insertion x=new Insertion();
 x.insert();
 }
 
 public void insert(){
 int pos; //postion of the key element
 int key; //key element
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 try{
 System.out.print("Enter total no. of numbers: ");
 num=Integer.parseInt(br.readLine());
 arr=new int[num];
 System.out.println("Enter the numbers: ");
 for(int i=0;i<num;i++){
 System.out.print("Enter number "+i+": ");
 arr[i]=Integer.parseInt(br.readLine());
 }
 }catch(IOException e){
 e.printStackTrace();
 }
 //insertion sort
 for(int i=1;i<num;i++){
 key=arr[i];
 pos=binarySearch(0,i-1,key); //finds where the element will be stored
 for(int j=i;j>pos;j--) //shifts the other elements by 1 position to the right
 arr[j]=arr[j-1];
 arr[pos]=key; //places the key element in the pos position
 }
 
 //printing the elements
 for(int i=0;i<num;i++)
 System.out.println(i+" : "+arr[i]);
 }
 //uses binary search technique to find the position where the element will be inserted
 public int binarySearch(int low,int high,int key){
 int mid;
 while(low<=high){
 mid=(low+high)/2;
 if(key>arr[mid])
 low=mid+1;
 else if(key<arr[mid])
 high=mid-1;
 else
 return mid;
 }
 return low;
 }
}