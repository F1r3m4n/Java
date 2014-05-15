package com.fdm.model;

public class User {
	
	
	//Variables
	
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	
	

	
	
	//Getters
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public String getFirstname(){
		return firstname;
	}
	public String getLastname(){
		return lastname;
	}
	
//Setters
	public void setUsername(String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setFirstname(String firstname){
		this.firstname=firstname;
	}
	public void setLastname(String lastname){
		this.lastname=lastname;
	}

}
