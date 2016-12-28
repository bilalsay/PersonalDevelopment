
public class Instructor extends Member{

	private Department dept = null;
	
	Instructor(String firstName, String lastName, String registNum, Department dept){
		super(firstName, lastName, registNum);
		this.dept = dept;
	}
	
	public String getDepartment() {
		return dept.getName();
	}
}
