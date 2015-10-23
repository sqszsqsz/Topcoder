package testing;
import java.util.Comparator;
import java.util.PriorityQueue;


public class queue {

	public static void main(String[] args)
    {
        Comparator<Integer> comparator = new intComparator();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>( comparator);
        int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };

        for (int x:ia){
        	queue.add(x);
        }
        
        while (queue.size() != 0)
        {
        	System.out.println(queue);
        	System.out.println(queue.remove());
        }
        
        
    }
	
	public static class intComparator implements Comparator<Integer>
	{
	    @Override
	    public int compare(Integer x, Integer y)
	    {
	        return y-x;
	    }
	}

}
