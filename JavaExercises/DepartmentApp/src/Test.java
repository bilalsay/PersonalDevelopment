
public class Test {

	public static void main(String[] args) {
		Department d1 = new Department("Computer Engineering");
		Department d2 = new Department("Electric Engineering");
		Instructor i1 = new Instructor("Özgür", "Þen", "24323", d1);
		Advisor a1 = new Advisor("Hüseyin", "POLAT", "12134332",d1);
		Advisor a2 = new Advisor("Hüseyin", "POLAT", "12134332",d1);
		Student s1 = new Student("bilal","say", "11bp1040", d1);
		Student s2 = new Student("bilsssal","say", "11bp18040", d1);
		Student s3 = new Student("Ahmet","say", "11bp18040", d2);
		
		
		a1.addStudent(s1);
		a1.addStudent(s2);
		a2.addStudent(s1);
		
		
		Student get = a1.getStudent("11bp18040");
		
		System.out.println(get.getFirstName());
		
	}

}
