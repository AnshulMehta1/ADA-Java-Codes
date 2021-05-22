package LinkedlIST;
import java.util.*;

/*
Initialize three pointers prev as NULL, curr as head and next as NULL.
Iterate through the linked list. In loop, do following. 
// Before changing next of current, 
// store next node 
next = curr->next
// Now change next of current 
// This is where actual reversing happens 
curr->next = prev 
// Move prev and curr one step forward 
prev = curr 
curr = next
*/

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next ; // Next is Token function

        // Constructor
        Node(int d){
            data=d;
            next=null;



        }

        Node Reverse(Node node){
            Node prev=null;
            Node current =node;
            Node next = null;

            while (current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;

            }
            node=prev;
            return node; // Ahiya node head che 
        }
        // prints content of double linked list 
        void printList(Node node) { 
            while (node != null) { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
    }


    }

    public static void main(String []args){
        LinkedList list1=new LinkedList();
        list1.head = new Node(85); 
        list1.head.next = new Node(15); 
        list1.head.next.next = new Node(4); 
        list1.head.next.next.next = new Node(20);
        
        

        
    }

    
}
