import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
	
	public static void Menu(String[] args) {
		System.out.println("========PHONEBOOK SYSTEM========\n");
		
		System.out.println("PRESS 1 to Create New Phonebook Information");
		System.out.println("PRESS 2 to Read Phonebook List");
		System.out.println("PRESS 3 to Update a certain Phonebook information");
		System.out.println("PRESS 4 to Delete a certain Phonebook information");
		System.out.println("PRESS 5 to Exit Program\n");
		
		System.out.print("Input: ");
	}
	
	public static void main(String[] args) {
		
		ArrayList<PhoneBookDetails> information = new ArrayList<>();
		information.add(new PhoneBookDetails("noel","blanco", "student",12321,"malaybalay city","asmdn@gmail.com"));
			
		// This is the order of the ArrayList
		
		// FirstName
		// LastName
		// Occupation
		// ContactInformation
		// Address
		// EmailAddress
		
		Menu(args);
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if (input == 1) {
			System.out.println("First Name: ");
			String fname = scanner.next();
			
			System.out.println("Last Name: ");
			String lname = scanner.next();

			System.out.println("Occupation: ");
			String Occupation = scanner.next();
			
			System.out.println("Contact Information: ");
			int coninfo = scanner.nextInt();
			
			System.out.println("Address: ");
			String address = scanner.next();
			
			System.out.println("Email Address: ");
			String emailadd = scanner.next();
			
			System.out.print("Input: ");
			String infos = scanner.next();
			information.add(new PhoneBookDetails(fname, lname, Occupation, coninfo, address, emailadd));
			
			for (PhoneBookDetails details: information) {
				System.out.println(details);
			}
			
			
		} else if (input == 2) {
			
			 System.out.println("Enter the student number to search (0-based index): ");
			 int indexnumber = scanner.nextInt();
			 if (indexnumber >= 0 && indexnumber < information.size()) {
			     System.out.println(information.get(indexnumber));

			 } else {
				 System.out.println("\nSTUDENT NOT FOUND\n");
				 main(args);
			 }

		}else if (input == 3) {

		}else if (input == 4) {

		}else if (input == 5) {

		} else {
			System.out.println("Invalid Input\n");
			Menu(args);
		}
		
		
		
		
	}
}
