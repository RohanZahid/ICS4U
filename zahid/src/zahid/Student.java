package zahid;

import java.util.Collections;
import java.util.Scanner;

/**
 * Student.java
 * This class will store data for an individual student.
 * May 7, 2018
 * @author Rohan Zahid
 *
 */
public class Student implements Comparable <Student>{
	Scanner sc = new Scanner(System.in);
	private String lastName, firstName, middleInitials, email, streetAddress, city, province, postalCode, phoneNumber, studentNumber;
	private int grade;

	/**
	 * Constructs a new student record that stores student information.
	 * @param firstName - the first name of the student to set
	 * @param lastName - the last name of the student to set
	 * @param middleInitials - the middle initials of the student to set
	 * @param phoneNumber - the phone number of the student to set
	 * @param email - the email address of the student to set
	 * @param streetAddress - the street address of the student to set
	 * @param city - the city of the student to set
	 * @param province - the province of the student to set
	 * @param postalCode - the postal code of the student to set
	 * @param studentNumber - the student number of the student to set
	 */
	public Student(String firstName, String lastName, String middleInitials, String email, String streetAddress, String city, String province, String postalCode, String studentNumber, String phoneNumber, int grade) throws InvalidInputException {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleInitials(middleInitials);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
		this.setStreetAddress(streetAddress);
		this.setCity(city);
		this.setProvince(province);
		this.setPostalCode(postalCode);
		this.setStudentNumber(studentNumber);
		this.setGrade(grade);
	}

	/**
	 * Constructs a new student record that stores student information.
	 * @param firstName - the first name of the student to set
	 * @param lastName - the last name of the student to set
	 */
	public Student(String firstName, String lastName) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	/**
	 * Constructs a new student record that stores student information.
	 */
	public Student() {
		super();

	}

	/**
	 * Constructs a new student record that stores student information.
	 * @param firstName - the first name of the student to set
	 * @param lastName - the last name of the student to set
	 * @param middleInitials - the middle initials of the student to set
	 * @param streetAddress - the street address of the student to set
	 * @param city - the city of the student to set
	 */
	public Student(String firstName, String lastName, String middleInitials, String streetAddress, String city) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleInitials(middleInitials);
		this.setStreetAddress(streetAddress);
		this.setCity(city);
	}

	/**
	 * Returns the first name of this student
	 * @return firstName 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the student
	 * @param firstName - the first name to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of this student
	 * @return lastName 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the student
	 * @param lastName - the last name to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the middle initials of this student
	 * @return middleInitials
	 */
	public String getMiddleInitials() {
		return middleInitials;
	}

	/**
	 * Sets the middle initials of this student
	 * @param middleInitials - the middle initials to set
	 */
	public void setMiddleInitials(String middleInitials) {
		this.middleInitials = middleInitials;
	}

	/**
	 * Returns the student number of this student
	 * @return studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * Sets the student number of this student
	 * @param studentNumber - the student number to set
	 */
	public void setStudentNumber(String studentNumber) throws InvalidInputException {
		if (studentNumber.length() != 9) { //Valid student numbers are 9 characters in length.
			throw new InvalidInputException("Please enter a 9-digit student number.");
		}
		if((Character.isDigit(studentNumber.charAt(0)) == false)||(Character.isDigit(studentNumber.charAt(1)) == false)||(Character.isDigit(studentNumber.charAt(2)) == false)||(Character.isDigit(studentNumber.charAt(3)) == false)||(Character.isDigit(studentNumber.charAt(4)) == false)||(Character.isDigit(studentNumber.charAt(5)) == false)||(Character.isDigit(studentNumber.charAt(6)) == false)||(Character.isDigit(studentNumber.charAt(7)) == false)||(Character.isDigit(studentNumber.charAt(8)) == false)) { //Valid student numbers have 9 digits.
			throw new InvalidInputException("Please enter a valid student number.");
		}
		this.studentNumber = studentNumber;
	}

	/**
	 * Returns the grade of this student
	 * @return grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * Sets the grade of this student
	 * @param grade - the grade to set
	 * @throws InvalidInputException 
	 */
	public void setGrade(int grade) throws InvalidInputException {
		if (grade < 9 || grade > 12) { //Valid grades are between 9 and 12.
			throw new InvalidInputException("Please enter a grade between 9 and 12.");
		}
		this.grade = grade;
	}

	/**
	 * Returns the phoneNumber of this student
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number of this student
	 * @param phoneNumber - the phone number to set
	 */
	public void setPhoneNumber(String phoneNumber) throws InvalidInputException{
		if(phoneNumber.length() != 10) { //Valid phone numbers are 10 characters in length.
			throw new InvalidInputException("Please enter a 10-digit phone number.");
		}
		if((Character.isDigit(phoneNumber.charAt(0)) == false)||(Character.isDigit(phoneNumber.charAt(1)) == false)||(Character.isDigit(phoneNumber.charAt(2)) == false)||(Character.isDigit(phoneNumber.charAt(3)) == false)||(Character.isDigit(phoneNumber.charAt(4)) == false)||(Character.isDigit(phoneNumber.charAt(5)) == false)||(Character.isDigit(phoneNumber.charAt(6)) == false)||(Character.isDigit(phoneNumber.charAt(7)) == false)||(Character.isDigit(phoneNumber.charAt(8)) == false)||(Character.isDigit(phoneNumber.charAt(9)) == false)) { //Valid phone numbers have 10 digits. 
			throw new InvalidInputException("Please enter a valid phone number.");
		}
		this.phoneNumber = phoneNumber;

	}

	/**
	 * Returns the email address of this student
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of this student
	 * @param email - the email address to set
	 * @throws InvalidInputException 
	 */
	public void setEmail(String email) throws InvalidInputException {
		int atCount = 0; //Counter for the number of '@'s.
		int dotCount = 0; //Counter for the number of periods.
		for (int i = 0; i < email.length(); i++){
			if(email.charAt(i) == '@') {
				atCount++;
			}
			if(email.charAt(i) == '.') {
				dotCount++;
			}
		}
		if(atCount < 1 || atCount > 1 || dotCount < 1) { //Valid email addresses must have an '@' and a period. More than one '@' is not allowed but more periods are.
			throw new InvalidInputException("Please enter a valid email address.");
		}
		this.email = email;
	}

	/**
	 * Returns the street address of this student
	 * @return streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the street address of this student
	 * @param streetAddress - the street address to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Returns the city of this student
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city of this student
	 * @param city - the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the province of this student
	 * @return province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Sets the province of this student
	 * @param province - the province to set
	 * @throws InvalidInputException 
	 */
	public void setProvince(String province) throws InvalidInputException {
		province = province.replaceAll(" ", ""); //Makes sure that there are no spaces. 
		province = province.toUpperCase(); //Makes the string upper case so that the formatting is consistent.
		if(!(province.equals("AB"))&&!(province.equals("BC"))&&!(province.equals("MB"))&&!(province.equals("NB"))&&!(province.equals("NL"))&&!(province.equals("NT"))&&!(province.equals("NS"))&&!(province.equals("NU"))&&!(province.equals("ON"))&&!(province.equals("PE"))&&!(province.equals("QC"))&&!(province.equals("SK"))&&!(province.equals("YT"))) { //Valid provinces/territories must have the correct short form. If the input is not one of the options, an exception is thrown.
			throw new InvalidInputException("Please enter a valid province/territory.");
		}
		this.province = province;
	}

	/**
	 * Returns the postal code of this student
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets the postal code of this student
	 * @param postalCode - the postal code to set
	 * @throws InvalidInputException 
	 */
	public void setPostalCode(String postalCode) throws InvalidInputException {
		postalCode = postalCode.replaceAll(" ", "");
		postalCode = postalCode.toUpperCase();
		if(postalCode.length() != 6) { //Valid postal codes are 6 characters in length.
			throw new InvalidInputException("Please enter a valid postal code.");
		}
		if((Character.isDigit(postalCode.charAt(0)) != false)||(Character.isDigit(postalCode.charAt(1)) != true)||(Character.isDigit(postalCode.charAt(2)) != false)||(Character.isDigit(postalCode.charAt(3)) != true)||(Character.isDigit(postalCode.charAt(4)) != false)||(Character.isDigit(postalCode.charAt(5)) != true)) { //Valid postal codes have letters for the first, third, and fifth characters, and have numbers for the second and fourth, and sixth characters. If the input is not one of the options, an exception is thrown.
			throw new InvalidInputException("Please enter a valid postal code.");
		}
		this.postalCode = postalCode;
	}

	/**
	 * Converts a student record to a String so it can be saved into a file.
	 */
	public String toString () {
		return firstName + "," + lastName + "," + middleInitials + "," + email + "," + streetAddress + "," + city + "," + province + "," + postalCode + "," + studentNumber + "," + phoneNumber + "," + grade; //Converts a student record to a string by placing commas between each field.
	}

	/**
	 * Compares last names, first names, and student numbers to sort student records using the Collections.sort method.
	 */
	public int compareTo(Student r) {

		if ((this.lastName.compareTo(r.lastName) == 0) && (this.firstName.compareTo(r.firstName) == 0)) {
			return studentNumber.compareTo(r.studentNumber); //If last names and first names are the same, student records are sorted using student numbers.
		}
		else if (this.lastName.compareTo(r.lastName) == 0) {
			return firstName.compareTo(r.firstName); //If only last names are the same, student records are sorted using first names.
		}
		else {
			return lastName.compareTo(r.lastName); //Generally, student records are sorted using last names.
		}
	}
}