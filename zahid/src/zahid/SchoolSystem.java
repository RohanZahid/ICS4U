package zahid;

import java.util.InputMismatchException;
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
	static boolean match = false;
	/**
	 * This is the entry point to my program
	 * @param args unused
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException {
		int choice = 0;
		int index1 = 0;
		int index2 = 0;

		Student[]Student = new Student[100];
		do{
			System.out.println("Enter '1' to input a new record. Enter '2' to print to screen. Enter '3' to quit.");
			try {
				choice = sc.nextInt();
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Enter '1' to input a new record. Enter '2' to print to screen. Enter '3' to quit.");
				sc.nextLine();
			}
			sc.nextLine();
			while((choice !=1)&&(choice!=2)&&(choice!=3)) {
				System.out.println("Enter '1' to input a new record. Enter '2' to print to screen. Enter '3' to quit.");
				try {
					choice = sc.nextInt();
				}
				catch(java.util.InputMismatchException e){
					match = false;
					System.out.println("Enter '1' to input a new record. Enter '2' to print to screen. Enter '3' to quit.");
					sc.nextLine();
					choice = sc.nextInt();
				}
				sc.nextLine();
			}
			if (choice == 1) {
				Student [index1] = createRecord();	// creates two new records
			}
			else if (choice == 2) {
				System.out.println("Enter the index of the student record in order to print it.");
				try {
					index2 = sc.nextInt();
				}
				catch(java.util.InputMismatchException e){
					System.out.println("Enter the index of the student record in order to print it.");
					sc.nextLine();
					index2 = sc.nextInt();
				}
				printRecord(Student[index2]);

			}
			index1++;
		}while (choice!=3);
		System.out.println("Thank You come again to my chinese restaurant.");
	}


	/**
	 * This method will get the information required to set the fields in
	 * the record.
	 * @param r the Student to get data for
	 */
	public static Student createRecord() throws InvalidInputException {

		System.out.println("Please enter the student's first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter the student's last name:");
		String lastName = sc.nextLine();
		System.out.println("Please enter the student's middle initals:");
		String middleInitials = sc.nextLine();
		System.out.println("Please enter the student's phone number:");
		long phoneNumber = 0;
		do {
			try {
				match = false;
				phoneNumber = sc.nextLong();
			}catch(InputMismatchException e) {
				match = true;
				System.err.println(e.getMessage());
				System.out.println("Please try again!");
			}
		}while(match==true);

		sc.nextLine();

		System.out.println("Please enter the student's email:");
		String email = sc.nextLine();
		System.out.println("Please enter the student's street address:");
		String streetAddress = sc.nextLine();
		System.out.println("Please enter the student's city:");
		String city = sc.nextLine();
		System.out.println("Please enter the student's province:");
		String province = sc.nextLine();
		System.out.println("Please enter the student's postal code:");
		String postalCode = sc.nextLine();
		System.out.println("Please enter the student's student number:");
		try {
			int studentNumber = sc.nextInt();
		}
		catch (InputMismatchException e)  {
			sc.nextLine();
			System.out.println("Please enter the student's student number as an Integer:");

		}

		System.out.println("Please enter the student's grade:");
		int grade = sc.nextInt();
		Student r = new Student(firstName, lastName, middleInitials, phoneNumber, email, streetAddress, city, province, postalCode, grade);
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
