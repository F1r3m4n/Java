package com.fdm.model;

public class RegValidator {

	Storage storage;
	User user;

	public RegValidator(Storage storage){
		this.storage = storage;
	}


	public boolean validate(String string) {

		String[] teststring = string.split(" ");

		if (checkUsername(teststring[0]) && checkPassword(teststring[1]) && checkFirstname(teststring[2]) && checkLastname(teststring[3])){
			return true;
		}
		else
			return false;
	}


	public boolean checkUsername(String testusername){
		if(storage.get(testusername)!=null){
			return false;
		}

		return true;
	}



	public boolean checkPassword(String testpassword){
		if(testpassword.length()>7 && testpassword.matches(".*\\d.*")){
			return true;
		}
		else return false;
	}

	public boolean checkFirstname(String testfirstname){
		if(testfirstname.length()>0){
			return true;
		}
		return false;
	}

	public boolean checkLastname(String testlastname){
		if(testlastname.length()>0){
			return true;
		}
		return false;
	}



}
