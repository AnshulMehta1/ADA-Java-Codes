// package FinalCodeRepertoire.DSRepertoire;

package DSRepertoire;
import java.util.LinkedList;
public class SList<Student>{
	SNode<Student> head=null;
	//Initialize to null
	
    public void insert(SNode<Student> x) {
		// x.setNext(next) ---> Set Value of head as x.next
        x.next = head;
        head = x;
    }
    
    public void delete(SNode<Student> x) {

		SNode<Student> temp = head;
		SNode<Student> bef=null;
		// Search for Student x
		
        while(temp.next != x) {
			
            temp = temp.next;
		}
		// De-Linking The Node
        temp.next = x.next;
    }
    
    
    public void printList() {

        SNode<Student> x = head;
        
        while(x != null){
			System.out.println(x.key);
			// Assigning next Val to X
            x = x.next;
        }
        System.out.println();
    }
    public SNode<Student> search(Student key) {
		// To Search For any Student Y iterate through the Linked List till Key and Data are not equall
        SNode<Student> y = head;
        while(y.key != key && y != null) {
            y = y.next;
        }
        return y;
    }
}

