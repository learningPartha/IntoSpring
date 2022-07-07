package com.webservlet;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("myWeb") && password.equals("webapp1")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
