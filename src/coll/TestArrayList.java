package coll;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList <Integer>  al = new ArrayList<Integer>();
		al.add(20);
		al.add(21);
		al.add(50);
		al.add(56);
		al.add(85);
		ArrayList <Integer>  al1 = new ArrayList<Integer>();
		al1.add(20);
		al1.add(21);
		al1.add(50);
	
		System.out.println(al);	
		System.out.println(al1);	
		al.removeAll(al1);
		System.out.println(al);	
		al.removeIf(a ->a%2==0);
		System.out.println(al);	
		

	}

}
