// import java.util.*;
// import java.util.ArrayList;


// public  class MaxPriorityQueue extends MaxHeap implements MaxPriorityQueueIN { 

//     public MaxPriorityQueue(ArrayList<Integer> arr) {
//         super(arr);
//   }

//     public void AddElement(int x) {
//         heapArray.add(x);        
//         int i = heapArray.size() - 1; 
//     }

//     @Override
//     public int Maximum() {
//         if (heapArray.size() <= 0) {
//             return 0;
//         } else {
//             return heapArray.get(0);
//         }
//     }

//     @Override
//     public int  ExtractMax() {
        
//         if (heapArray.size() <= 0) {
//             return 0;
//         } 
//         else {
            
//             int maxVal = heapArray.get(0);
//             heapArray.set(0, heapArray.get(heapArray.size() - 1));
//             heapArray.remove(heapArray.size() - 1);
//             MaxHeapify(heapArray, 0);
//             return maxVal;
//         }
//     }

//     public void  KeyIncrease(int x, int key) {
//         heapArray.add(x);
//         int i = heapArray.size() - 1;
        
//         if (heapArray.get(i).compareTo(key) > 0) {
//             throw new IllegalArgumentException("The Key entered is larger than the original key");
//         }
        
//         heapArray.set(i, key);
        
//         while (i > 0 && heapArray.get(Parent(i)).compareTo(heapArray.get(i)) < 0) {
            
//             int pre=heapArray.get(i);
//             heapArray.set(i,heapArray.get(Parent(i)));
//             heapArray.set(heapArray.get(Parent(i)),pre);
//             i=Parent(i);
            
//         }
//     }

   

// }
