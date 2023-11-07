package com.loginpage;

import java.util.ResourceBundle;

public class loginprogram {
	
	public int checkLogin(String un, String pwd)
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		
		String user = rb.getString("username");
		String pass = rb.getString("password");
		
		if(user.equals(un) && pass.equals(pwd))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}