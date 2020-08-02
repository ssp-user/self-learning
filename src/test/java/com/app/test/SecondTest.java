package com.app.test;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(groups = {"sanity","regression"})
	public void anotherTestCase(){
		System.out.println("************************Second Test File - Another Test Case************************");
		
	}
	
	@Test(groups = {"sanity","regression"})
	public void insidesecondTestCase(){
		System.out.println("************************Second Test file - inside Second Test Case************************");
	}	

}
