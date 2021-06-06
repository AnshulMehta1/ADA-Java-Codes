package DSRepertoire;
import java.util.ArrayList;

public interface MaxPriorityQueueIN  {
	
    public void Insert(int x);
    public int Maximum();
    public int ExtractMax();
    public void IncreaseKey(int x, int k);
    
}