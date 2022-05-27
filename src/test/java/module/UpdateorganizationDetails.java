package module;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import locators.UpdateorganizationLoc;

public class UpdateorganizationDetails extends UpdateorganizationLoc {
	@Test
	public void organizationedit() {
		
		
		UpdateorganizationLoc ee= new UpdateorganizationLoc();
		System.out.println(ee.getCountrydropdown());
		
		UpdateorganizationDetails l2 = new UpdateorganizationDetails();

		WebElement countryd = l2.getCountrydropdown();
		System.out.println(countryd);
		clickbutton(countryd);
		WebElement countryn = l2.getCountryname();
		sendkey(countryn, "China"+Keys.ARROW_DOWN.ENTER);
		
		
		WebElement add1 = l2.getAddress1();
		add1.clear();
		sendkey(add1, "Indira nagar");
		
		WebElement add2 = l2.getAddress2();
		add2.clear();
		sendkey(add2, "Ponneri");
		
		WebElement stated = l2.getStatedropdown();
		clickbutton(stated);
		WebElement staten = l2.getStatename();
		staten.clear();
		sendkey(staten, "Anhui"+Keys.ARROW_DOWN.ENTER);
		
		
		WebElement cityd = l2.getCitydropdown();
		clickbutton(cityd);
		WebElement cityn = l2.getCityname();
		sendkey(cityn, "Liuan"+Keys.ARROW_DOWN.ENTER);
		
		WebElement pin = l2.getPincode();
		pin.clear();
		sendkey(pin, "96004455");
		
		WebElement industry = l2.getIndustrydropdown();
		clickbutton(industry);
		WebElement indsname = l2.getIndustryname();
		sendkey(indsname, "Gaming"+Keys.ARROW_DOWN.ENTER);
		
		
		WebElement buss = l2.getBussniessdropdown();
		clickbutton(buss);
		WebElement bussna = l2.getBussniessname();
		sendkey(bussna, "Sports Agent"+Keys.ARROW_DOWN.ENTER);
		
		
		

	}
	

}
