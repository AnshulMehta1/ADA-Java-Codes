// Anshul Mehta
// import java.util.ArrayList;
// import java.util.ArrayList;

// public class MaxHeap extends Heap<Integer> {

// public MaxHeap(ArrayList<Integer> arr) {
// 	heapArray = arr;
// 	BuildMaxHeap(arr);
	
// }
	
// public void BuildMaxHeap(ArrayList<Integer> arr) {
// 	 HeapSize=arr.size();
//         for (int i=Math.floorDiv(arr.size()-2,2);i>=0;i--) { 
//             MaxHeapify(arr,i);
//         } 
//     }


// public void MaxHeapify(ArrayList<Integer> arr, int i) {
   
//         int l=Left(i);
//         int r=Right(i);
//         int largest;

//         if (l <= heapArray.size()-1 && heapArray.get(l).compareTo(heapArray.get(i)) > 0){
// 			largest = l; 
//         }
//         else{
//             largest=i;
//         }
//         if (r <= arr.size()-1 && arr.get(r).compareTo(arr.get(largest))>0 ){
// 			largest = r;
//         }
//         if(largest != i){
//             int pre=arr.get(i);
//             arr.set(i,arr.get(largest) );
//             arr.set(largest,pre);
        
//         MaxHeapify(arr,largest);
//         }
// }
// }
