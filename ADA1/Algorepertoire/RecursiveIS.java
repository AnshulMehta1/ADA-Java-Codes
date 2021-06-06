
package Algorepertoire;
import java.util.Arrays;

public class RecursiveIS {
    static void recurseIS(int arr[], int n){
        // Base Case
        if (n<=1){
            return ;
        }
        recurseIS(arr, n-1);
        
        int last= arr[n-1];
        int j= n-2;
        while (j>0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;


    }
    public static void main(String[] args){
        int arr1[]= {1,99,76,45,23,34,2,12,65,77,88,23,333} ;
        recurseIS(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println("I'm Going to get admission in IIM-I IPM Entry Batch 2020, Yo");
    }
    
    
}