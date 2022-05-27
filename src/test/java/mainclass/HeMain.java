package mainclass;

import org.testng.annotations.Test;

import module.Login;
import module.UpdateorganizationDetails;





public class HeMain  {
	@Test
	public static void main(String[] args) throws InterruptedException {
		Login lo = new Login();
		lo.Loginuser();
		
		/*UpdateorganizationDetails uport = new UpdateorganizationDetails();
		uport.organizationedit();*/
		
	}
	
	

}
