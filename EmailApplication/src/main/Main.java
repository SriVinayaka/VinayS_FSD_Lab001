package main;

import com.greatlearning.email_app.EmailApplication;
import com.greatlearning.email_app.Employee;

/**
 *
 * Developed By Vinay S of IITR FSD November 2023 Batch
 * 03DEC2023
 */

/**
 *  // Main Java Program //
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new EmailApplication().init();
		
		System.out.println("Dear " + emp.getFirstName() + ", your generated credentials are as follows");
		System.out.println("Email    ---> " + emp.getEmailAddress());
		System.out.println("Password ---> " + emp.getPassword());

	}

}
