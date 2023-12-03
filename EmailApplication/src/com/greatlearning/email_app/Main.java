package com.greatlearning.email_app;


//
// This is a Sample Testing Main Java Class file
// Developed By Vinay S of IITR FSD November 2023 Batch
// 03DEC2023
//
//


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//testEmailAddressGeneration();
			//testGeneratePassword();
			Employee emp = new EmailApplication().init();
			
			System.out.println("Dear " + emp.getFirstName() + ", your generated credentials are as follows");
			System.out.println("Email    ---> " + emp.getEmailAddress());
			System.out.println("Password ---> " + emp.getPassword());


		
	}
	
	
	/*
	static void testEmailAddressGeneration()
	{
		String emailaddress = new CredentialsManagerServiceImpl().generateEmailAddress("Vinay", "Srinivasan", 1);
		System.out.println(emailaddress);
	}
	
	
	static void testGeneratePassword()
	{
		String password = new CredentialsManagerServiceImpl().generatePassword();
		System.out.println(password);
	}
	*/
	
}
