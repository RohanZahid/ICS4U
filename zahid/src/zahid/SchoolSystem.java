package zahid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * SchoolSystem.java
 * This is a student record system.
 * May 7, 2018
 * @author Rohan Zahid
 *
 */
public class SchoolSystem {

	static Scanner sc = new Scanner(System.in); //Creates a scanner object for the entire class. Any method can access it.
	static boolean error = false; //boolean value for checking for errors is given the value of false.
	static ArrayList<Student> studRecs = new ArrayList<Student>(); //Creates an ArrayList of student records.
	/**
	 * This is the main method and entry point to the program.
	 * @param args unused
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException {
		int choice = -1; //Variable used for user choices. Given a value of -1 because the input has not been recorded.
		int index = 0; //Variable used for printing a single record.
		do{
			choice = -1; //Variable reset.		

			while((choice != 1)&&(choice != 2)&&(choice != 3)&&(choice != 4)&&(choice != 5)&&(choice != 6)&&(choice != 7)&&(choice != 0)) { //If the input is not one of the given options, the prompt is looped.
				System.out.println("Enter '1' - Input a new record. \nEnter '2' - Print one record to screen.\nEnter '3' - Print all records to screen.\nEnter '4' - Save to file.\nEnter '5' - Load from file. (records in memory will be deleted)\nEnter '6' - Sort.\nEnter '7' - Search.\nEnter '0' - Quit.");
				do {
					try {
						error = false; 
						choice = sc.nextInt();
					}catch(Exception e) { //If the input is not valid (i.e wrong type, not a part of the domain), the prompt is looped.
						error = true; //Upon an error, the error detection variable is given the value of true.
						System.out.println("Enter '1' - Input a new record. \nEnter '2' - Print one record to screen.\nEnter '3' - Print all records to screen.\nEnter '4' - Save to file.\nEnter '5' - Load from file. (records in memory will be deleted)\nEnter '6' - Sort.\nEnter '7' - Search.\nEnter '0' - Quit.");
						sc.nextLine();
					}
				}while(error == true);
				sc.nextLine();
			}
			System.out.println();

			if (choice == 1) {
				studRecs.add(createRecord());// creates a new student record and adds it to the end of the ArrayList.
			}
			else if (choice == 2) {
				index = -1;
				if (studRecs.size() == 0) {
					System.out.println("There are no student records.");
				}
				else {
					while ((index > studRecs.size() - 1)||(index < 0)) { //If the input is out of bounds, the prompt is looped.
						System.out.println("Enter the index of the student record in order to print it.");
						do {
							try {
								error = false;
								index = sc.nextInt();
							}catch(Exception e) {
								error = true;
								System.out.println("That is not a valid index. Enter the index of the student record in order to print it.");
								sc.nextLine();
							}
						}while(error == true);
					}
					printRecord(studRecs.get(index));
					System.out.println();
				}

			}
			else if (choice == 3) {
				printRecords(); //Calls the printRecords method to print all records.
			}
			else if (choice == 4) {
				saveFile(); //Calls the saveFile method to save records to a file.
			}
			else if (choice == 5) {
				loadFile(); //Calls the loadFile method to load records from a file.
			}
			else if (choice == 6) {
				Collections.sort(studRecs); //Uses Collections.sort and the CompareTo method to sort the records.
			}
			else if (choice == 7) {
				System.out.println("Enter '1' - Search using first name.\nEnter '2' - Search using last name.\nEnter '3' - Search using student number.");
				int decision = -1; //Another variable to hold the user's choice.
				while((decision != 1)&&(decision  != 2)&&(decision  != 3)) { //If the input is not one of the given options, the prompt is looped.
					do {
						try {
							error = false;
							decision  = sc.nextInt();
						}catch(Exception e) {
							error = true;
							System.out.println("Enter '1' - Search using first name.\nEnter '2' - Search using last name.\nEnter '3' - Search using student number.");
							sc.nextLine();
						}
					}while(error == true);
					sc.nextLine();
				}
				int search = -1; //Variable for what the user wants to search by is initialized.
				if (decision == 1) {
					System.out.println("Enter the first name of the student you want to find.");
					search = 1;

				}
				else if (decision == 2) {
					System.out.println("Enter the last name of the student you want to find.");
					search = 2;
				}
				else if (decision == 3) {
					System.out.println("Enter the student number of the student you want to find.");
					search = 3;
				}
				String key = sc.nextLine(); //The String of what the user wants to look for is recorded in the variable key.
				int item = searchFile(key, search); //The value returned by the call to the searchFile method is the location of the student record.
				decision = -1;
				if (item == -1) { //If item is -1, the student with the corresponding key was not found.

				}
				else {
					printRecord(studRecs.get(item)); //The student record that was being searched for is printed.
					System.out.println();
					System.out.println("Enter '1' - Modify this record.\nEnter '2' - Delete record.\nEnter '0' - Return to main menu.");
					while((decision != 1)&&(decision  != 2)&&(decision  != 0)) { //If the input is not one of the given options, the prompt is looped.
						do {
							try {
								error = false;
								decision  = sc.nextInt();
							}catch(Exception e) {
								error = true;
								System.out.println("Enter '1' - Modify this record.\nEnter '2' - Delete record.\nEnter '0' - Return to main menu.");
								sc.nextLine();
							}
						}while(error == true);
						sc.nextLine();
					}
					if (decision == 1) {
						do {
							decision = -1;
							while((decision != 1)&&(decision != 2)&&(decision != 3)&&(decision!= 4)&&(decision != 5)&&(decision != 6)&&(decision != 7)&&(decision != 8)&&(decision != 9)&&(decision != 10)&&(decision != 11)&&(decision != 0)) { //If the input is not one of the given options, the prompt is looped.
								System.out.println("Enter '1' - Modify first name.\nEnter '2' - Modify last name.\nEnter '3' - Modify middle initials.\nEnter '4' - Modify email address./nEnter '5' - Modify street address.\nEnter '6' - Modify city.\nEnter '7' - Modify province.\nEnter '8' - Modify postal code.\nEnter '9' - Modify student number.\nEnter '10' - Modify phone number.\nEnter '11' - Modify grade.\nEnter '0' - Save changes.");
								do {
									try {
										error = false;
										decision = sc.nextInt();
									}catch(Exception e) {
										error = true;
										System.out.println("Enter '1' - Modify first name.\nEnter '2' - Modify last name.\nEnter '3' - Modify middle initials.\nEnter '4' - Modify email address./nEnter '5' - Modify street address.\nEnter '6' - Modify city.\nEnter '7' - Modify province.\nEnter '8' - Modify postal code.\nEnter '9' - Modify student number.\nEnter '10' - Modify phone number.\nEnter '11' - Modify grade.\nEnter '0' - Save changes.");
										sc.nextLine();
									}
								}while(error == true);
								sc.nextLine();
							}
							if (decision == 1) {
								System.out.println("Enter new first name.");
								String firstName = sc.nextLine();
								studRecs.get(item).setFirstName(firstName); //Sets a new value for the first name of the student record.
							}
							else if (decision == 2) {
								System.out.println("Enter new last name.");
								String lastName = sc.nextLine();
								studRecs.get(item).setLastName(lastName); //Sets a new value for the last name of the student record.
							}
							else if (decision == 3) {
								System.out.println("Enter new middle initials.");
								String middleInitials = sc.nextLine();
								studRecs.get(item).setMiddleInitials(middleInitials); //Sets a new value for the middle initials of the student record.
							}
							else if (decision == 4) {
								System.out.println("Enter new email address.");
								String email = "";
								do {
									try {
										error = false;
										email = sc.nextLine();
										studRecs.get(item).setEmail(email); //Sets a new value for the email address of the student record.
									}catch(Exception e) {
										error = true;
										System.err.println(e.getMessage());
									}
								}while(error == true);
							}
							else if (decision == 5) {
								System.out.println("Enter new street address.");
								String streetAddress = sc.nextLine();
								studRecs.get(item).setStreetAddress(streetAddress); //Sets a new value for the street address of the student record.
							}
							else if (decision == 6) {
								System.out.println("Enter new city.");
								String city = sc.nextLine();
								studRecs.get(item).setCity(city); //Sets a new value for the city of the student record.
							}
							else if (decision == 7) {
								System.out.println("Enter new province/territory. 'AB' (Alberta), 'BC' (British Columbia), 'MB' (Manitoba), 'NB' (New Brunswick), 'NL' (Newfoundland and Labrador), 'NT' (Northwest Territories), 'NS' (Nova Scotia), 'NU' (Nunavut), 'ON' (Ontario), 'PE' (Prince Edward Island), 'QC' (Quebec), 'SK' (Saskatchewan), 'YT' (Yukon):");
								String province = "";
								do {
									try {
										error = false;
										province = sc.nextLine();
										studRecs.get(item).setProvince(province); //Sets a new value for the province of the student record.
									}catch(Exception e) {
										error = true;
										System.err.println(e.getMessage());
									}
								}while(error == true);

							}
							else if (decision == 8) {
								System.out.println("Enter new postal code.");
								String postalCode = "";
								do {
									try {
										error = false;
										postalCode = sc.nextLine();
										studRecs.get(item).setPostalCode(postalCode); //Sets a new value for the postal code of the student record.
									}catch(Exception e) {
										error = true;
										System.err.println(e.getMessage());
									}
								}while(error == true);
							}
							else if (decision == 9) {
								System.out.println("Enter new student number.");
								String studentNumber = "";
								do {
									try {
										error = false;
										studentNumber = sc.nextLine();
										studRecs.get(item).setStudentNumber(studentNumber); //Sets a new value for the street number of the student record.
									}catch(Exception e) {
										error = true;
										System.err.println(e.getMessage());
									}
								}while(error == true);
							}
							else if (decision == 10) {
								System.out.println("Enter new phone number.");
								String phoneNumber = "";
								do {
									try {
										error = false;
										phoneNumber = sc.nextLine();
										studRecs.get(item).setPhoneNumber(phoneNumber); //Sets a new value for the phone number of the student record.
									}catch(Exception e) {
										error = true;
										System.err.println(e.getMessage());
									}
								}while(error == true);
							}
							else if (decision == 11) {
								System.out.println("Enter new grade.");
								int grade = 0;
								do {
									try {
										error = false;
										grade = sc.nextInt();
										studRecs.get(item).setGrade(grade); //Sets a new value for the grade of the student record.
									}catch(Exception e) {
										error = true;
										System.err.println(e.getMessage());
										sc.nextLine();
									}
								}while(error == true);
							}
						} while (decision != 0); //The user can continue to modify a student record until 0 is inputted.
					}
					else if (decision == 2) {
						studRecs.remove(item); //Removes a student record from the ArrayList.
					}
				}
			}

		}while (choice != 0); //The main method loops until 0 is inputted, entailing that the user would like to exit the program.
		System.out.println("Thank You!");
	}
	/**
	 * Searches each student record in the ArrayList using linear search to locate the index of the student record that is being looked for.
	 * @param key - The String value of what the user wants to look for.
	 * @param search - The field to search by (i.e first name, last name, student number).
	 * @return - The index of the student record that contains the key.
	 */
	private static int searchFile(String key, int search) {
		if (search == 1) { //Searches using first name.
			for (int i = 0; i < studRecs.size(); i++) {
				if (studRecs.get(i).getFirstName().equalsIgnoreCase(key)) { //The case is ignored because the key is the same whether it is uppercase or lowercase.
					return i;
				}
			}
			System.out.println("A student with the first name '" + key + "' does not exist."); //If the index of the student record that contains the key is not found, this means that that there is not a student record that contains the key.
			return -1; //-1 means that the key was not found in any of the student records.
		}
		else if (search == 2) { //Searches using last name.
			for (int i = 0; i < studRecs.size(); i++) {
				if (studRecs.get(i).getLastName().equalsIgnoreCase(key)) {
					return i;
				}
			}
			System.out.println("A student with the last name '" + key + "' does not exist.");
			return -1;
		}
		else {
			for (int i = 0; i < studRecs.size(); i++) { //Searches using student number.
				if (studRecs.get(i).getStudentNumber().equalsIgnoreCase(key)) {
					return i;
				}
			}
			System.out.println("A student with the student number '" + key + "' does not exist.");
			return -1;
		}


	}
	/**
	 * Creates a student record using user data required to set the fields in the record.
	 * @param r - the student record to get data for.
	 * @throws InvalidInputException 
	 */
	public static Student createRecord() throws InvalidInputException {
		System.out.println("Please enter the student's first name:");
		String firstName = sc.nextLine();

		System.out.println("Please enter the student's last name:");
		String lastName = sc.nextLine();

		System.out.println("Please enter the student's middle initals:");
		String middleInitials = sc.nextLine();

		System.out.println("Please enter the student's street address:");
		String streetAddress = sc.nextLine();

		System.out.println("Please enter the student's city:");
		String city = sc.nextLine();

		Student r = new Student(firstName, lastName, middleInitials, streetAddress, city); //Uses the constructor in the Student class to create a record.

		System.out.println("Please enter the student's province/territory. 'AB' (Alberta), 'BC' (British Columbia), 'MB' (Manitoba), 'NB' (New Brunswick), 'NL' (Newfoundland and Labrador), 'NT' (Northwest Territories), 'NS' (Nova Scotia), 'NU' (Nunavut), 'ON' (Ontario), 'PE' (Prince Edward Island), 'QC' (Quebec), 'SK' (Saskatchewan), 'YT' (Yukon):");
		String province = ""; //The remaining fields are set individually.
		do {
			try {
				error = false;
				province = sc.nextLine();
				r.setProvince(province);
			}catch(Exception e) {
				error = true;
				System.err.println(e.getMessage());
			}
		}while(error == true);

		System.out.println("Please enter the student's postal code:");
		String postalCode = "";
		do {
			try {
				error = false;
				postalCode = sc.nextLine();
				r.setPostalCode(postalCode);
			}catch(Exception e) {
				error = true;
				System.err.println(e.getMessage());
			}
		}while(error == true);

		System.out.println("Please enter the student's student number:");
		String studentNumber = "";
		do {
			try {
				error = false;
				studentNumber = sc.nextLine();
				r.setStudentNumber(studentNumber);
			}catch(Exception e) {
				error = true;
				System.err.println(e.getMessage());
			}
		}while(error == true);

		System.out.println("Please enter the student's phone number:");
		String phoneNumber = "";
		do {
			try {
				error = false;
				phoneNumber = sc.nextLine();
				r.setPhoneNumber(phoneNumber);
			}catch(Exception e) {
				error = true;
				System.err.println(e.getMessage());
			}
		}while(error == true);

		System.out.println("Please enter the student's email address:");
		String email = "";
		do {
			try {
				error = false;
				email = sc.nextLine();
				r.setEmail(email);
			}catch(Exception e) {
				error = true;
				System.err.println(e.getMessage());
			}
		}while(error == true);

		System.out.println("Please enter the student's grade:");
		int grade = 0;
		do {
			try {
				error = false;
				grade = sc.nextInt();
				r.setGrade(grade);
			}catch(Exception e) {
				error = true;
				System.err.println(e.getMessage());
				sc.nextLine();
			}
		}while(error == true);
		return r;
	}

	/**
	 * The method prints the given Student to the screen in a nicely formatted manner.
	 * @param r - the Student to print
	 */
	public static void printRecord(Student r) {
		System.out.println("First Name: " + r.getFirstName() + " \nLast Name: " + r.getLastName() + " \nMiddle Initials: " + r.getMiddleInitials() + " \nStudent Number: " + r.getStudentNumber() + " \nGrade: " + r.getGrade() + " \nPhone Number: " + r.getPhoneNumber() + " \nEmail: " + r.getEmail() + " \nStreet Address: " + r.getStreetAddress() + " \nCity: " + r.getCity() + " \nProvince: " + r.getProvince() + " \nPostal Code: " + r.getPostalCode()); //Prints a student record in a nice format.
	}

	/**
	 * Prints all of the student records in the ArrayList.
	 */
	public static void printRecords() {
		for (int i = 0; i < studRecs.size(); i++) {
			printRecord(studRecs.get(i)); //Calls the printRecord method for each student record.
			System.out.println();
		}
	}

	/**
	 * Saves all of the student records in memory to a file.
	 */
	public static void saveFile() {
		String key = "database.txt"; //The default file is "database.txt".
		int choice = -1;
		System.out.println("The default file is " + "'" + key + "'. Do you want to save to a different file?");
		System.out.println("Enter '1' - Yes");
		System.out.println("Enter '2' - No");

		while ((choice != 1)&&(choice != 2)) { //If the input is not one of the given options, the prompt is looped.
			do {
				try {
					error = false;
					choice = sc.nextInt();
				}catch(Exception e) {
					error = true;
					System.err.println(e.getMessage());
				}
			}while(error == true);
		}

		if (choice == 1) { //A different file is used.
			System.out.println("Enter the name of the file (must end with .txt):");
			do {
				try {
					error = false;
					String userFile = sc.next(); //The user is prompted for another file to save to.
					File file = new File(userFile);
					PrintStream fps = new PrintStream(file);
					fps.println(studRecs.size());
					for (int i = 0; i < studRecs.size(); i++) {
						fps.println(studRecs.get(i).toString());
					}
					fps.close();	
				} catch (FileNotFoundException e) {
					error = true;
					System.err.println(e.getMessage());
					System.out.println("Enter the name of the file (must end with .txt):");
				}
			} while (error == true);
		}

		else if (choice == 2) { //The default file is used.
			try {
				File file = new File("database.txt");
				PrintStream fps = new PrintStream(file);
				fps.println(studRecs.size());
				for (int i = 0; i < studRecs.size(); i++) { //Converts each student record into a string with each field separated by a comma.
					fps.println(studRecs.get(i).toString());
				}
				fps.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Loads student records from a file to the ArrayList in memory.
	 * @throws NumberFormatException
	 * @throws InvalidInputException
	 */
	public static void loadFile() throws NumberFormatException, InvalidInputException {
		String key = "database.txt"; //The default file is "database.txt".
		int choice = -1;
		System.out.println("The default file is " + "'" + key + "'. Do you want to load from a different file?");
		System.out.println("Enter '1' - Yes");
		System.out.println("Enter '2' - No");

		while ((choice != 1)&&(choice != 2)) { //If the input is not one of the given options, the prompt is looped.
			do {
				try {
					error = false;
					choice = sc.nextInt();
				}catch(Exception e) {
					error = true;
					System.err.println(e.getMessage());
					sc.nextLine();
				}
			}while(error == true);
		}
		sc.nextLine();

		if (choice == 1) { //A different file is used.
			System.out.println("Enter the name of the file (must end with .txt):");
			do {
				try {
					error = false;
					String userFile = sc.next(); //The user is prompted for another file to load from.
					File file = new File(userFile);
					Scanner fscan = new Scanner(file);
					int size = fscan.nextInt();
					fscan.nextLine();
					for(int i = 0; i < size; i++) {
						String input = fscan.nextLine();
						String [] data = input.split(","); //The fields from the file are separated by splitting.
						Student s = new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], Integer.parseInt(data[10])); ////Uses the constructor in the Student class to create a record.
						studRecs.add(s); //Adds the student record to the ArrayList.
					}
					fscan.close();
				} catch (FileNotFoundException e) {
					error = true;
					System.err.println(e.getMessage());
					System.out.println("Enter the name of the file (must end with .txt):");
				}
			} while (error == true);

		}

		else if (choice == 2) { //The default file is used.
			try {
				error = false;
				File file = new File(key);
				Scanner fscan = new Scanner(file);
				int size = fscan.nextInt();
				fscan.nextLine();
				for(int i = 0; i < size; i++) {
					String input = fscan.nextLine();
					String [] data = input.split(","); //The fields from the file are separated by splitting.
					Student s = new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], Integer.parseInt(data[10])); //Uses the constructor in the Student class to create a record.
					studRecs.add(s); //Adds the student record to the ArrayList.
				}
				fscan.close();
			} catch (FileNotFoundException e) {
				error = true;
				e.printStackTrace();
			}
		}
	}
}


