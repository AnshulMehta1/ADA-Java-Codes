package Algorepertoire;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    void bubbleSort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]> arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }
           
        }
        
        

        
    }

    void Printarr(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main (String args[]){
        int arr[]=new int[5];
        Scanner sc= new Scanner (System.in);
        for (int k=0; k<5;k++){
            arr[k]=sc.nextInt();

        }
        BubbleSort bs=new BubbleSort();
         bs.bubbleSort(arr);
         bs.Printarr(arr);

        
    }
    
}