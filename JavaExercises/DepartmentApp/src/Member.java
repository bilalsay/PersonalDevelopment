
public class Member extends Person{
	
	private String registNum = null;
		
	Member(String firstName, String lastName, String registNum) {
		super.setName(firstName, lastName);
		this.registNum = registNum;
	}
	
	public String getFirstName() {
		return super.getFirstName();
	}
	
	public String getLastName() {
		return super.getLastName();
	}
	
	public String getRegistNum() {
		return registNum;
	}

	
}
