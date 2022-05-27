package module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import locators.Loginloc;

public class Login extends Loginloc {

	//public class Loginuser extends Loginloc {

		@Test

		public void Loginuser() throws InterruptedException {

			openChrome();
			driver.get(
					"https://demohighengage.auth.us-east-1.amazoncognito.com/login?client_id=558k44p713kem7rnik0l0ds6hm&response_type=token&scope=aws.cognito.signin.user.admin+email+openid+phone+profile&redirect_uri=https://highengage.com/register/welcome.html");
			driver.manage().window().maximize();

			Loginloc l1 = new Loginloc();

			WebElement emai = l1.getUsername();
			sendkey(emai, "nomorearif123@yopmail.com");

			WebElement pass = l1.getPassword();
			sendkey(pass, "Arif@12345");

			WebElement signbutton = l1.getSign();
			signbutton.click();

			
			Thread.sleep(6000);
			/*WebElement setting = l1.getsettingicoclick();
			setting.click();*/
			
			driver.findElement(By.xpath("//a[@href='#/setup']")).click();
			
			Thread.sleep(9000);
			
			WebElement edit = l1.getediticonclick();

			edit.click();
			
			WebElement countryd = l1.getCountrydropdown();
			countryd.click();
			/*System.out.println(countryd);
			clickbutton(countryd);*/
			WebElement countryn = l1.getCountryname();
			sendkey(countryn, "China"+Keys.ARROW_DOWN.ENTER);
			
			
			WebElement add1 = l1.getAddress1();
			add1.clear();
			sendkey(add1, "Indira nagar");
			
			WebElement add2 = l1.getAddress2();
			add2.clear();
			sendkey(add2, "Ponneri");
			
			
			/*WebElement stated = l1.getStatedropdown();
			clickbutton(stated);
			WebElement staten = l1.getStatename();
			staten.clear();
			sendkey(staten, "Anhui"+Keys.ARROW_DOWN.ENTER);
			
			
			WebElement cityd = l1.getCitydropdown();
			clickbutton(cityd);
			WebElement cityn = l1.getCityname();
			sendkey(cityn, "Liuan"+Keys.ARROW_DOWN.ENTER);*/
			
			
		}
	}
