package stepDefination;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks{
  
     
	@Before
	public void beforeRegresionTest() {
		
		System.out.println("Before lanuch Browsser");
	}
	
	@After
     public void afterRegresionTest() {
    	
    	 
		
		System.out.println("Close the Browser");
	}
}
