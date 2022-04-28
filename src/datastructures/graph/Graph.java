package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
      return false;
    }

   public void printGraph(){
       System.out.println(adjList);
   }

    public boolean addEdge(String vertexOne, String vertexTwo) {
        if (adjList.get(vertexOne) != null && adjList.get(vertexTwo) != null) {
            adjList.get(vertexOne).add(vertexTwo);
            adjList.get(vertexTwo).add(vertexOne);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertexOne, String vertexTwo) {
        if (adjList.get(vertexOne) != null && adjList.get(vertexTwo) != null) {
            adjList.get(vertexOne).remove(vertexTwo);
            adjList.get(vertexTwo).remove(vertexOne);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) return false;
        for(String otherVertex : adjList.get(vertex)){
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

}
