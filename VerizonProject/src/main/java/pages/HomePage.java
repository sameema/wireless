package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import cucumber.api.java.en.Given;
import generalMethods.ProjectMethods;

public class HomePage extends ProjectMethods
{
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Wireless") WebElement eleTopMenu;
	@FindBy(how=How.NAME, using="Phones list") WebElement elePhonesMenu;
	@FindBy(how=How.NAME, using="Plans list") WebElement elePlansMenu;
	@FindBy(how=How.NAME, using="Holiday Deals list") WebElement eleDealsMenu;
	@FindBy(how=How.NAME, using="Shop list") WebElement eleShopMenu;
	@FindBy(how=How.NAME, using="Support list") WebElement eleSupportMenu;
	@FindBy(how=How.NAME, using="5G list") WebElement ele5GMenu;



	public HomePage clickWireless()
	{
		click(eleTopMenu);
		return new HomePage();
	}
	
	public HomePage clickPhones()
	{
		click(elePhonesMenu);
		return new SmartphonesPage();
	}
	
	public HomePage clickPlans()
	{
		click(elePlansMenu);
		return new PlansPage();
	}
	
	public HomePage clickDeals()
	{
		click(eleDealsMenu);
		return new DealsPage();
	}
	
	public HomePage clickShop()
	{
		click(eleShopMenu);
		return new ShopPage();
	}
	
	public HomePage clickSupport()
	{
		click(eleSupportMenu);
		return new SupportPage();
	}
	
	public HomePage click5G()
	{
		click(ele5GMenu);
		return new FiveGPage();
	}

}
