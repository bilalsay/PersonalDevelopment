import java.util.ArrayList;

public class Advisor extends Instructor{
	
	Advisor(String firstName, String lastName, String registNum, Department dept) {
		super(firstName, lastName, registNum, dept);
	}

	ArrayList<Student> stuList = new ArrayList<Student>();
	
	
	
	public void addStudent(Student student) {
		
		if (student.getDepartment() == super.getDepartment()) {
			
			if (stuList.isEmpty()) {
				stuList.add(student);
			} else {
				for (Student st : stuList) {
					if (st.getRegistNum().contains(student.getRegistNum())){
						System.out.println("Birden fazla olamaz");
					} else {
						stuList.add(student);
						break;
					}
				}
			}
		
		} else {
			System.out.println("Öðrenci Farklý bir bölümdeki danýþmana eklenemez");
		}
	}
	
	public ArrayList<Student> getStudent() {
		return stuList;
	}
	
	public Student getStudent(String rNum) {
		Student any = null;
		for (Student m : stuList) {
			if (m.getRegistNum().contains(rNum)) {
				any = m;
				break;
			}
		}
		return any;
	}
}
