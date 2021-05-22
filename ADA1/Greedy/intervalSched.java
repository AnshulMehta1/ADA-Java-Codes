package Greedy;
import java.lang.*;
import java.util.*;






public class intervalSched {
    static class meeting {
        int Id;
        int startTime;
        int finishTime;
        meeting(int number, int sta, int fin){
            this.startTime=sta;
            this.finishTime=fin;
            this.Id=number;


        }
        @Override
        public String toString() {
            return this.Id +"  ";
        }


    }

    static class meet implements Comparator<meeting>{
        @Override

        public int compare (meeting a , meeting b){
            if (a.finishTime>b.finishTime)
                return 1;

            else if (a.finishTime<b.finishTime)
                return -1;

            else {
                if (a.startTime>b.startTime)
                    return 1;

                else if (a.startTime<b.startTime)
                    return -1;
                else
                    return 0;
            }
        }


    }

   
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            List<meeting> list =new ArrayList<meeting>();
            int n= sc.nextInt();
            int arr[] =new int[n];
            for (int i=0; i<n ; i++){
                arr[i]= sc.nextInt();

            }
            int arr2[] =new int[n];
            for (int i=0; i<n ; i++){
                arr2[i]= sc.nextInt();
                
            }

            for (int j=0; j<n; j++){
                list.add(new meeting(j+1, arr[j], arr2[j]));
            }

            Collections.sort(list,new meet());

            System.out.print(list.get(0));
            meeting meeting1=list.get(0);

            int previous =meeting1.finishTime;

            for (int k=1; k<n ; k++){
                meeting1=list.get(k);
                if (meeting1.startTime>previous){
                    System.out.println(meeting1);
                    previous=meeting1.finishTime;
                }

                System.out.println();

            }

        }

    }

    
}
