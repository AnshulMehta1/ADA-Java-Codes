
package PetrolPumpSim;
import java.util.*;

public class PetrolPump {
    
    
    public static void main(String[] args) {
        Random rd = new Random();
        int NoofAttendanst=4;
        int maxCustMin =5;
        int maxServiceTime=4;
        double totTime=0;
        
        int day=1440; // as it is open 24 hours 
        double MaxWaitingTime=0;
        double CurrWait=0;
        double totCustomer=0;

        int[] attendant = new int[NoofAttendanst];
        for(int i=0;i<NoofAttendanst;i++){
            attendant[i]=0;
        }
        Genq<Integer> queueCustomer = new Genq<Integer>();

        

        for(int t=1;t<day;t++){
           
        
        
        for(int i=0;i<attendant.length;i++){
            if(attendant[i]>0){
                attendant[i]--;
            }
        }

        int customer = rd.nextInt(maxCustMin); // Done
       

        for(int i=0;i<customer;i++){
            int x=rd.nextInt(maxServiceTime);
            queueCustomer.enqueue(x);
            CurrWait+=x;
            totTime+=CurrWait;
            
        }
        
        for(int i=0;i<attendant.length && !(queueCustomer.empty());i++){
            if(attendant[i]==0){
                int p=queueCustomer.dequeue();
                attendant[i]+=p;
                CurrWait-=p;
               totTime-=CurrWait;
            }
        }
         totCustomer+=customer;
         
        //  System.out.println("The current Waiting time for hour"+" "+t+" is "+CurrWait);
    
// Done


     
        if(MaxWaitingTime<CurrWait){
            MaxWaitingTime= CurrWait;
            
            }
        }
        System.out.println("For max waiting time is :" + MaxWaitingTime);
        double avgWait=totTime/totCustomer;
        
        System.out.println("The averege waiting time per customer "+avgWait);
        System.out.println("The numbers of customers"+totCustomer);
        
        // double MinutesServed= totTime*n; // approximaely 
        // System.out.println("The minutes petrol pump atendants were in service approximately"+MinutesServed);
        
        }
}