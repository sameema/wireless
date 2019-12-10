package sample.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerizonHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://vzw.com");
		driver.manage().window().maximize();
		

	}

}
