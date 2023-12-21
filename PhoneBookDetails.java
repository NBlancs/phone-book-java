public class PhoneBookDetails {
	
	// Put the things needed for a phonebook here
	
	// FirstName
	// LastName
	// Occupation
	// ContactInformation
	// Address
	// EmailAddress
	
	String Fname;
	String Lname;
	String Occupation;
	int contactInformation;
	String Address;
	String EmailAddress;
	
	
	PhoneBookDetails(String Fname, String Lname, String Occupation, int contactInformation, String Address, String EmailAddress){
		
		this.Fname = Fname;
		this.Lname = Lname;
		this.Occupation = Occupation;
		this.contactInformation = contactInformation;
		this.Address = Address;
		this.EmailAddress = EmailAddress;
		
	}
	
	
	// This prints out the info in the arraylist and convert it into string
    @Override
    public String toString() {
        return "PhoneBookDetails{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", Occupation='" + Occupation + '\'' +
                ", contactInformation=" + contactInformation +
                ", Address='" + Address + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                '}';
    }
}
