package coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> hs = new HashSet<Student>();
		
		hs.add(new Student(1, "abc"));
		hs.add(new Student(2, "pqr"));
		hs.add(new Student(3, "xyz"));
		hs.add(new Student(4, "ghft"));
		hs.add(new Student(4, "ghft"));
		
		Iterator<Student> it =hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
