package zahid;

import java.util.Scanner;


/**
 * ITunes.java
 * This is a very basic mp3 collection system.
 * April 4, 2018
 * @author Christina Kemp
 *
 */
public class SchoolSystem {

	//creates a scanner object for the entire class. Any method can access it.
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * This is the entry point to my program
	 * @param args unused
	 */
	public static void main(String[] args) {
		System.out.println("Enter 'a' to input a new record. Enter 'b' to print to screen. Enter 'c' to quit.");
		String choice = sc.nextLine();
		while (!choice.equals("a")&&!choice.equals("b")&&!choice.equals("c")) {
			choice = sc.nextLine();
		}
		if (choice.equals("a")) {
			Student r1 = createRecord();	// creates two new records
			printRecord(r1);
		}
		else if (choice.equals("b")) {
			//printRecord(r1);
		}
		else if (choice.equals("c")) {
			
		}
		
	}


	/**
	 * This method will get the information required to set the fields in
	 * the record.
	 * @param r the Mp3Record to get data for
	 */
	public static Student createRecord() {
		Student r = new Student();	
		System.out.println("Please enter the student's first name:");
		r.setFirstName(sc.nextLine());
		System.out.println("Please enter the student's last name:");
		r.setLastName(sc.nextLine());
		System.out.println("Please enter the student's middle initals:");
		r.setMiddleInitials(sc.nextLine());
		System.out.println("Please enter the student's phone number:");
		r.setPhoneNumber(sc.nextLine());
		System.out.println("Please enter the student's email:");
		r.setEmail(sc.nextLine());
		System.out.println("Please enter the student's street address:");
		r.setStreetAddress(sc.nextLine());
		System.out.println("Please enter the student's city:");
		r.setCity(sc.nextLine());
		System.out.println("Please enter the student's province:");
		r.setProvince(sc.nextLine());
		System.out.println("Please enter the student's postal code:");
		r.setPostalCode(sc.nextLine());
		System.out.println("Please enter the student's student number:");
		try {
			r.setStudentNumber(sc.nextInt());
		}
		catch (java.util.InputMismatchException e)  {
			sc.nextLine();
			System.out.println("Please enter the student's student number as an Integer:");
			r.setStudentNumber(sc.nextInt());
		}

		System.out.println("Please enter the student's grade:");
		r.setGrade(sc.nextInt());
		return r;
	}

	/**
	 * The method prints the given Student to the screen in a nicely formatted manner.
	 * @param r the Student to print
	 */
	public static void printRecord(Student r) {
		System.out.println("First Name: " + r.getFirstName() + " \nLast Name: " + r.getLastName() + " \nMiddle Initials: " + r.getMiddleInitials() + " \nStudent Number: " + r.getStudentNumber() + " \nGrade: " + r.getGrade() + " \nPhone Number: " + r.getPhoneNumber() + " \nEmail: " + r.getEmail() + " \nStreet Address: " + r.getStreetAddress() + " \nCity: " + r.getCity() + " \nProvince: " + r.getProvince() + " \nPostal Code: " + r.getPostalCode());
	}

}
