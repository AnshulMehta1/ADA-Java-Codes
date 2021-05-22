
import java.util.*;

public class GraphGeneric {


    

    static class Graph <T> {

        
        HashMap<T, LinkedList<T>> verticeMap = new HashMap();
        // Hasmaps with LinkedList for adjacency List 
        HashMap<T, Integer> indexes = new HashMap<>();
        // Hashmap for maintaining index
        int index = -1;

        public Graph(ArrayList<T> vertices) {

            // Constructor
            for (int i = 0; i < vertices.size(); i++) {
                T vertex = vertices.get(i);
                LinkedList<T> list = new LinkedList<>();
                // New LinkedList for new nodes as each require an adjacency list
                verticeMap.put(vertex, list);
                indexes.put(vertex, ++index);
            }
        }

        public void addEdge(T source, T dest) { 
            // Method 
            
            LinkedList<T> list;
            list = verticeMap.get(source);
            list.addFirst(dest);

            // Connecting source and Dest
            verticeMap.put(source, list);
        }

        
        void delEdge(T source, T dest){
            // Method to delete the edge 
            LinkedList<T> list1;
            LinkedList<T> list2;
            list1= verticeMap.get(source);
            list2= verticeMap.get(dest);
            // Banne source ne dest ni list trarse karine delete karvani che value

            for (int j=0; j<list1.size();j++){
                if (list1.get(j)==source){
                    list1.remove(j);
                    break;

                // Iterate the adjaceny list delete the value from the adjacency list

                }
            }

            for (int k=0; k<list1.size();k++){
                if (list1.get(k)==dest){
                    list1.remove(k);
                    break;
                     // Iterate the adjaceny list delete the value from the adjacency list

                }
            }



        }
        public void delVertex(T vertex){
            verticeMap.remove(vertex);
            // Remove the vertex using Remove method of Hashmap

            indexes.remove(vertex);

            Set<T> set = verticeMap.keySet();

            // Iterable of map to traverse the map through set iterable methods

            Iterator<T> iterator = set.iterator();

            while(iterator.hasNext()){
                // v here is an connected vertice of the vertice that needs to be removes
                T v = iterator.next();
                LinkedList<T> list = verticeMap.get(v);
                // adjacency list for the 

                for (int i = 0; i <list.size() ; i++) {
                    if(list.contains(vertex))
                        list.remove(vertex);
                        // Removing the edge from the list if there exists an connection between the
                        // node to be removed and the node that connectd to it 
                }
            }

           
        }


        public void showGraph() {

            // Genric set to facilitate iterable 
            Set<T> set = verticeMap.keySet();
            Iterator<T> iterator = set.iterator();

            while(iterator.hasNext()){
                T vertex = iterator.next();
                
                System.out.print( vertex );
                LinkedList<T> list = verticeMap.get(vertex);
                for (int i = 0; i <list.size() ; i++) {
                    System.out.print("   "+list.get(i) );
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]) {


// Test - Case 1
        ArrayList<Object> vertices = new ArrayList<>();
        vertices.add(1);
        vertices.add(2);
        vertices.add(3);
        vertices.add(4);
        vertices.add(5);
        vertices.add(6);


        Graph testGraph1 = new Graph(vertices);

        testGraph1.addEdge(1, 2);
        testGraph1.addEdge(2, 3);
        testGraph1.addEdge(3, 4);
        testGraph1.addEdge(4, 1);
        testGraph1.addEdge(4, 5);
        testGraph1.addEdge(6, 3);
        testGraph1.addEdge(4, 2);
        testGraph1.addEdge(6, 5);
        testGraph1.addEdge(6, 1);
        testGraph1.addEdge(5, 4);

// The dist[] array as described in the docs initialized to Infinity except source =0
// The paths[] arrays stores number of paths is initalized with 0s except source=1
// They
        testGraph1.showGraph();
        testGraph1.delVertex(3);
        System.out.println("After deleting an vertex ");
       
        
        testGraph1.showGraph();

        System.out.println("After deleting an edge");
         testGraph1.delEdge(4, 1);
         testGraph1.delEdge(4, 2);
         testGraph1.showGraph();
         System.out.println();
         System.out.println();


// Test Case 2
         
 
        




    }
}