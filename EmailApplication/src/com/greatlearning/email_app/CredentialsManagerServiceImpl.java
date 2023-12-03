/**
 * 
 */
package com.greatlearning.email_app;

import java.util.Random;

/**
 * 
 */
public class CredentialsManagerServiceImpl implements ICredentialsManagerService {
	
	private static final String company = "greatlearning"; 
	private static final String domain = "com"; 
	

	@Override
	public String generateEmailAddress(String firstName, String lastName, int departmentCode) {
		// TODO Auto-generated method stub
		String department = "";
		if(departmentCode==1)
		{
			department = "tech";
		}
		else if (departmentCode == 2) {
			department = "adm";
		}
		else if(departmentCode == 3)
		{
			department = "hr";
		}
		else if(departmentCode == 4)
		{
			department = "lgl";
		}
		
		StringBuilder emailAddress = new StringBuilder();
		emailAddress.append(firstName.toLowerCase());
		emailAddress.append(".");
		emailAddress.append(lastName.toLowerCase());
		emailAddress.append("@");
		emailAddress.append(department);
		emailAddress.append(".");
		emailAddress.append(company);
		emailAddress.append(".");
		emailAddress.append(domain);
		
		
		return emailAddress.toString();
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		String s3 = "0123456789";
		String s4 = "~!@#$%^&*()-+{}[]|:;'<>,.?";
		
		StringBuilder passwordBuilder = new StringBuilder();
		
		for(int i = 1; i <= 2; i++)
		{
			Random rand = new Random();
			int randseed = rand.nextInt(s1.length());
			passwordBuilder.append(s1.charAt(randseed));
		}
		
		for(int i = 1; i <= 2; i++)
		{
			Random rand = new Random();
			int randseed = rand.nextInt(s2.length());
			passwordBuilder.append(s2.charAt(randseed));
		}

		for(int i = 1; i <= 2; i++)
		{
			Random rand = new Random();
			int randseed = rand.nextInt(s3.length());
			passwordBuilder.append(s3.charAt(randseed));
		}
		
		for(int i = 1; i <= 2; i++)
		{
			Random rand = new Random();
			int randseed = rand.nextInt(s4.length());
			passwordBuilder.append(s4.charAt(randseed));
		}


		return passwordBuilder.toString();
	}

	@Override
	public String displayGeneratedCredentials(String password) {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String displayGeneratedCredentials() {
		// TODO Auto-generated method stub
		return this.generatePassword();
	}

}
