package com.fdm.model;

import java.util.Scanner;

public class RegView implements View{
	
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	Scanner scanner;
	
	public RegView(Scanner scanner){
		this.scanner = scanner;
	}
	
	
	public String getUsername(){
		
		System.out.println("Enter username: ");
		username = scanner.nextLine();
		return username; 
	}
	
	public String getPassword() {
		System.out.println("Enter password: ");
		password = scanner.nextLine();
		return password; 
	}
	
	public String getFirstname() {
		System.out.println("Enter firstname: ");
		firstname = scanner.nextLine();
		return firstname; 
	}
	
	public String getLastname() {
		System.out.println("Enter lastname: ");
		lastname = scanner.nextLine();
		return lastname; 
	}


	@Override
	public String getUserInput() {
		String userdetails;
		userdetails = getUsername()+" "+ getPassword()+" "+getFirstname()+" "+getLastname();
		return userdetails;
	}


	

}
