package flipkartbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractise/");
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().getText();
	}
	

}
