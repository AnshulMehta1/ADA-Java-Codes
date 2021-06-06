package StackAssignment;

import java.util.*;
// Anshul Mehta
import java.util.Stack; 
import java.util.Random;
public class AddStack {
    // Method for calculating the sum of two numbers using Stack
    static Stack<Integer> add(Stack<Integer> s1, Stack<Integer> s2){
        Stack<Integer> Result = new Stack<Integer>(); 
        int sum = 0, Remainder = 0; 
        while (!s1.isEmpty() && !s2.isEmpty()){

            // sum iteration starts from rightmost number 
            sum = (Remainder + s1.peek() + s2.peek()); 
            // Adding the number to the stack and nd thus we'll have to display the Stack in Reverse order for Result
            Result.add(sum % 10); 
            Remainder = sum / 10; 
  
            // Removing the top elements
            s1.pop(); 
            s2.pop(); 
        }
        // if s1> s2 in size then the remaining digits on right hand side will be added to result directy

        while (!s1.isEmpty())  
        { 
            sum = (Remainder + s1.peek()); 
            Result.add(sum % 10); 
            Remainder = sum / 10; 
            s1.pop(); 
        } 
        // if s2> s1 in size then the remaining digits on right hand side will be added to result directy

          
        while (!s2.isEmpty())  
        { 
            sum = (Remainder + s2.peek()); 
            Result.add(sum % 10); 
            Remainder = sum / 10; 
            s2.pop(); 
        } 
  
        // If carry remains 
        while (Remainder > 0)  
        { 
            Result.add(Remainder); 
            Remainder /= 10; 
        } 
  
        // Reversing the stack beacuse the the digit having biggest weight of 10^n will be at thr bottom
        while (!Result.isEmpty())  
        { 
            s1.add(Result.peek()); 
            Result.pop(); 
        } 
        Result = s1; 
        return Result; 
    } 

    static void GetResult(Stack<Integer> Result) { 
        int Stack = Result.size(); 
        String out = ""; 
        while (!Result.isEmpty())  
        { 
            out = String.valueOf(Result.peek()) + out; 
            Result.pop(); 
        } 
  
        System.out.print(out + "\n"); 
    } 

    public static void main(String []args){
        // taking Random Numbers  to test teh res
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s1 = new Stack<Integer>(); 
        Stack<Integer> s2 = new Stack<Integer>(); 
        System.out.println("Input the numbers in stack one ");
        int n= sc.nextInt();

        for (int i=0;i<n;i++){
            int in=rand.nextInt(9);
            s1.push(in);
        }
        System.out.println(s1+"Stack1");
        System.out.println("Input the numbers in stack two ");
        int n2= sc.nextInt();

        for (int i=0;i<n2;i++){
            int in2=rand.nextInt(9);
            s2.push(in2);
        }
        System.out.println(s2+"Stack 2");

        Stack<Integer> Result = add(s1, s2);
        GetResult(Result); 








    }
  

 }


    
