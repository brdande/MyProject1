package stringExample;

public class IMPStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Balaji");
		StringBuffer sb2 = sb1.append(" Dande");
		System.out.println(sb1.equals(sb2)); //true
		// When refernces are same the it will called equals method of onject class
	}
}
