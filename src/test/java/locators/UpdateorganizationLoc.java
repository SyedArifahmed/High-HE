package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base2.Base1;

public class UpdateorganizationLoc extends Base1 {
	
	@FindBy(xpath = "(//div[@role='button'])[1]")
	private WebElement countrydropdown;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement countryname;
	
	@FindBy(xpath = "//textarea[@formcontrolname='address1']")
	private WebElement address1;
	
	@FindBy(xpath = "//textarea[@formcontrolname='address2']")
	private WebElement address2;
	
	@FindBy(xpath = "(//div[@role='button'])[2]")
	private WebElement Statedropdown;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement statename;
	
	@FindBy(xpath = "(//div[@role='button'])[3]")
	private WebElement citydropdown;
	
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement cityname;
	

	
	public WebElement getCountrydropdown() {
		return countrydropdown;
	}


	public WebElement getCountryname() {
		return countryname;
	}


	public WebElement getAddress1() {
		return address1;
	}


	public WebElement getAddress2() {
		return address2;
	}


	public WebElement getStatedropdown() {
		return Statedropdown;
	}


	public WebElement getStatename() {
		return statename;
	}


	public WebElement getCitydropdown() {
		return citydropdown;
	}


	public WebElement getCityname() {
		return cityname;
	}


	public WebElement getPincode() {
		return pincode;
	}


	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}


	public WebElement getIndustryname() {
		return industryname;
	}


	public WebElement getBussniessdropdown() {
		return bussniessdropdown;
	}


	public WebElement getBussniessname() {
		return bussniessname;
	}


	@FindBy(xpath = "//input[@formcontrolname='zipCode']")
	private WebElement pincode;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement industrydropdown;
	
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement industryname;

	
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement bussniessdropdown;
	
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement bussniessname;
}
