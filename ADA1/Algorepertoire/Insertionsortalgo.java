package Algorepertoire;
import java.util.*;

public class Insertionsortalgo {
     void sort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j]>key){
                
                arr[j+1]=arr[j];
                j--;
        
            }
           
            arr[j+1]=key;
            for(int k=0;k<=i;k++){
                
                
                System.out.print(arr[k]+" ");
                
            }
            System.out.println("");
           
            

        }
    }
     
    public static void main(String args[]){
        
        Scanner sc=new Scanner (System.in);
        int arr[]= new int[4];
        System.out.println("Enter the elemnts");
        for (int p=0;p<4;p++){
            arr[p]=sc.nextInt();
        }
        Insertionsortalgo algo1=new Insertionsortalgo();
        algo1.sort(arr);
        
        
    
    }
    

    }
    


    