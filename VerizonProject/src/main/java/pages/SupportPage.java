package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import generalMethods.ProjectMethods;

public class SupportPage extends ProjectMethods
{
	public SupportPage() {
		PageFactory.initElements(driver, this);
	}

}
