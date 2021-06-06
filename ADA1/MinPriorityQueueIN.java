

package DSRepertoire;
import java.util.ArrayList;
public interface MinPriorityQueueIN {
	
    public void Insert(int x);
    public int Minimum();
    public int ExtractMin();
    public void DecreaseKey( int x, int k);

}