package zahid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 * SchoolSystem.java
 * This is a student record system.
 * April 4, 2018
 * @author Rohan Zahid
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
	static ArrayList<Student> studRecs = new ArrayList<Student>();
	public static void main(String[] args) throws InvalidInputException {
		int choice = 0;
		int index2 = 0;
		do{
			System.out.println("Enter '1' - Input a new record.");
			System.out.println("Enter '2' - Print one record to screen.");
			System.out.println("Enter '3' - Print all records to screen.");
			System.out.println("Enter '4' - Save to file.");
			System.out.println("Enter '5' - Load from file.");
			System.out.println("Enter '0' - Quit.");
			try {
				choice = sc.nextInt();
			}
			catch(Exception e){
				System.out.println("Enter '1' - Input a new record.");
				System.out.println("Enter '2' - Print one record to screen.");
				System.out.println("Enter '3' - Print all records to screen.");
				System.out.println("Enter '4' - Save to file.");
				System.out.println("Enter '5' - Load from file.");
				System.out.println("Enter '0' - Quit.");
				sc.nextLine();
			}
			sc.nextLine();
			while((choice !=1)&&(choice!=2)&&(choice!=3)&&(choice!=4)&&(choice!=5)&&(choice!=0)) {
				System.out.println("Enter '1' - Input a new record.");
				System.out.println("Enter '2' - Print one record to screen.");
				System.out.println("Enter '3' - Print all records to screen.");
				System.out.println("Enter '4' - Save to file.");
				System.out.println("Enter '5' - Load from file.");
				System.out.println("Enter '0' - Quit.");
				try {
					choice = sc.nextInt();
				}
				catch(Exception e){
					match = false;
					System.out.println("Enter '1' - Input a new record.");
					System.out.println("Enter '2' - Print one record to screen.");
					System.out.println("Enter '3' - Print all records to screen.");
					System.out.println("Enter '4' - Save to file.");
					System.out.println("Enter '5' - Load from file.");
					System.out.println("Enter '0' - Quit.");
					sc.nextLine();
					choice = sc.nextInt();
				}
				sc.nextLine();
			}
			if (choice == 1) {

				studRecs.add(createRecord());// creates two new records
			}
			else if (choice == 2) {
				System.out.println("Enter the index of the student record in order to print it.");
				try {
					index2 = sc.nextInt();
				}
				catch(Exception e){
					System.out.println("Enter the index of the student record in order to print it.");
					sc.nextLine();
					index2 = sc.nextInt();
				}
				printRecord(studRecs.get(index2));

			}
			else if (choice == 3) {
				printRecords();

			}
			else if (choice == 4) {
				saveFile();

			}
			else if (choice == 5) {
				loadFile();

			}
		}while (choice!=0);
		System.out.println("Thank You!");
	}


	/**
	 * This method will get the information required to set the fields in
	 * the record.
	 * @param r the Student to get data for
	 * @return 
	 * @throws InvalidInputException 
	 */
	public static Student createRecord() throws InvalidInputException {

		System.out.println("Please enter the student's first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter the student's last name:");
		String lastName = sc.nextLine();
		System.out.println("Please enter the student's middle initals:");
		String middleInitials = sc.nextLine();
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

		Student r = new Student(firstName, lastName, middleInitials, email, streetAddress, city, province, postalCode);
		System.out.println("Please enter the student's student number:");
		String studentNumber = "";
		do {
			try {
				match = false;
				studentNumber = sc.nextLine();
				r.setStudentNumber(studentNumber);
			}catch(Exception e) {
				match = true;
				System.err.println(e.getMessage());
				//System.out.println("Please try again! Enter the student's student number.");

			}
		}while(match == true);
		System.out.println("Please enter the student's phone number:");
		String phoneNumber = "";
		do {
			try {
				match = false;
				phoneNumber = sc.nextLine();
				r.setPhoneNumber(phoneNumber);
			}catch(Exception e) {
				match = true;
				System.err.println(e.getMessage());
				System.out.println("Please try again! Enter the student's phone number.");
			}
		}while(match == true);
		System.out.println("Please enter the student's grade:");
		int grade = 0;
		do {
			try {
				match = false;
				grade = sc.nextInt();
				r.setGrade(grade);

			}catch(Exception e) {
				match = true;
				System.err.println(e.getMessage());
				System.out.println("Please try again! Enter the student's grade.");
				sc.nextLine();
			}
		}while(match == true);

		return r;
	}

	/**
	 * The method prints the given Student to the screen in a nicely formatted manner.
	 * @param r the Student to print
	 */
	public static void printRecord(Student r) {
		System.out.println("First Name: " + r.getFirstName() + " \nLast Name: " + r.getLastName() + " \nMiddle Initials: " + r.getMiddleInitials() + " \nStudent Number: " + r.getStudentNumber() + " \nGrade: " + r.getGrade() + " \nPhone Number: " + r.getPhoneNumber() + " \nEmail: " + r.getEmail() + " \nStreet Address: " + r.getStreetAddress() + " \nCity: " + r.getCity() + " \nProvince: " + r.getProvince() + " \nPostal Code: " + r.getPostalCode());
	}
	public static void printRecords() {
		for (int i = 0; i < studRecs.size(); i++) {
			printRecord(studRecs.get(i));
			System.out.println();
		}
	}
	public static void saveFile() {
		try {
			File file = new File("database.txt");
			PrintStream fps = new PrintStream(file);
			fps.println(studRecs.size());
			for (int i = 0; i < studRecs.size(); i++) {
				fps.println(studRecs.get(i).toString());
			}
			fps.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
	public static void loadFile() throws NumberFormatException, InvalidInputException {
		studRecs.clear();
		Student s;
		try {
			File file = new File("database.txt");
			Scanner fscan = new Scanner(file);
			fscan.nextLine();
			String input = fscan.nextLine();
			String [] data = input.split(",");
			s = new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], Integer.parseInt(data[10]));
			studRecs.add(s);
			fscan.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
