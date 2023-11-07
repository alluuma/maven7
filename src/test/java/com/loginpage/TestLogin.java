package com.loginpage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	
	@Test
	public void test1()
	{
		loginprogram l = new loginprogram();
		Assert.assertEquals(0, l.checkLogin("abc", "abc@123"));
	}
	
	
	@Test
	public void test2()
	{
		loginprogram l = new loginprogram();
		Assert.assertEquals(1, l.checkLogin("abc", "123456"));

		
	}

}