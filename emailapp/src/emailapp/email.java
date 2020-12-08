package emailapp;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="company.com";
	
	
	public email() {
		this.department=setDepartment();
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		this.password=randomPassword(defaultPasswordLength); 
	}
	private String setDepartment() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		firstName=input.nextLine();
		System.out.println("");
		System.out.println("Enter your last name");
		lastName=input.nextLine();
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		
		int depChoice=input.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "development";}
		else if(depChoice==3) {return "accounting";}
		else if(depChoice==0){return "Bye Bye";}
		else {return "There is no other department number";}
	}
	private String randomPassword(int length) {
		 String passwordSet="ABCDEFGHİJKLMNOPRSTUWVYZ!@#$%";
		char[] password= new char[length];
		for(int i=0;i<length;i++) {
		int random=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(random);
		}
		return new String(password);
	}
	public void setEmailCapacity(int capacity) {
		 this.mailboxCapacity=capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display Name: "+firstName + " " +lastName+
				"\nCompany Email: "+email+
				"\nMailbox Capacity: "+mailboxCapacity+"mb";
	}


}

