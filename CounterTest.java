
public class CounterTest {
	public static void main(String[] args) {
		Counter count = new Counter();
		count.click();
		System.out.println(count.getCount());
		
		count.click();
		count.click();
		System.out.println(count.getCount());
		
		count.reset();
		System.out.println(count.getCount());
		
		count.click();
		count.click();
		count.click();
		System.out.println(count);
		
	}
}
