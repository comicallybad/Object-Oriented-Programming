//Class name will define first, middle and last name
public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	
	//Constructor function for full name
	public Name(String firstName, String middleName, String lastName) {
		this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
		this.middleName = Character.toUpperCase(middleName.charAt(0)) + middleName.substring(1);
		this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1);
	}
	//Constructor function without middle name
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.middleName = ""; //This is to check in to string if it exists
		this.lastName = lastName;
	}
	//set first name
	public void setFirstName(String firstName) {
		this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
	}
	//get first name
	public String getFirstName() {
		return firstName;
	}
	//set middle name
	public void setMiddleName(String middleName) {
		if(middleName.length() == 0) this.middleName = "";
		else this.middleName = Character.toUpperCase(middleName.charAt(0)) + middleName.substring(1);
	}
	//get middle name
	public String getMiddleName() {
		return middleName;
	}
	//set last name
	public void setLastName(String lastName) {
		this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1);
	}
	//get last name
	public String getLastName() {
		return lastName;
	}
	//Override toString method
	@Override
	public String toString() {
		return String.format("%s %s", getFirstName(), middleName == "" ? getLastName() : String.format("%s %s", getMiddleName(), getLastName()));
	}
}
