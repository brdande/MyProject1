package stringExample;

public class DemoStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Initial Capacity is " + sb1.capacity());
		StringBuffer sb2 = new StringBuffer("Balaji");
		System.out.println(" Capacity is " + sb2.capacity()); // 16+6 = 22
		
		sb1.append("Balaji Rajabhau Dande");
		
		System.out.println(" sb1 Capacity is " + sb1.capacity());  // (oldcapacity + 1) * 2 = 34 
																	// i.e (16 +1)*2 = 34
		
		

	}

}
