package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import generalMethods.ProjectMethods;

public class TC001_HomePage extends ProjectMethods
{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_HomePage";
		testDescription ="Launching Verizon Url and checking the menus";
		testNodes = "Verizon Wireless";
		authors ="Sameema";
		category = "smoke";
	}
	
	@Test
	public void home() {
		new HomePage() 
		.clickPhones();
		}

}
