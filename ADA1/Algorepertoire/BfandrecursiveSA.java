package Algorepertoire;
import java.util.logging.Logger;



import java.util.ArrayList;
import java.util.Random;
public class BfandrecursiveSA{
    /*



    */
    public int MaxSa(int[] arr){
        long starttime = System.currentTimeMillis();
        int l=arr.length;
        int MaxSaSum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        for (int i=0;i<l;i++){
            int Runningsum=0;
            for (int j=i;j<l;j++){
                Runningsum= Runningsum+arr[j];
                if (Runningsum>MaxSaSum)
                start=i;
                end=j;

            }
        }
        
        return MaxSaSum;
     
    }

    static int maxRunSum(int arr[],int l,int h,int m){
        
        int sum = 0;
        int ls = Integer.MIN_VALUE;
        for(int i=m;i>=l;i--){
            sum = sum + arr[i];
            if (sum > ls)
                ls = sum;
        }
         // same approach as in merge sort or evry DAC algo
         sum = 0;
         int rs = Integer.MIN_VALUE;
         for (int i = m + 1; i <= h; i++)
        {
            sum = sum + arr[i];
            if (sum > rs)
                rs = sum;
        }
            
        // returning only left_sum + right_sum will fail for [-2, 1]
        return Math.max(ls + rs, Math.max(ls, rs));
    
 

    }

    public int rMaxSubArray(int[] arr, int start, int end){
        //        long start = System.currentTimeMillis();
        if (start==end){
            return arr[start];


        }
        int mid=(start+end)/2;
        return Math.max(Math.max(rMaxSubArray(arr, start, mid),
                rMaxSubArray(arr, mid+1, end)),
                maxRunSum(arr, start, mid, end));

    }
    public static void main(String args[]){
        BfandrecursiveSA bf=new BfandrecursiveSA();
        int n=1;
        while(n<50){
            int a[]=new int [n];
            Random rand=new Random();
            for (int j=0;j<n;j++){
                a[j]=rand.nextInt(99);
            }
                long time1=0;// for brute force
                long time2=0;//fot recursiv
                long st=System.currentTimeMillis();
                bf.MaxSa(a);
                long et=System.currentTimeMillis();
                time1=et-st;

                st=System.currentTimeMillis();
                int p = bf.rMaxSubArray(a, 0, a.length-1);
                et=System.currentTimeMillis();
                time2 =et-st;
                if (time2<time1){
                    System.out.println(n);
                    break;
                }
                n++;
                
            }
            
        
        
        

        
    }

}