package coll;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector <Integer>  al = new Vector<Integer>();
		al.add(20);
		al.add(21);
		al.add(50);
		al.add(56);
		al.add(85);
		Enumeration e = al.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
