package PetrolPumpSim;
import java.util.*;

public class project3 {

    public static void main(String[] args) {
        Random rd = new Random();
        int servers=4;
        int max_customers_per_min=3;
        int max_time_per_service=4;
        int break_time=300;
        int service_center_closing_time=660;
        int max_time_wait_shift1=0;
        int current_waiting_time=0;
        float total_waiting_time_shift1=0,total_customers_shift1=0,total_waiting_time_shift2=0,total_customers_shift2=0;
        int server[] = new int[servers];
        for(int i=0;i<servers;i++){
            server[i]=0;
        }
        Genq<Integer> q1 = new Genq<Integer>();

        System.out.println("The waiting time is from 8:00 to 13:00.");

        for(int t=1;t<break_time;t++) {

            //System.out.println("Current Time is " + t);

            for (int i = 0; i < server.length; i++) {
                if (server[i] > 0) {
                    server[i]--;
                }
            }

            int customers = rd.nextInt(max_customers_per_min-1)+1;

            for (int i = 0; i < customers; i++) {
                int y = rd.nextInt(max_time_per_service-1)+1;
                q1.enqueue(y);
                current_waiting_time += y;
            }
            for (int i = 0; i < server.length && !(q1.empty()); i++) {
                if (server[i] == 0) {
                    int x = q1.dequeue();
                    server[i] += x;
                    current_waiting_time -= x;
                }
            }
            total_waiting_time_shift1+=current_waiting_time;
            total_customers_shift1+=customers;

            //System.out.println("Current waiting time  : " + current_waiting_time);
            if (max_time_wait_shift1 < current_waiting_time) {
                max_time_wait_shift1 = current_waiting_time;
            }
        }
        System.out.println("Average Waiting time is "+total_waiting_time_shift1/total_customers_shift1+" minutes.");
        System.out.println("Maximum waiting time in the morning shift is " + max_time_wait_shift1+" minutes.");


        System.out.println("\n Break of 60 minuties...  \n");
        int max_time_wait_shift2=0;
        
        System.out.println("The waiting time is from 14:00 to 20:00.");

        for(int t=break_time+60;t<service_center_closing_time;t++){
            
         //   System.out.println("Time is t   " + t);
            
            for(int i=0;i<server.length;i++){
                if(server[i]>0){
                    server[i]--;
                }
            }
    
            int customers = rd.nextInt(max_customers_per_min-1)+1;
    
            for(int i=0;i<customers;i++){
                int x=rd.nextInt(max_time_per_service-1)+1;
                q1.enqueue(x);
                current_waiting_time+=x;
            }
            for(int i=0;i<server.length && !(q1.empty());i++){
                if(server[i]==0){
                    int x=q1.dequeue();
                    server[i]+=x;
                    current_waiting_time-=x;
                }
            }
            total_waiting_time_shift2+=current_waiting_time;
            total_customers_shift2+=customers;
    
           // System.out.println("Current waiting time  : " + current_waiting_time);
            if(max_time_wait_shift2<current_waiting_time){
                max_time_wait_shift2= current_waiting_time;
                }
            }
            System.out.println("Average waiting time is "+total_waiting_time_shift2/total_customers_shift2+" minutes.");
            System.out.println("Maximum waiting time in the afternoon and evening shift was " + max_time_wait_shift2+" minutes.");
            int max_wait_time_total=0;
            if(max_time_wait_shift2>max_time_wait_shift1)
                max_wait_time_total=max_time_wait_shift2;
            else   
                max_wait_time_total=max_time_wait_shift1;

            System.out.println("\n The maximum waiting time from both the shifts was " + max_wait_time_total + " minutes.");
        }
}