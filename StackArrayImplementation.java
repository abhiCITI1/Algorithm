/**
 * 
 */

/**
 * @author Abhishek
 *
 */
public class StackArrayImplementation {
	
	private static final int CAPACITY = 10;
	
	protected int capacity;
	
	private int[] stackArr;
	
	private int top = -1;//top index of the array
	
	public StackArrayImplementation()
	{
		stackArr = new int[CAPACITY];
	}
	
	public StackArrayImplementation(int cap)
	{
		this.capacity = cap;
		stackArr = new int[capacity];
	}
	
	//Implementing Auxiliary Stack operations
	public int top()
	{
		return top;
	}
	
	public int size()
	{
		return top+1;
	}
	
	public boolean isStackEmpty()
	{
		if(top<0)
			return true;
		else
			return false;
	}
	
	public boolean isStackFull()
	{
		if(size()==capacity)
			return true;
		else
			return false;
	}
	
	
	
	

}
