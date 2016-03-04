package data;

public class Actor {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Actor(String first, String middle, String last) {
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
