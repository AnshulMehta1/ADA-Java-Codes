package StackAssignment;

import java.util.Scanner;
import java.util.Stack;

public class addingBigNumber 
{
    private Stack<Integer>stack;
    public addingBigNumber() 
    {
        stack = new Stack<>();
    }

    public static Stack<Integer> sumMethod(addingBigNumber stack1, addingBigNumber stack2) 
    {
        Stack<Integer> answer = new Stack<>();
        int carry = 0;
        while (!stack1.stack.isEmpty())
        {
            int total = stack1.stack.pop() + stack2.stack.pop() + carry;
            carry = total / 10;
            int stackElement = total % 10;
            answer.push(stackElement);
        }
        return answer;
    }

    public static String Input(String a, String b) 
    {
        String returnString = "";
        if (a.length() > b.length()) {
            returnString = b;
            for (int i = 0; i < a.length() - b.length(); i++) {
                returnString = "0" + returnString;
            }
        } else if (a.length() < b.length()) {
            returnString = a;
            for (int i = 0; i < b.length() - a.length(); i++) {
                returnString = "0" + returnString;
            }
        }
        return returnString;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        addingBigNumber number1Stack = new addingBigNumber();
        addingBigNumber number2Stack = new addingBigNumber();
        String numString = scanner.nextLine();
        String answer = "0";
        scanner.close();
        String numArray[] = numString.split(" ");

        for (int i = 0; i < numArray.length; i++) 
        {
            if (numArray[i].length() > answer.length()) 
            {
                answer = Input(numArray[i], answer);
            }
            else if (numArray[i].length() < answer.length())
            {
                numArray[i] = Input(numArray[i], answer);
            }

            for (int j = 0; j < numArray[i].length(); j++)
            {
                number1Stack.stack.push(Integer.parseInt(String.valueOf(numArray[i].charAt(j))));
                number2Stack.stack.push(Integer.parseInt(String.valueOf(answer.charAt(j))));
            }

            number2Stack.stack = sumMethod(number1Stack , number2Stack);
            answer = "";
            
            while (!number2Stack.stack.isEmpty())
            {
                answer = answer + Integer.toString(number2Stack.stack.pop());
            }
        }
        System.out.println(answer);
    }

}