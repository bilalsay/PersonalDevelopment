
public class Student extends Member{

	private Department dept = null;
	
	Student(String firstName, String lastName, String registNum, Department dept){
		super(firstName, lastName, registNum);
		this.dept = dept;
	}
	
	public String getDepartment() {
		return dept.getName();
	}
	
	
}
