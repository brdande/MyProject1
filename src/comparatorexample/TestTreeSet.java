package comparatorexample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> hs = new TreeSet<Student>(new AgeComparator());
		
		hs.add(new Student(1,  "abc",23));
		hs.add(new Student(2, "pqr",25));
		hs.add(new Student(3, "xyz",19));
		hs.add(new Student(4, "ghft",22));
		hs.add(new Student(4, "ghft",24));
		
		Iterator<Student> it =hs.iterator();
	
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
