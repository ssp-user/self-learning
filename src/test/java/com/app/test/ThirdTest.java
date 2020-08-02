package com.app.test;

import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(groups = {"sanity","regression"})
	public void anotherTestCase(){
		System.out.println("************************Third Test File - Another Test Case************************");
		
	}
	
	@Test(groups = {"sanity","regression"})
	public void insidesecondTestCase(){
		System.out.println("************************Third Test file - inside Second Test Case************************");
	}	

}
