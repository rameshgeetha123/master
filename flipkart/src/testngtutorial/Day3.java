package testngtutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void webloginHomeLoan() {
		System.out.println("webloginHomeLoan");
		
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("mobileLoginHomeLoan");
	}
	@BeforeSuite
	public void BfSuite() {
		
		System.out.println("BfSuite iam no 1");
	}
	@Test
	public void mobileLoginHomeLoanOffer() {
		System.out.println("mobileLoginHomeLoanOffer");
	}
	
	
	@Test
	public void loginAPIHomeLoan() {
		
		System.out.println("loginAPIHomeLoan");
		
	}

}
