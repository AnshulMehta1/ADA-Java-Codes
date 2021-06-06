// //Anshul Mehta
// import java.util.*;

// public class MinHeap extends Heap {

//     public MinHeap(ArrayList<Integer> arr) {
         
//          array = arr;
         
//          BuildMinHeap(array);
//          //another way to do this
//          // Heap = new int[this.heap_size + 1]; 
//          // Heap[0] = Integer.MIN_VALUE; 
         
//      }
         
//      public void BuildMinHeap(ArrayList<Integer> arr) {
//          heap_size = array.size();
//          System.out.println("Building Minimum Heap");
//          heap_size = array.size();
//         //  int start=heap_size/2-1;
//         for(int i=Math.floorDiv(arr.size()-2,2);i>=0;i--) {
             
//              MinHeapify(arr,i);
//              }
//      }
     
//      public void MinHeapify(ArrayList<Integer> arr, int i) {
//          int l=leftC(i);
//          int r= rightC(i);
//          int smallest=i;
//          if (l<=heap_size && l>0){
//              if (arr.get(l) <arr.get(smallest)){
//                  smallest=l;
//              }
//          }
//          if (r<=heap_size && r>0){
//              if (arr.get(r)<arr.get(smallest)){
//                  smallest=r;
//              }
//          }
//          if (smallest!=i){
//              // swap a[i] with a[smallest]
//              Integer temp=arr.get(i);
//              arr.set(i, arr.get(smallest));
//              arr.set(smallest, temp);
//              MinHeapify(arr, smallest);

//          }
//      }
//      public void show(){
//         System.out.println("Printing Maxheap");
//         for (int k=0;k<heap_size;k++){
//           System.out.println(array.get(k)+"");
//         }
  
  
//       }
      
      
     
         
//  }