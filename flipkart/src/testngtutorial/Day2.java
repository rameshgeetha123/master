package testngtutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void ploan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequiste() {
		System.out.println("i will execute first");
	}
	
	@AfterTest
	public void prerequisteLast() {
		System.out.println("i will execute Last");
	}

}
