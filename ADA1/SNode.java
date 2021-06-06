// package FinalCodeRepertoire.DSRepertoire;

package DSRepertoire;
class SNode<T> {
	
	 T key;

	 SNode<T> next;

	 

	public SNode(T k) {
		key = k;
	}
    //getter setter methods
	public void setNext(SNode<T> next) {
		this.next = next;
	}

	public T getKey() {
		return key;
    }
}