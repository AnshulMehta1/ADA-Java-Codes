/* Implementation of the Number of Shirtest Paths from Source to Destination in Java
Group H
Question 10
*/

import java.util.*; 

class ShortestPaths
{ 

// The main Idea behind number of shortest Paths is BFS
	static void BFS(Vector<Integer>[] adj, int source,int dest, int dist[], int paths[], int n) 
	// We will take an array called dist and will initialize all it’s elements 
	//to infinity except for the source as a node’s distance with oneself =0
	// Paths[] array is initalixed to all 0's except source as node has a shortest path to itself
	// Size of Arrays=n
	{ 
		boolean[] vis = new boolean[n]; 
		for (int i = 0; i < n; i++) 
			vis[i] = false; 
// Initialize the vis to false as all adjacent node initially un visites			
		dist[source] = 0; // dist to itself=0
		paths[source] = 1;  // There is always a shortest osth to itself

		Queue<Integer> queue1 = new LinkedList<>(); 
		queue1.add(source); 
		vis[source] = true; 
		while (!queue1.isEmpty()) 
		{ 
			int curr = queue1.peek(); 
			queue1.poll(); // Retrvies the Top Most elements

	// For the neighbors of curr 
			for (int x : adj[curr]) // : Used to iterate over a set 
			{ 

// Unvisited array , add it to the Q and then mark it visited
				if (vis[x] == false) 
				{ 
					queue1.add(x); 
					vis[x] = true; 
				} 

				// check if there is a better path. 
				if (dist[x] > dist[curr] + 1) 
				{ 
					dist[x] = dist[curr] + 1; // Update dist 
					paths[x] = paths[curr];  // Update Paths
				} 

				// additional shortest paths found 
				else if (dist[x] == dist[curr] + 1) 
					paths[x] += paths[curr];  // Update Paths 
			} 
		} 
	} 

	

	// Main Function to Find the Shortest Paths
	// Here arrays are initalized and the the Modified BFS is called

	static void findShortestPaths(Vector<Integer> adj[], int s,int d, int n) 
	{ 
		int dist[] = new int[n];
		int paths[] = new int[n]; 
		
		for (int i = 0; i < n; i++) 
			dist[i] = Integer.MAX_VALUE; 

		for (int j = 0; j < n; j++) 
			paths[j] = 0; 

		BFS(adj, s,d, dist, paths, n); 

		System.out.println("Numbers of shortest Paths are: "); 
	
		System.out.println(paths[d]); 
	}
	 


	static void AddEdge(Vector<Integer> adj[], int u, int v) 
	{ 
		adj[u].add(v);
		adj[v].add(u); 
	} 

// Method that adds all edged from source to des 

// This method of addEdge add two edges from v to u and u to v making it an undirected Graph Finally

	// Main Method + Test Cases 
	public static void main(String[] args) 
	{ 
		// Test Case 1 
		int n = 6; // Number of vertices 

		Vector<Integer>[] adj = new Vector[n]; 
			for (int i = 0; i < n; i++) 
				adj[i] = new Vector<>(); 


		AddEdge(adj, 0, 1);
	
        AddEdge(adj, 2, 3);
		
		AddEdge(adj, 2, 1);
       
        AddEdge(adj, 2, 4);

        AddEdge(adj, 4, 3);
	
        AddEdge(adj, 3, 1);
	
        AddEdge(adj, 0, 5);
	
		AddEdge(adj, 5, 2);
		
		findShortestPaths(adj, 0 ,2, 6); 


		// Test Case 2 
		int n2=13;
		Vector<Integer>[] adj2 = new Vector[n2]; 
			for (int i = 0; i < n2; i++) 
				adj2[i] = new Vector<>(); 
		
		AddEdge(adj2,0, 1);
        AddEdge(adj2,0, 2);
        AddEdge(adj2,0, 3);
        AddEdge(adj2,1, 4);
        AddEdge(adj2,1, 5);
        AddEdge(adj2,1, 6);
        AddEdge(adj2,2, 7);
        AddEdge(adj2,2, 8);
        AddEdge(adj2,2, 9);
        AddEdge(adj2,3, 10);
        AddEdge(adj2,3, 11);
        AddEdge(adj2,3, 12);

		findShortestPaths(adj2,0,2,13);


		// Test Case 3
		int n3=6;
		Vector<Integer>[] adj3 = new Vector[n3]; 
			for (int i = 0; i < n3; i++) 
				adj3[i] = new Vector<>(); 
		

		
		AddEdge(adj3, 0, 1);
		AddEdge(adj3, 0, 2);
		AddEdge(adj3, 1, 3);
		AddEdge(adj3, 1, 4);
		AddEdge(adj3, 2, 3);
		AddEdge(adj3, 3, 5);
		AddEdge(adj3, 4, 5);	

		findShortestPaths(adj3,0,5,6);



	} 
} 

