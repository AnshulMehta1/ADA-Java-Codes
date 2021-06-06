package PetrolPumpSim;
import java.util.Queue;
import java.util.Random;

public class PetrolPumpSimulation {
    static Random rd= new Random();
    public static void main(String args[]){
        int noOfattendants=4;
        int maxCustPerMin=4;
        int serviceTime=4;
        int day=12;
        int TotTime=0;

        int maxWait=0;
        int currWait=0;
        
        

        Integer[] attendants = new Integer [noOfattendants];
        for (int i=0;i<noOfattendants;i++){
            attendants[i]=0;

        }
        Genq<Integer> queuec = new Genq<Integer>();
        int t=1;


          for ( t =1;t<day;t++){
               System.out.println(t);
              
            for(int i=0;i<attendants.length;i++){
                if(attendants[i]>0){
                    attendants[i]--;
               }
             }
             int customers=rd.nextInt(maxCustPerMin);
             for (int j=0; j<customers;j++){
                int x=rd.nextInt(serviceTime);
   
               queuec.enqueue(x);
               currWait+=x;
               TotTime+=currWait;
                System.out.println(currWait);
            }
            for (int i=0;i<attendants.length && !(queuec.empty());i++){
                if (attendants[i]==0){
                    int x= queuec.dequeue();
                    attendants[i]+=x;
                    currWait-=x;
                }
               
            }
            System.out.println(currWait);
            int avgWait=TotTime/customers;
             if (currWait>maxWait){
                 maxWait=currWait;


                }
             
          }
        // for (int i=0;i<attendants.length;i++){
        //     if (attendants[i]>0)
        //     attendants[i]--;

        
        System.out.println("The number of attendant is"+attendants.length);
        System.out.println("The maximum waiting time is "+maxWait);

    }

    
}

