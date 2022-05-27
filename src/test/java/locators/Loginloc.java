package locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base2.Base1;


public class Loginloc extends Base1 {
	
	
	public Loginloc() {
		
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "(//input[@name='username'])[2]")
	private WebElement username;

	@FindBy(xpath = "(//input[@class='form-control inputField-customizable'])[5]")
	private WebElement password;

	@FindBy(xpath = "(//input[@aria-label='submit'])[2]")
	private WebElement sign;

	@FindBy(xpath = "(//a[@aria-expanded='false'])[6]]")
	private WebElement settingicoclick;
	
	@FindBy(xpath = "//span[@class='p-element org-setup-edit-section']")
	private WebElement editiconclick;
	
	
	@FindBy(xpath = "(//div[@role='button'])[1]")
	private WebElement countrydropdown;
	
	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public void setCountrydropdown(WebElement countrydropdown) {
		this.countrydropdown = countrydropdown;
	}

	public WebElement getCountryname() {
		return countryname;
	}

	public void setCountryname(WebElement countryname) {
		this.countryname = countryname;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public void setAddress1(WebElement address1) {
		this.address1 = address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public void setAddress2(WebElement address2) {
		this.address2 = address2;
	}

	public WebElement getStatename() {
		return statename;
	}

	public void setStatename(WebElement statename) {
		this.statename = statename;
	}

	public WebElement getCitydropdown() {
		return citydropdown;
	}

	public void setCitydropdown(WebElement citydropdown) {
		this.citydropdown = citydropdown;
	}

	public WebElement getCityname() {
		return cityname;
	}

	public void setCityname(WebElement cityname) {
		this.cityname = cityname;
	}


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
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		return sign;
	}
	public WebElement getsettingicoclick() {
		return settingicoclick;
	}
	
	public WebElement getediticonclick() {
		return editiconclick;
	}

	public WebElement getStatedropdown() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
