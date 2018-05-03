package zahid;
/**
 * Student.java
 * This class will store data for an individual student.
 * April 12, 2018
 * @author Rohan Zahid
 *
 */
public class Student {
	/**
	 * Sets values for the student record.
	 * @param firstName the first Name to set
	 * @param lastName the lastName to set
	 * @param middleInitials the middleInitials to set
	 * @param phoneNumber the phone number to set
	 * @param email the email to set
	 * @param streetAddress the streetAddress to set
	 * @param city the city to set
	 * @param province the province to set
	 * @param postalCode the postalCode to set
	 * @param studentNumber the student number to set
	 */
	private String lastName, firstName, middleInitials, email, streetAddress, city, province, postalCode, phoneNumber, studentNumber;
	private int grade;// phoneNumber;


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
	public Student(String firstName, String lastName) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	public Student() {
		super();

	}
	public Student(String firstName, String lastName, String middleInitials, String email, String streetAddress, String city, String province) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleInitials(middleInitials);
		this.setEmail(email);
		this.setStreetAddress(streetAddress);
		this.setCity(city);
		this.setProvince(province);
		//this.setPostalCode(postalCode);
	}
	/**
	 * Returns the first name of this Student
	 * @return the firstName 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the Student
	 * @param firstName the first Name to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of this Student
	 * @return the lastName 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the Student
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * Returns the middle initials of this Student
	 * @return the middleInitials
	 */
	public String getMiddleInitials() {
		return middleInitials;
	}

	/**
	 * Sets the middleInitials of this Student
	 * @param middleInitials the middleInitials to set
	 */
	public void setMiddleInitials(String middleInitials) {
		this.middleInitials = middleInitials;
	}
	/**
	 * Returns the student number of this Student
	 * @return the studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * Sets the student number of this Student
	 * @param studentNumber the student number to set
	 */
	public void setStudentNumber(String studentNumber) throws InvalidInputException {
		if (studentNumber.length()!=9) {
			throw new InvalidInputException("Please enter a 9-digit student number.");
		}
		this.studentNumber = studentNumber;
	}
	/**
	 * Returns the grade of this Student
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * Sets the grade of this Student
	 * @param grade the grade to set
	 * @throws InvalidInputException 
	 */
	public void setGrade(int grade) throws InvalidInputException {
		if (grade < 9||grade > 12) {
			throw new InvalidInputException("Please enter a grade between 9 and 12.");
		}
		this.grade = grade;
	}
	/**
	 * Returns the phoneNumber of this Student
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * Sets the phone number of this Student
	 * @param phoneNumber the phone number to set
	 */
	public void setPhoneNumber(String phoneNumber) throws InvalidInputException{
		if(phoneNumber.length() !=10) {
			throw new InvalidInputException("Please enter a 10-digit phone number.");
		}
		this.phoneNumber = phoneNumber;

	}
	/**
	 * Returns the email of this Student
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of this Student
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Returns the street address of this Student
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the street address of this Student
	 * @param streetAddress the street address to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * Returns the city of this Student
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city of this Student
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Returns the province of this Student
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Sets the province of this Student
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		postalCode = postalCode.replaceAll(" ", "");
		province = province.toUpperCase();
		if(!(province.equals("AB"))||!(province.equals("BC"))||!(province.equals("MB"))||!(province.equals("NB"))||!(province.equals("NL"))||!(province.equals("NT"))||!(province.equals("NS"))||!(province.equals("NU")))//
		this.province = province;
	}
	/**
	 * Returns the postal code of this Student
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets the postal code of this Student
	 * @param postalCode the postal code to set
	 * @throws InvalidInputException 
	 */
	public void setPostalCode(String postalCode) throws InvalidInputException {
		postalCode = postalCode.replaceAll(" ", "");
		postalCode = postalCode.toUpperCase();
		if(postalCode.length() !=6) {
			throw new InvalidInputException("Please enter a valid postal code.");
		}
		if((Character.isDigit(postalCode.charAt(0))!=false)||(Character.isDigit(postalCode.charAt(1))!=true)||(Character.isDigit(postalCode.charAt(2))!=false)||(Character.isDigit(postalCode.charAt(3))!=true)||(Character.isDigit(postalCode.charAt(4))!=false)||(Character.isDigit(postalCode.charAt(5))!=true)) {
			throw new InvalidInputException("Please enter a valid postal code.");
		}
		this.postalCode = postalCode;
	}
	public String toString () {
		return firstName + "," + lastName + "," + middleInitials + "," + email + "," + streetAddress + "," + city + "," + province + "," + postalCode + "," + studentNumber + "," + phoneNumber + "," + grade; 
	}




}