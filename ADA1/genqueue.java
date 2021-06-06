package DSRepertoire;
import java.util.ArrayList;
import java.util.Scanner;
public class genqueue<T> {
    private ArrayList<T> arr;

    public genqueue() {
        arr = new ArrayList<T>();
    }

    public void enqueue(T e) {
        arr.add(e);
    }

    public T dequeue() {
        return arr.remove(0);
    }

    public boolean empty() {
        return arr.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        var queue1 =new genqueue<Character>();
        var queue2 =new genqueue<Character>();
        var str= sc.nextLine();
        for (int i=0;i<str.length()/2;i++){
            queue1.enqueue(str.charAt(i));
        }
        if (str.length() % 2 == 0) {
            for (int i = str.length() / 2; i < str.length(); i++) {
                queue2.enqueue(str.charAt(i));
            }
        } 
        else {
            for (int i = str.length() / 2 + 1; i < str.length(); i++) {
                queue2.enqueue(str.charAt(i));
            }
        }
        for (int j=0;j<str.length()/2;j++){
            if (queue1.dequeue()!=queue2.dequeue()){
                System.out.println("False");
                return;
            }
            else{
                System.out.println("true");
            }
        }
        


}
}
