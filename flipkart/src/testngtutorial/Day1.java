package testngtutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void Demo() {
		System.out.println("hello");//automation
	}
	@Test
	public void secondTest() {
		System.out.println("bye");
		
	}
	@AfterSuite
	public void aftertest() {
		System.out.println("iam lastmann a row");
		
	}

}
