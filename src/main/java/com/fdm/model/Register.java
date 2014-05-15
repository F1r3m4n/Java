package com.fdm.model;

public class Register {

	
	Storage storage;
	User user;
	
	public Register(Storage storage){
		this.storage = storage;
	}
	
	public void registerUser(String userdetails) {
		user = createUser(userdetails);
		storage.add(user);
	}
	
	
	public User createUser(String userdetails){
		
		String[] details = userdetails.split(" ");
		User user = new User();
		user.setUsername(details[0]);
		user.setPassword(details[1]);
		user.setFirstname(details[2]);
		user.setLastname(details[3]);
		return user;
		
	}



}
