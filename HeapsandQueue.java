import java.util.ArrayList;



import java.util.*;
//Anshul Mehta
public class CompleteImplementation2 {
    public class Heap{
        // 0th Program
        protected ArrayList<Integer> array = new ArrayList<Integer>();
        protected int heap_size;
        // Methods
        public int parent(int i){
            return i/2;
        }
        public int leftC(int i){
            // returns left Child
            return 2*i;
        }
        public int rightC(int i){
            // Returns right Child
            return 2*i+1;
        }


    }
    public class MaxHeap extends Heap {

        public MaxHeap(ArrayList<Integer> arr) {
           
            array = arr;
            heap_size = array.size();
            BuildMaxHeap(array);
            //another way to do this
            // Heap = new int[this.heap_size + 1]; 
            // Heap[0] = Integer.MIN_VALUE; 
            
        }
            
        public void BuildMaxHeap(ArrayList<Integer> arr) {
            System.out.println("Building Max Heap");
            int start=heap_size/2-1;
            for(int i= start; i >= 0; i--) {
                
                MaxHeapify(arr,i);
                }
            
        }
        
        public void MaxHeapify(ArrayList<Integer> arr, int i) {
            int largest =i;
            int l1=leftC(i);
            int r1=rightC(i);
            // There was some mention of 1 and i in l but let's see this should also work instead of the one wriiteen before
            if ((l1 <= heap_size) && (l1>0)) {
                if (arr.get(l1)>arr.get(largest)) {
                  largest = l1;
                }
              }
          
              if ((r1 <= heap_size && (r1>0))) {
                if (arr.get(r1)>arr.get(largest)) {
                  largest = 1;
                }
              }
            
            
            if (largest!=i){
                int temp=arr.get(i);
                arr.set(i, arr.get(largest));
                arr.set(largest, temp);
                MaxHeapify(arr, largest);

            }
            
            
        }
        
        
        
    }
    public class MinHeap extends Heap {

	   public MinHeap(ArrayList<Integer> arr) {
            
            array = arr;
            heap_size = array.size();
            BuildMinHeap(array);
            //another way to do this
            // Heap = new int[this.heap_size + 1]; 
            // Heap[0] = Integer.MIN_VALUE; 
            
        }
            
        public void BuildMinHeap(ArrayList<Integer> arr) {
            System.out.println("Building Minimum Heap");
            heap_size = array.size();
            int start=heap_size/2-1;
            for(int i= start; i >= 0; i--) {
                
                MinHeapify(arr,i);
                }
        }
        
        public void MinHeapify(ArrayList<Integer> arr, int i) {
            int l=leftC(i);
            int r= rightC(i);
            int smallest=i;
            if (l<=heap_size && l>0){
                if (arr.get(l) <arr.get(smallest)){
                    smallest=l;
                }
            }
            if (r<=heap_size && r>0){
                if (arr.get(r)<arr.get(smallest)){
                    smallest=r;
                }
            }
            if (smallest!=i){
                // swap a[i] with a[smallest]
                Integer temp=arr.get(i);
                arr.set(i, arr.get(smallest));
                arr.set(smallest, temp);
                MinHeapify(arr, smallest);

            }
        }
        
            
    }
    public class MaxPriorityQueue extends MaxHeap implements MaxPriorityQueueIN {

        public MaxPriorityQueue(ArrayList<Integer> arr) {
            
            super(arr);
        }
    
        @Override
        public void Insert(int x) {
             heap_size++;
            //  k=arr.get(heap_size) ;
            //  IncreaseKey( heapSize, k);
           
            
        }
    
        @Override
        public int Maximum() {
            
             int  max= array.get(1);
             return max;
            
        }
    
        @Override
        public int ExtractMax() {
              int maxm = array.get(1);
               array.get(1)=array.get(heap_size);
              heap_size--;
              MaxHeapify(array, 1);
             return maxm;
            

        }
    
        @Override
        public void IncreaseKey(int i, int k) {
        //     array.get(i) = k;
           while((i>1) && (array.parent(i) < array.get(i))) {
               int temp;
        //        temp = arr.parent(i);
        //        array.parent(i)= arr.get(i);
        // //         
        //       array.get(i)= temp;
        //       i = array.parent(i);
      
            
        }
        
    
    
    }
    public class MinPriorityQueue extends MinHeap implements MinPriorityQueueIN {
       

        public MinPriorityQueue(ArrayList<Integer> arr) {
            super(arr);
            
            
        }
    
        @Override
        public void Insert(int  x) {
             heap_size++;
            // array.get(heap_size) = 10000;
            //  DecreaseKey(heap_size, k);
            
        }
    
        @Override
        public int Minimum() {
            return array.get(1);
            
        
        }
    
        @Override
        public int ExtractMin() {
            // int min = arr.get(1);
            // arr.get(1) = arr.get(heap_size);
            // heap_size--;
            // MinHeapify(arr, 1);
            // return min;
            
            return 0;
        }
    
        @Override
        public void DecreaseKey (int i, int k) {
            // arr.get(i) = key;
            // while((i>1) && (arr.parent(i) > arr.get(i))) {
            //    temp = arr.parent(i);
            //    arr.parent(i)= arr.get(i);         
           //      arr.get(i)= temp;
            //     
            //     i = parent(i);
            // }
            
        }
    
    }
    public interface MaxPriorityQueueIN  {
	
        public void Insert(int x);
        public int Maximum();
        public int ExtractMax();
        public void IncreaseKey(int x, int k);
        
    }
    public interface MinPriorityQueueIN {
	
        public void Insert(int x);
        public int Minimum();
        public int ExtractMin();
        public void DecreaseKey(int x, int k);
    
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);





        sc.close();
    }
    
    
        

        
    
}
