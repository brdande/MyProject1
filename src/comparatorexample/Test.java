package comparatorexample;

public class Test {

	public static void main(String[] args) {
		final Student s = new Student(1,"asd",23);
		System.out.println(s.getAge());
		s.setAge(28);
		System.out.println(s.getAge());

	}

}
