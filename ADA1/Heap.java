package DSRepertoire;
import java.util.*;

import java.util.ArrayList;

import java.util.ArrayList;
public class Heap<Integer> {
    protected ArrayList<Integer> array = new ArrayList<Integer>();
	protected int heap_size;
	
	public int Parent(int i) {
		//your code here and change return
		return Math.floorDiv(i-1, 2);		
}


public int Left(int i) {
	//your code here and change return
	return 2*i;
}


public int Right(int i) {
	//your code here and change return
	return 2*i + 1;
}
}
