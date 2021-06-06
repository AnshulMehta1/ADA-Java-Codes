
package Algorepertoire;
import java.util.Scanner;
public class InsertionsortVar {
    static void  printA(int A[],int n){
        for(int i=0;i<n;i++){
        
            System.out.print(A[i]+" ");
        }
            System.out.println("");
        
        } 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[4]; 
        for(int k=0;k<4;k++){
            arr[k]=scanner.nextInt();
        }
          
        for (int i=1;i<4;i++) {  
            int key = arr[i];  
            int j = i-1;  
            while (j>=0 && arr[j] > key ) {  
                arr[j+1] = arr[j];  
                j--;  
            }  
            arr[j+1] = key;  
            printA(arr, i+1);
        }

    }
 }