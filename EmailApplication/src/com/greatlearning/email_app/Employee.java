/**
 * 
 */
package com.greatlearning.email_app;

/**
 * 
 */
public class Employee {
	
	private static final String company = "greatlearning";
	private String firstName;
	private String lastName;
	private int department;
	private String emailAddress;
	private String password;
	
	Employee(String firstName, String lastName, int department, String emailAddress, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the department
	 */
	public int getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(int department) {
		this.department = department;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the company
	 */
	public static String getCompany() {
		return company;
	}
	


}
