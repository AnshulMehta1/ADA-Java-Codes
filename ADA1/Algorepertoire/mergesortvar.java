

package Algorepertoire;
import java.util.*;

import java.util.Arrays;

class mergesortvar { 
     
    public static int[] mergeS(int arr[], int beg, int mid, int end) { 
        // Find sizes of two subarrays to be merged 
        int size1 = mid - beg + 1; 
        int size2 = end - mid; 
  
        int leftArr[] = new int[size1]; 
        int rightArr[] = new int[size2]; 
  
        
        for (int i = 0; i < size1; i++) 
            leftArr[i] = arr[beg + i]; 
        for (int j = 0; j < size2; j++) 
            rightArr[j] = arr[mid + 1 + j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
        int temp[]=new int[rightArr.length+leftArr.length];
  
        // Initial index of merged subarry array 
        int k = 0; 
        while (i < size1 && j < size2) { 
            if (leftArr[i] <= rightArr[j]) { 
                temp[k++] = leftArr[i++]; 
                
            } 
            else { 
                temp[k++] = rightArr[j++]; 
                
            } 
            
        } 
  
        while (i < size1) { 
            temp[k++] = leftArr[i++];
        } 
  
        while (j < size2) { 
            temp[k++] = rightArr[j++]; 
             
        } 
        for(int p=0;p<temp.length;p++){
            System.out.print(temp[p]+" ");
        }
        System.out.println("");
        return temp;
    } 
  

    public static void sort(int arr[], int beg, int end) 
    { 
        if (beg<end) { 
            // Find the middle point 
            int mid = (beg + end) / 2; 
            
  
            // Sort first and second halves 
            sort(arr, beg, mid); 
            sort(arr, mid + 1, end); 
  
            // Merge the sorted halves 
            int temp[] = mergeS(arr, beg, mid,end); 
            
            System.arraycopy(temp, 0, arr, beg, temp.length);
        } 
    } 
  
    
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr1[] = {4,2,3,1}; 
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
  
         
    
  
        mergesortvar ms1 = new mergesortvar(); 
        ms1.sort(arr, 0, arr.length - 1); 
  
        
        
    } 
}