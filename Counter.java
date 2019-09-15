
public class Counter {
	private int count;
	
	//-------------------------
	// This is the constructor.
	//-------------------------
	public Counter() {
		count = 0;
	}
	
	public void click() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public void reset() {
		count = 0;
	}
	
	public String toString() {
		String result = "The current count is: " + 
				Integer.toString(count);
		return result;
	}
}
