package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import generalMethods.ProjectMethods;

public class DealsPage extends ProjectMethods
{
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}

}
