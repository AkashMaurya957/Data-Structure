
import java.util.*;
import java.io.*;


class AdjacenyListRepresentationGraph{

private Map<Integer,ArrayList<Integer>> adjListMap;

public AdjacenyListRepresentationGraph(int vertex){

    adjListMap = new HashMap<Integer,ArrayList<Integer>>();
       
    for(int i=1;i<=vertex;i++){
       
        ArrayList<Integer> neighbours = new ArrayList<Integer>();
        adjListMap.put(i,neighbours);
     }
 
   }



public void addEdge(int vertex,int weight){
  if(vertex > adjListMap.size() || weight > adjListMap.size()){
    
    return;

   }
  
    (adjListMap.get(vertex)).add(weight);
    (adjListMap.get(vertex)).add(weight);
 }


public ArrayList<Integer> getNeighbours(int v){

   if(v >adjListMap.size()){

   return null;
    }
  return new ArrayList<Integer>(adjListMap.get(v));

 }


public static void main(String args[]){

int count=1,des,source;

System.out.println("Enter the number of Vertex and Edges");
Scanner scan = new Scanner(System.in);


int num_vertex = scan.nextInt();
int num_Edges = scan.nextInt();

AdjacenyListRepresentationGraph adjList  = new AdjacenyListRepresentationGraph(num_vertex);
 
System.out.println("Enter the edges in <Source> <Destination> form");

while(count<=num_Edges){

  source = scan.nextInt();
  des = scan.nextInt();
  
   adjList.addEdge(source,des);

  count++;
  
  }

System.out.println("The given Adjacency List of the Graph");

  for(int i=1;i<=num_vertex;i++){

       System.out.print(i + "->");

    ArrayList<Integer> edgeList = adjList.getNeighbours(i);

    for(int j=1;;j++){

          if(j!=edgeList.size()){
          
              System.out.print(edgeList.get(j-1)+"->");
         
         }else{
 
            System.out.print(edgeList.get(j-1)); 


           }
     
     }

 //System.out.println();
   }

 
 }

}