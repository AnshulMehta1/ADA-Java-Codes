package PetrolPumpSim;
import java.util.ArrayList;
import java.util.Scanner;
public class Genq<T> extends PetrolPump{
    private ArrayList<T> arr;

    public Genq() {
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
       
        


}
}

