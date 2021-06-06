// // Anshul Mehta
// import java.util.ArrayList;


// public class MinPriorityQueue extends MinHeap implements MinPriorityQueueIN {
       

//     public MinPriorityQueue(ArrayList<Integer> arr) {
//         super(arr);
        
        
//     }

//     @Override
//     public void Insert(int  x) {
//         array.add(x);
//          heap_size++;
//         //  int k=array.get(heap_size) ;
//         //  DecreaseKey(heap_size, k); ???
         
//     }

//     @Override
//     public int Minimum() {
//         return array.get(0);
        
    
//     }

//     @Override
//     public int ExtractMin() {
//          int min = array.get(0);
//          array.set(0, array.get(heap_size - 1)); 
//           // Move last to position 0
//          array.set(heap_size-1, min);
//          array.remove(array.size() - 1);
         
//          MinHeapify(array, 0);
//         return min;
        

//     }

//     @Override
//     public void DecreaseKey (int x, int k) {
       
//         int i = array.size() - 1;
//         array.set(i, k);
          
//         while (i > 0 && array.get(parent(i))>array.get(i) ) {
//             int pre=array.get(i);
//             array.set(i,array.get(parent(i)));
//             array.set(array.get(parent(i)),pre);
//             i=parent(i);

//         }
        
//     }

// }