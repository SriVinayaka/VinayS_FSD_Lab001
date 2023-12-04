package com.greatlearning.email_app;

import java.util.Scanner;

public class EmailApplication {
	
	Employee emp = null;
	
	public Employee init()
	{
		Scanner in = new Scanner(System.in);
		
		int department = 0;
		
		System.out.println("Enter the Employee First Name:");
		String firstName = in.nextLine();
		
		System.out.println("Enter the Employee Last Name:");
		String lastName = in.nextLine();
		
		boolean myflag = true;
		
		while(myflag)
		{
			System.out.println("Enter the Employee Department:");
			System.out.println("1 - Technical");
			System.out.println("2 - Admin");
			System.out.println("3 - Human Reource");
			System.out.println("4 - Legal");
			department = in.nextInt();
			
			if((department >= 1) && (department <= 4))
			{
				myflag = false;
				break;
			}
			else
			{
				System.out.println("\nPlease Enter Correct Employee Department\n");
				continue;
			}
		}
		String emailaddress = new CredentialsManagerServiceImpl().generateEmailAddress(firstName, lastName, department);
		
		String password = new CredentialsManagerServiceImpl().generatePassword();

		emp = new Employee(firstName, lastName, department, emailaddress, password);
		
		in.close();
		return emp;
	}
	
	
	
}
