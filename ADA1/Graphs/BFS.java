
import java.util.*;
import java.io.*;


/*
BFS Theory
Breadth First Traversal (or Search) for a graph is similar to Breadth First Traversal of a tree
The only catch here is, unlike trees, graphs may contain cycles, so we may come to the same node again. 
To avoid processing a node more than once, we use a boolean visited array.
 For simplicity, it is assumed that all vertices are reachable from the starting vertex. 


*/

public class BFS {
    private int V;
    private LinkedList<Integer> adj[];

    // Constructor with initialization of vertices
     BFS(int v) {
         V=v;
         adj= new LinkedList[v];
         for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void bfsmethod (int s){
        boolean visited[]=new boolean[V];

        // Queue for BFs
        LinkedList<Integer> queue= new LinkedList<Integer>();
        
        // Mark node visited as true in the arr and add it to queue

        visited[s]=true;
        queue.add(s);

        while (queue.size()!=0){
            // Dequqe the vertex and Print 

            s=queue.poll();
            System.out.println(s+" ");
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n=i.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);

                }
            }

        }

    }
    public static void main(String args[])
    {
        BFS g = new BFS(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.bfsmethod(2);
    }

    
}
